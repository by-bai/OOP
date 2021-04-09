import java.util.Collections;
import java.util.Map;

/* 

Ctrl+F:
1. UML Class Diagram
2. Overriding equals, toString, hashCode
3. Classpath
4. Exceptions & File Reading
5. Integer Divison
6. Comparable & Comparator 
7. Resolving errors
8. Arrays & Collections

*/

/*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*/

/*
UML Class Diagram 

Multiplicity
one-to-one
one-to-many
many-to-many

1 One
0..1 Optional One
0..* Zero or more
* Zero or more
1..* One or more

*/

// 1
public class Player {
    private Ship ship;
}

// *
public class Team {
    private ArrayList<Member> Members; 
}

/*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*/

/* Overriding */ 

// overriding equals

public boolean equals(Object obj){

    if (obj == null) {
        return false; 
    }
    // check if Object obj is an instance of Person
    if(!(obj instanceof Person)){
        return false;
    }

    // to access attributes & methods in Person, do Class Cast
    Person another = (Person) obj;
    return another.name.equals(name)
            && another.age == age; // returns true/false

            
}

// overriding hashcode
// HOW? 
public int hashCode() {
    return Objects.hash(staff); 
}

// overriding toString
public String toString() {
    return "person(name=" + name + ",age=" +age + ")"; 
}



/*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*/

/* Classpath 

1. Package
2. Import statements
3. Compile
4. Run

*/ 
// Classpath examples
javac -d classes -sourcepath src src/farming/app/AnimalFarmTest.java
java -classpath classes farming.app.AnimalFarmTest

javac -d classes -cp "lib/*:src" src/app/TemplatingEngine.java 
java -cp "lib/*:classes" app.TemplatingEngine

javac -d production -cp "source:libraries/prebuilt/*:libraries/log4j2/*:config/*" source/labtest/VendingMachineTest.java
java -cp "config/*:libraries/prebuilt/*:libraries/log4j2/*:production" labtest.VendingMachineTest
// ^ remember to -cp the folder where the generated class is stored in!!


/*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*/

/* Exceptions & File Reading */


// IllegalArgumentException
if (arr == null || arr.length == 0) 
            throw new IllegalArgumentException("array is empty");
}

// Write Exception class
// unchecked exception -> extends RuntimeException
// checked exception -> extends Exception


public class DemoException extends RuntimeException {

    // no args constructor
    public DemoException() {

    }

    // error message
    public DemoException(String msg) {
        super(msg); // message inherited from super class (RuntimeException)
    }

    //Throwable is the mother of all exceptions
    public DemoException(String msg, Throwable e) {
        super(msg, e); 
    }

    public DemoException(Throwable cause) {
        super(cause); 
    }

}

// Writing a class that throws an exception 
// In Test.java, catch IllegalArgumentException
public class PartAndQuantityEntry {
    
    public void enterPartAndQuantity (int partNumber, int orderQty) throws IllegalArgumentException {
        if ( (partNumber < 0) || (partNumber > 999) || (orderQty < 1) ||
         (orderQty > 5000) ) {
            throw new IllegalArgumentException("Invalid order, part number should be between 0 and 999, quantity ordered between 1 and 5000");
        } else {
            System.out.println("Successfully inserted order"); 
        }
    } 
}


// Read File

//import java.util.Scanner; 
//import java.io.*; 

try(Scanner fileSc = new Scanner(new FileInputStream(FILE_NAME))) {
    fileSc.useDelimiter(",|\r\n|\n");
    fileSc.nextLine(); // skip header
    
    while (fileSc.hasNext()) { // 1 line
        String[] strings = fileSc.nextLine().split("#"); 
        
        
    }
}catch (IOException e){
    throw new DataException(e);
}

try(Scanner sc = new Scanner(new File(userInput))) {

} catch (FileNotFoundException e){
    System.out.println("....");
}


// Write File
try(FileWriter out = new FileWriter(FILE_NAME)) {
    out.write("....\n");
    String line = "";
    out.write(line + "\n"); 
}

// Writing to Excel -> Week 6 Q5.

// Prompt user for input
/* 

boolean invalid = true;
while (invalid) {

    try {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter :");
        String name = sc.nextLine(); 
    } catch (Exception e) {
        // sopl
    }
}

if use sc.next --> need to clear the tunnel with sc.nextLine(); 



*/




/*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*/

/* Integer Division */

// 1. return integer
return Math.round(super.getPriceInCents() * 7/9);

