public class Person {
    private String name;
    private int age;


    // C++ makes use of copy constructor

    public Person(String name, int age){
        this.name = name;
        this.age = age;

    }

    // Object class 
    // public Object clone()
    // in sub class : Person you can choose to return either public Person clone or public Object clone
    @Override 
    public Person clone() {
        return new Person(name, age); 
    }

    // public Object clone() {
    //     return new Person(name, age); 
    // }
    // Person p = (Person) another.clone(); 

    //

    public String toString() {
        return "person(name=" + name + ",age=" +age + ")"; 
    }

    // String s = "abc";
    // String t = "abc"; 
    // if (s.equals(t))

    public boolean equals(Object obj){
        if(!(obj instanceof Person)){
            return false;
        }

        Person another = (Person) obj;
        return another.name.equals(name)
                && another.age == age; 

                
    }
}