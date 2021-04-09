// Author: xxx, Email ID: xxx

// Do NOT change the method signatures in this class.
// insert any import statements if you want. only standard Java libraries can be used (no 3rd party libraries)

import java.util.*;

public class Q1e {
    /*
     * Takes in a 2D array of Human objects (Human.java is provided), and returns all the Human objects
     * in the list that are younger than ageLimit as a single 1D array.
     *
     * e.g.: if the Human objects in humans have these ages: {{34, 5}, {6, 88, 9, 98, 102}, {38}, {88}}
     *       and this method is called with ageLimit 88,
     * then this method should return an array of 5 Human objects with the following ages in order: 34, 5, 6, 9, 38.
     *
     * Do not assume that the input 2D array is always a rectangular array.
     * This method returns an empty array if humans is null or if none of the Humans meet the requirement.
     */

    public static Human[] getHumansBelowAge(Human[][] humans, int ageLimit) {       

        if(humans == null){
            return new Human[0];
        }

        ArrayList<Human> resultList = new ArrayList<Human>();

        for(int i = 0; i < humans.length; i++){
            Human[] currentHumanArray = humans[i];
            for (Human human: currentHumanArray){
                if(human.getAge() < ageLimit){
                    resultList.add(human);
                }
            }
        }

        Human[] out = resultList.toArray(new Human[0]);
        return out;


    }
}