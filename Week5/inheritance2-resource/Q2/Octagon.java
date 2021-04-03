public class Octagon implements Shape {
    private double side;

    public Octagon(double side){
        this.side = side;
    }

    public double getSide(){
        return side; 
    }

    public double getArea(){
        return Math.pow(side, 2) * (2 + 2 * (Math.sqrt(2))); 
    }

    public double getPerimeter(){
        return 8*side; 
    }

    public String toString(){
        return String.format("An octagon whose side is %.0f will have an area and perimeter of %.2f and %.0f respectively.", getSide(), getArea(), getPerimeter()); 
    }
}
