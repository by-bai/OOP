public class PersonComparator implements Comparator<Person> {    
    public int compare(Person p1, Person p2) {
        //int compare = p1.name.compareTo(p2.name) //this is not ok because 
        //Comparator got no access to Person name, need provide get method for it

        // SORT BY NAME, FOLLOWED BY AGE??

        int compare = p1.getName().compareTo(p2.getName()); 

        // If both the strings are equal then this method returns 0,
        // else it returns positive or negative value. 

        if (compare != 0) {
            return compare;
        }

        return p1.getAge() - p2.getAge();



        // if replace age with gpa: 

        // double compare = p1.getGpa() - p2.getGpA(); 
        // but cannot because need to return int according to the method
        // cannot cast double to int also, may return 0 - means same

        // solution: 

        // double compare = Double.compare(p1.getGpa(), p2.getGpa()); 
    }
}