// 2. return double
int percent
//int/int --> WRONG.
return (100-percent)/100 * super.getPrice();

//to get double:
return (100-percent)/100.0 * super.getPrice(); 


/*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*/

/* Comparable & Comparator */

// comparable (MockLabTest2 q1 ElectronicBook.java)
public class ElectronicBook extends Book implements Comparable<ElectronicBook> {
    public int compareTo(ElectronicBook o) {
        //getTitle is inherited from Book

        //TITLE
        int i = getTitle().compareTo(o.getTitle());
        if (i != 0) {
            return i;
        }

        //EXPIRY DATE
        int j = getExpiryDate().compareTo(o.getExpiryDate());
        if (j != 0) {
            return j;
        }

        return -1;
    }

    /* ○ If A’s sum of the prices is more than B’s sum, A is less than B.
    ○ If A’s sum of the prices is less than B’s sum, A is more than B.
    ○ If A’s sum of the prices is equal to B’s sum, both are the same. */

    public int compareTo(Person another) {

        double prices = getPrices(items);
        double anotherPrices = another.getPrices(another.items);
        if (prices > anotherPrices) {
 
            // if current object is greater,then return -1
            return -1;
        }
        else if (prices < anotherPrices) {
 
            // if current object is greater,then return 1
            return 1;
        }
        else {
 
            // if current object is equal to o,then return 0
            return 0;
        }
        
    }
}

//comparator (MockLabTest1 q1 Sorter.java)
public class Sorter implements Comparator<Staff> {
    public int compare(Staff e1, Staff e2) {
        for (int i = 0; i < criterions.length; i++) {
            String criteria = criterions[i].getField(); 

            if (criteria.equals("name")) {
                return e1.getName().compareTo(e2.getName()); 
            }
        }
    }
}

// Overriding the compareTo method
public int compareTo(Dog d) {
    return (this.name).compareTo(d.name);
 }

 // Overriding the compare method to sort the age 
 public int compare(Dog d, Dog d1) {
    return d.age - d1.age;
 }

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


        Collections.sort(customers, new EmailComparator()); 
        Collections.sort(customers, Collections.reverseOrder()); 
    }
}






/*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*/

/* Resolving errors */

// error: incompatible types: String cannot be converted to int
Integer.parseInt("string");
Double.parseDuble("string");


/*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*//*/*/

/* Arrays & Collections */

// ArrayList

ArrayList<Dish> container = new ArrayList<>();
container.add(new Dish("laksa", 5));
container.get(0);
container.size(); 

// return empty array
if (humans == null || humans.length == 0) {
    return new Human[0]; 
}

Set<String> keys = map.keySet();
for (String key : keys) {

}
// returning hashmaps
if(map.get(key) == null) {
    //create new list
    map.put(key, newlist);
    //or count = 1
} else {
    newlist.add(name);
    //or count++ 
}


// convert list to array
Human[] out = resultList.toArray(new Human[0]);


//

Set<String> inventory = new TreeSet<>(); // sorted
List<String> values = List.of("apple", "orange", "pear");
String[] a = new String[] { "A", "B", "C", "D" };
Arrays.asList(a);
List<String> aList = List.of("apple", "orange", "pear");
String[] arr = new String[aList.size()];
aList.toArray(arr);
Sopl(Arrays.toString(arr));

List<String> list = new ArrayList<>();
Iterator<String> iter = list.iterator();
while (iter.hasNext()) {
    String s = iter.next(); 
}

Map<String, Integer> inventory = new HashMap<>();
inventory.put(" ", " ");
Collection<String> values = inventory.keySet();
for(String key : values) {
    inventory.get(key);
}

inventory.containsKey(key);
inventory.containsValue(value); 

// linked list
private int value;
private Node next;

public Node(int value) {
this.value = value; 
} 

public void setNext(Node next){
this.next = next; 
} 

// 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
// 1 -> 4 -> 2 -> 5 -> 4 -> 6 -> null

main:

Node head = new Node(1);
Node current = head; // current and head are referring to the same object

current.setNext(new Node(2));
current = current.getNext(); 

current.setNext(new Node(3));
current = current.getNext(); 

current.setNext(new Node(4));
current = current.getNext(); 


double linked list:

class Node {
  private int value;
  private Node next;
  private Node prev;

  public Node(int value) {
      this.value = value;
}

public void setNext(Node n) {
     this.next = n;
    n.prev = this;
}

public Node getNext() {
     return next; 
