//import java.awt.Shape;
import java.util.*;

public class ShapeUtility {
    public static Octagon getLargestOctagon(ArrayList<Shape> shapeList) {
        
        Octagon largestOctagon = null;
        double largestArea = 0.0;  

        if (shapeList == null || shapeList.isEmpty()) {
            return null; 
        }

        for (int i=0; i < shapeList.size(); i++){
            Shape s = shapeList.get(i);
            if (s instanceof Octagon) {
                Octagon o = (Octagon) s;  
                if (o.getArea() > largestArea) {
                    largestArea = o.getArea();
                    largestOctagon = o; 
                }
            }
            
        }

        return largestOctagon; 

        
    }

    public static ArrayList<Shape> getAllNonRectangles(ArrayList<Shape> shapeList) {
        ArrayList<Shape> arr = new ArrayList<>(); 
        if (shapeList == null || shapeList.isEmpty()) {
            return arr; 
        }

        for (int i = 0; i < shapeList.size(); i++) {
            Shape s = shapeList.get(i);
            if (s instanceof Rectangle) {
                arr.add(s); 
            }
        }

        return shapeList; 
    }

    public static ArrayList<Square> getAllSquareWithMinArea(ArrayList<Shape> shapeList, int minArea) {

        ArrayList<Square> arr = new ArrayList<>(); 

        if (shapeList == null || shapeList.isEmpty()) {
            return arr; 
        }

        for (int i = 0; i < shapeList.size(); i++) {
            Shape s = shapeList.get(i);
            if (s instanceof Square) {
                Square sq = (Square) s; 
                if (sq.getArea() >= minArea) {
                    arr.add(sq); 
                }
            }
        }

        return arr; 
    }

    public static ArrayList<Shape> getAllRectangleWithMinLength(ArrayList<Shape> shapeList, int length) {

        ArrayList<Shape> arr = new ArrayList<>(); 

        if (shapeList == null || shapeList.isEmpty()) {
            return arr; 
        }

        for (int i = 0; i < shapeList.size(); i++){
            Shape s = shapeList.get(i);
            if (s instanceof Rectangle) {
                Rectangle r = (Rectangle) s;
                if (r.getLength() >= length) {
                    arr.add(r); 
                }

            
            }
        }
        
        return arr;
    }
}