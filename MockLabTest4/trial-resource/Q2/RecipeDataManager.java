/*
 *
 * Name:
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


/*
 * RecipeDataManager is in charge of the data persistence of the Recipe objects.
 */
public class RecipeDataManager {
    private ArrayList<Recipe> recipeList;

    /*
     * This is the data file to read or write from
     */
    private final String FILE_NAME;

    /*
     * Creates a default instance that reads the data off the file having name filename
     */
    public RecipeDataManager(String fileName) {
        this.FILE_NAME = fileName;
        recipeList = new ArrayList<Recipe>();
        loadAll();
    }

    /*
     * reads from the data file and populates the recipeList attribute.
     * If there is an error reading the file, this method throws a DataException
     */
    private void loadAll() throws DataException {
        Scanner sc = new Scanner(System.in); 

        try(Scanner fileSc = new Scanner(new FileInputStream(FILE_NAME))) {
            fileSc.useDelimiter(",|\r\n|\n");

            fileSc.nextLine(); // skip header
            
            while (fileSc.hasNext()) { // 1 line
                String[] strings = fileSc.nextLine().split("#"); 
                // get name, cookingTime, price
                Recipe recipe = new Recipe(strings[0], Integer.parseInt(strings[5]), Double.parseDouble(strings[6])); 
                
                // get ingredients
                for (int i = 1; i < 5; i++) {
                    if (!(strings[i].equals(""))) {
                        recipe.addIngredient(strings[i]); 
                    }
                }

                recipeList.add(recipe); 
            }
        }catch (IOException e){
            throw new DataException(e);
        }
    }

    /*
     * returns all the recipe.
     */
    public ArrayList<Recipe> retrieveAll() {
        return recipeList;
    }

    /*
     * retrieves all Recipe objects whose cooking time exceeds(more than) cookingTime.
     */
    public ArrayList<Recipe> retrieve(int cookingTime) {
        // TODO!!!

        ArrayList<Recipe> res = new ArrayList<>(); 

        for (Recipe recipe : recipeList) {
            if (recipe.getCookingTime() > cookingTime) {
                res.add(recipe);
            }
        }

        return res;  
        
    }


    /*
     * if the recipe does not exist,
     *    1. adds the Recipe object to the recipeList attribute
     *    2. invoke the save() method to update the data file
     *
     * if the recipe exists, this method throws an IllegalArgumentException with message "recipe <name> exists"
     */
    public void addRecipe(String name, String[] ingredients, int cookingTime, double price) {
        // TODO!!!
        
        // 1.

        for (Recipe recipe : recipeList) {
            if (name.equals(recipe.getName())) {
                throw new IllegalArgumentException("recipe " + name + " exists"); 
            }
        }

        Recipe newRecipe = new Recipe(name, cookingTime, price);
        
        for (String ingredient : ingredients) {
            newRecipe.addIngredient(ingredient);
        }

        // for (int i = 0; i < ingredients.length; i++) {
        //     recipe.addIngredient(ingredients[i]); 
        // }
        recipeList.add(newRecipe); 

        save(); 
        
    }



    /*
     * Saves all the Recipe objects to a file called recipe.txt. It overwrites any
     * existing content.
     * If there is an error reading the file, this method throws a DataException
     */
    public void save() {
        // TODO
        
        // try (PrintStream out = new PrintStream(new FileOutputStream("recipe.txt", true))){ 
    
        //     for (Recipe recipe : recipeList) {
        //         String name = recipe.getName(); 
        //         int cookingTime = recipe.getCookingTime();
        //         double price = recipe.getPrice();
        //         int numIngredients = recipe.getNumIngredients();
        //         String ingredients = ""; 
        //         for (int i = 1; i == numIngredients; i++) {
        //             ingredients += recipe.getIngredient(i) + "#";
        //         }

        //         out.printf("%s#%s%d#%.2f%n", name, ingredients, cookingTime, price); 
        //         } 
        // }
        // catch (FileNotFoundException e) {
        //         e.printStackTrace();
            
        // } 
        try(FileWriter out = new FileWriter(FILE_NAME)){
            out.write("name#Ingredient1#Ingredient2#Ingredient3#Ingredient4#CookingTime#Price\n");
            String delimiter = "#";
            for (Recipe r: recipeList){
                String line = "";

                line += r.getName() + delimiter;

                int numIngredients = r.getNumIngredients();
                for (int i = 0; i < numIngredients; i++) {
                    line += r.getIngredient(i + 1) + delimiter;   // +1 becomes the method stores ingredient 1 at index 1
                }

                // if recipe contains less than 4 ingredients add empty ingredient
                for (int i = numIngredients; i < 4; i++) {
                    line += "#";
                }

                line += r.getCookingTime() + "#";
                line += r.getPrice();

                out.write(line + "\n");
            }

        }catch(IOException e){
            throw new DataException(e);
        }
    }
  

    


}