// Author: xxx, Email ID: xxx

// Do NOT change the method signatures in this class.
// insert any import statements if you want. only standard Java libraries can be used (no 3rd party libraries)
public class Q1c {
    /*
     * Takes in an array of Human objects (Human.java is provided), and returns the Human object
     * in the list that is the oldest (i.e. highest age). If more than one Human has the same highest
     * age, this method should return the latter one in the list.
     *
     * e.g.: if the Human objects in humans have these ages: 34, 5, 6, 88, 9, 98, 102, 38, 88
     * then this method should return the Human object who is 102 years old.
     *
     * This method returns null if humans is null or if humans is an empty array.
     */

    public static Human getOldest(Human[] humans) {
        if (humans == null) {
            return null;
        }

        Human oldest = humans[0];

        for (int i = 0; i<humans.length; i++) {
            if (humans[i].getAge() > oldest.getAge()) {
                oldest = humans[i]; 
            }
        }
        return oldest; 
    }
}