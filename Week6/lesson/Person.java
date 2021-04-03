public class Person implements Comparable<Person> {
    private int age;
    private String name; 
    
    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String toString() {

        return "" + age;
    }

    public String getName() {
        return name; 
    }

    public int compareTo(Person another) {
        System.out.println("Invoking compareTo"); 
        return age - another.age; 

    }
}
