public class Dish {

    private String name;
    //name has private access in Dish
    //need to write get methods below to access it publicly
    private double price;

    // constructor

    public Dish() { // remember: creates a NEW object; don't ever put STATIC here
        name = "nameless";
        price = 0; 
    }

    public Dish(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
   
    @Override
    public String toString(int x) {
        return "" + name + "" + price; 
    }
}

