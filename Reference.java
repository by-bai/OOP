/* 
UML Clss Diagram 

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


// IllegalArgumentException
if (arr == null || arr.length == 0) 
            throw new IllegalArgumentException();

// Classpath examples
javac -d classes -sourcepath src src/farming/app/AnimalFarmTest.java
java -classpath classes farming.app.AnimalFarmTest

javac -d classes -cp "lib/*:src" src/app/TemplatingEngine.java 
java -cp "lib/*:classes" app.TemplatingEngine

javac -d production -cp "source:libraries/prebuilt/*:libraries/log4j2/*:config/*" source/labtest/VendingMachineTest.java
java -cp "config/*:libraries/prebuilt/*:libraries/log4j2/*:production" labtest.VendingMachineTest
// ^ remember to -cp the folder where the generated class is stored in!!