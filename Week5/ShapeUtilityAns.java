import java.util.*; 

public class ShapeUtilityAns {
    public static Octagon getLargestOctagon(ArrayList<Shape> shapeList) {
        Octagon largestOctagon = null;
        double largestArea = 0; 

        if (shapeList.isEmpty()) {
            return largestOctagon; 
        }

        for (int i = 0; i < shapeList.size(); i++) {
         
            if (shapeList.get(i) instanceof Octagon){ 
                Octagon oct = (Octagon) shapeList.get(i); 
                if (oct.getArea() > largestArea) {
                    largestArea = oct.getArea();
                    largestOctagon = oct;    
                }
            }
            
        }
        return largestOctagon; 
    }    
}


public class ShapeUtility {
    public static Octagon getLargestOctagon(ArrayList<Shape> shapeList) {
        // Octagon largest = null;

        if (shapeList == null){
            return null; 
        }

        // for (Shape s : shapeList) {
        //     if (largest == null || s instanceof Octagon
        //                     && s.getArea() > largest.getArea()){
        //                         largest = s; 
        //                     }
        // }

        Shape largest = null;
        int i = 0;

        // for loop 1: look for largest
        // for loop 2: compare and override the largest
        for (; i < shapeList.size(); i++) {
            Shape s = shapeList.get(i);
            if (s instanceof Octagon) {
                largest = s;
            }
        }

        for (int start = i; start < shapeList.size(); start++) {
            Shape s = shapeList.get(start);
            if (s.intanceofOctagon && s.getArea() > largest.getArea()){
                largest = s;
            }
        }
        
        return (Octagon)largest; 
    }
}