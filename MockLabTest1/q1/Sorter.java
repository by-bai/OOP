import java.util.*;

/**
 * This class help to sort Staffs.
 */
public class Sorter implements Comparator<Staff> {

    // * r/s 
    private Criterion[] criterions; 

    public Sorter(Criterion[] criteria) {
        if (criteria == null || criteria.length == 0) 
            throw new IllegalArgumentException("invalid criteria");

        this.criterions = criteria; 

    }
    /**
     * Compare 2 Staffs by the sorting criteria.
     *
     * @param e1 Staff object
     * @param e2 Staff object
     * @return If e1 is less than, equals or more than e2, return a negative
     * value, zero or positive value respectively. If sorting criteria is null or
     * empty, it returns zero.
     */
    @Override
    public int compare(Staff e1, Staff e2) {
        for (int i = 0; i < criterions.length; i++) {
            String criteria = criterions[i].getField(); 

            if (criteria.equals("name")) {
                return e1.getName().compareTo(e2.getName()); 
            }

            if (criteria.equals("school")) {
                return e1.getSchool().compareTo(e2.getSchool());
            }

            if (criteria.equals("year")) {
                Faculty f1 = (Faculty) e1;
                Faculty f2 = (Faculty) e2; 
                return f1.getEmployedDate().compareTo(f2.getEmployedDate());

            }

            if (criteria.equals("class")) {
                return e1.getClass().getName().compareTo(e2.getClass().getName()); 
            }
        }

        return 0;
        
    }
    

    /**
     * Sort Staffs.
     * @param Staffs List of Staff objects to be sorted.
     */
    public void sort(Staff[] staffs) {
        for (int i = 0; i < criterions.length; i++) {
            boolean ascending = criterions[i].isAscending(); 
            if (ascending) {
                Arrays.sort(staffs);
            } else {
                Arrays.sort(staffs, Collections.reverseOrder()); 
            }
        }
    }
}
