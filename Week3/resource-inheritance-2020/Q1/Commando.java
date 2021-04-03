
public class Commando extends Soldier {

    private double vocationAllowance;

    public Commando(String name, double baseAllowance, double vocationAllowance){
        super(name, baseAllowance); // cannot this.name = name; because name is of private access in soldier class
        // if you don't call super(...), java will create super() for you with nothing inside
        // so you need super(name, baseAllowance) because parent class Soldier has a constructor that takes in 2 parameters
        // super can only be called once in a constructor 
        // super or this can only be invoked once within the constructor (?)
        // super must be the first statement in constructor 

        this.vocationAllowance = vocationAllowance; 
    }
    
    public double getGrossAllowance(){
        // CANNOT return baseAllowance + vocationAllowance  
            // because baseAllowance is private in Soldier
            // inherited the public method from Soldier so should call that
            // cannot touch the private stuff directly, need to go through public methods
        return getBaseAllowance() + vocationAllowance; 
        // the following lines will work as well:
            // return this.getBaseAllowance + vocationAllowance;
            // return this.getBaseAllowance + vocationAllowance;
    }

    public String toString() {
        // format method of a String is a static method !
        return String.format("Commando{Soldier{name='%s', baseAllowance= %.1f}, vocationAllowance=%.1f}", getName(), getBaseAllowance(), vocationAllowance);
    }
}
