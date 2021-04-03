/**
 * Created by yeowleong on 16/5/14.
 */
public class Snack extends Product {
    private int numCalories = 50;
    private String brand;
    private int weight = 90;

    public Snack(String name, double price, int numCalories, String brand, int weight) {
        super(name, price);
        this.numCalories = numCalories;
        this.brand = brand;
        this.weight = weight;
    }

    public Snack(String name, double price, int numCalories, String brand) {
        super(name, price);
        this.numCalories = numCalories;
        this.brand = brand;
    }

    public Snack(String name, double price, String brand, int weight) {
        super(name, price);
        this.brand = brand;
        this.weight = weight;
    }

    public int getNumCalories() {
        return numCalories;
    }

    public String getBrand() {
        return brand;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return super.toString() + "[numCalories=" + getNumCalories() + ",brand=" + getBrand() + ",weight=" + getWeight() + "]";  
    }
	
}
