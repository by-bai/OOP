import java.util.ArrayList;
/**
 * Abstraction of a Recipe. A recipe is uniquely identified by its name.
 */
public class Recipe {
    private String name;
    private ArrayList<String> ingredientList;
    private int cookingTime;
    private double price;

    /**
     * Constructs a specific recipe
     * @param name the recipe's name
     * @param cookingTime time to cook this recipe
     * @param price the cost of this recipe
     */
    public Recipe(String name, int cookingTime, double price) {
        this.name = name;
        this.cookingTime = cookingTime;
        this.price = price;
        ingredientList = new ArrayList<String>();
    }

    /**
     * Gets the name
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the price
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Gets the cooking time
     * @return the cooking time
     */
    public int getCookingTime() {
        return cookingTime;
    }

    /**
     * Adds an ingredient needed to cook this recipe
     * @param ingredient the ingredient required
     */
    public void addIngredient(String ingredient) {
        ingredientList.add(ingredient);
    }


    /**
     * Gets the specific ingredient
     * @param num the the nth ingredient where n is a number between 1 to n
     * @return the name of the ingredient
     */
    public String getIngredient(int num) {
        if (num > 0 && num <= ingredientList.size()) {
            return ingredientList.get(num - 1);
        }
        return null;
    }

    /**
     * Returns the string representation of this recipe
     * @return the textual representation
     */
    public String toString() {
        return name;
    }

    /**
     * Gets the number of ingredients in this recipe
     * @return the number
     */
    public int getNumIngredients() {
        return ingredientList.size();
    }
}