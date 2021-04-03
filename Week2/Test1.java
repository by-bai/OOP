public class Test1 {
    public static void main(String[] args) {
        Person p1 = new Person(12, 'M', "LEE");
        Person p2 = new Person(13, 'F', "TAN"); // creating an object 

        //access the variables:
        //DISCLAIMER: but most of the time we won't access like this !!
        // p1.age = 13; // in Person.Java the variable is private so cannot access like this 
        // p1.gender = 'M';
        // p1.name = "Joy";

        // p2.age = 14;
        // p2.gender ='F';
        // p2.name = "Mary"; 

        // System.out.println(p1.name); 
    }
}
