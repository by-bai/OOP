public class Soldier {
    
    private String name;
    private double baseAllowance;

    public Soldier(String name, double baseAllowance) {
        this.name = name;
        this.baseAllowance = baseAllowance; 
    }

    public String getName() {
        return name; 
    }

    public double getBaseAllowance() {
        return baseAllowance;
    }

    public double getGrossAllowance() {
        return baseAllowance; 
            //line 20 & 21 both works :-)
        //return this.getBaseAllowance; --> v. extra, dont need this. 'cos no ambiguity here
    }

    public String toString() {
        return String.format("Soldier{name='%s', baseAllowance= %.1f}", name, baseAllowance);
        // or do string concatenation 
        // getClass().getName() --> Soldier 
            // getClass() returns you Class Class from java.lang 
    }
}
