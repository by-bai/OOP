import java.util.*;

public class DepreciatingComparator extends ValuableComparator implements Comparator<Valuable> {

    @Override
    public int compare(Valuable a, Valuable b) {
        if (a instanceof Depreciating) {
            Depreciating c = (Depreciating) a;
        } else {
            c = a; 
        } 
        
        if (b instanceof Depreciating) {
            Depreciating d = (Depreciating) b; 
        } else {
            d = b;
        }
            
        if (c.getDepreciationRate() != d.getDepreciationRate()) {
            return Double.compare(c.getDepreciationRate(), d.getDepreciationRate());
        } else {
            if (a instanceof Depreciating) {
                
            }
        }
             
        }
        return -1;


    }
}