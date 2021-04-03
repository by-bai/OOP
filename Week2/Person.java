public class Person {
    // age, gender, name are instance variables because they are directly declared under the class definition
    // instance variables will always be initialised. 
    // int initialised to 0, 
    // float/double -> 0.0
    // boolean -> false
    // char -> '\u0000' (invisible char so cannot see anything) 
    // ref data type initialised to null. 

    private int age;     
    private char gender; 
    private String name; 
    // cannot access the variables directly now via p1.name etc because
    // 'name has private access in Person'
    // if want people to retrieve it publicly then need to write get Methods!

    //constructor -> constructs an object/instance
    public Person(int age, char gender, String name) {
        this.age = age;
        this.gender = gender;
        this.name = name; 
    }

    public int getAge() {
        return age;
    }
    public char getGender() {
        return gender;
    }
    public String getName() {
        return name;
    }
    // purpose: textual representation used for debugging
    // return textual representation; used for debugging
    public String toString() {
        return "Person: name=" + name + ", gender=" + gender + "age=" + age;
    }

} 