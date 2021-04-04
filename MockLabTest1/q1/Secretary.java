/*
* Name: Bai
*/

import java.util.*;

public class Secretary extends Staff {
    
    // private Staff boss;

    // public Secretary(String name, String school, Staff boss) {
    //     //Secretary extends Staff
    //     super(name, school);
    //     //Secretary has 0..1 Boss
    //     boss = new Staff(name, school); 
    // }

    // protected Staff getBoss() {
    //     return boss;
    // }

    private Staff boss;
    private Staff staff; 

    public Secretary(String name, String school, Staff boss) {
        super(name, school);
        this.boss = boss;
    }


    protected Staff getBoss() {
        return boss;
    }

    public boolean equals(Object o) {

        if (o instanceof Secretary) {
            Secretary s = (Secretary) o; 
            return super.equals(s) && (getBoss().getName().equals(s.getBoss().getName()));
        }

        return false;
   
    }

    public int hashCode() {
        return Objects.hash(staff); 
    }

}
