public class Student extends Person {
    private String university; 

    // Student class: got no arg constructor because Person got no arg constructor
    // Student will only inherit the constructor with args
    // it will invoke super class constructor that is in Person (?)

    public Student() {
        // super();  // wont work cos string is expected 
            // cannot pass in 0 arg , need one string argument like in Person class
        super("Amy"); //provide own super call so java wont call the default super
    }


    public Student(String name, String university){
        
        //super(name);
        this.university = university; 
    }

}


