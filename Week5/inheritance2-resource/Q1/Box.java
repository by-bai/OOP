public class Box {
    private int length;
    private int breadth;
    private int height;
    
    public Box(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    public void setHeight(int height) {

    }

    public Box clone() {
        return new Box(length, breadth, height); 
    }
    public boolean equals(Object obj){ 
        if(!(obj instanceof Box)){
            return false;
        }
        Box another = (Box) obj;
        return another.height == height 
            && another.length == length 
            && another.breadth == breadth;
    }
    public String toString() {
        return String.format("height: %d, breadth: %d, length: %d", height, breadth, length); 
    }
}
