import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.nio.file.*;
import java.io.*;

public  class RecipeDataManagerTest {

    public static void main(String[] args) {
        // copy the original file and overwrite recipe.txt (which will be modified after you run this program)
        try {
            Files.copy(Paths.get("recipe-orig.txt"), Paths.get("recipe.txt"), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.out.println("error trying to reset data file");
            e.printStackTrace();
        }
        
        try {
            RecipeDataManager recipeDM = new RecipeDataManager("secret-recipe.txt");
        } catch (DataException e) {
            e.getCause().printStackTrace();
            System.out.println();
        }  

        RecipeDataManager recipeDM = new RecipeDataManager("recipe.txt");

        ArrayList<Recipe> recipes;
        
        System.out.println("All Recipes.");
        recipes = recipeDM.retrieveAll();
        print(recipes);
        System.out.println();

        recipes = recipeDM.retrieve(20);
        System.out.println("Recipes whose cooking time exceeds(more than) 20.");
        print(recipes);

        System.out.println();
        System.out.println("After add: ");
        recipeDM.addRecipe("Sandwich", new String[] {"bread", "bread", "tomato"}, 50, 123.4);
        
        
        recipes = recipeDM.retrieveAll();
        print(recipes);
        System.out.println();
        
        // this should throw an exception
        try {
            recipeDM.addRecipe("Sandwich", new String[] {"bread", "bread", "tomato"}, 50, 123.4);
            System.out.println("Incorrect - another Sandwich added.");
            System.out.println();
        } catch (IllegalArgumentException e) {
            System.out.println("Correct - cannot add another Sandwich.");
            System.out.println();
        }
        
        // load again
        System.out.println("Load again: ");
        recipeDM = new RecipeDataManager("recipe.txt");
        recipes = recipeDM.retrieveAll();
        print(recipes);

        System.out.println();        

    }
    
    private static void print(ArrayList<Recipe> recipes) {
        for (int i = 0; i < recipes.size(); i++) {
            Recipe r = recipes.get(i);
            System.out.print((i + 1) + ". " + r.getName() + "[ ");
            int size = r.getNumIngredients();
            for (int j = 1; j < size; j++) {
                System.out.print(r.getIngredient(j) + " + ");
            }
            System.out.println(r.getIngredient(size) + " ] ");      
        }
    } 
}
