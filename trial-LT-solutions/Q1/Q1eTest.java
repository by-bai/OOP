// You can alter this class, but it won't be marked.

public class Q1eTest {

    public static void main(String[] args) {

        Human joel = new Human("joel", 34);
        Human jimmy = new Human("jimmy", 5);
        Human don = new Human("don", 6);
        Human kenny = new Human("kenny", 88);
        Human wendy = new Human("wendy", 9);
        Human siti = new Human("siti", 98);
        Human brian = new Human("brian", 102);
        Human jason = new Human("jason", 38);
        Human ivan = new Human("ivan", 88);
        Human[][] humans2d = {{joel, jimmy}, {don, kenny, wendy}, {siti, brian, jason, ivan}};

        Human[] youngHumans = Q1e.getHumansBelowAge(humans2d, 88);
        System.out.println("Below age 88");
        System.out.println("Expected: joel, jimmy, don, wendy, jason,");

        System.out.print("Result  : ");
        for (Human h : youngHumans) {
            System.out.print(h.getName() + ", ");
        }
        System.out.println();
        System.out.println();
        
        youngHumans = Q1e.getHumansBelowAge(humans2d, 1);
        System.out.println("Below age 1");
        System.out.println("Expected length: 0" );

        System.out.println("Result length: " + youngHumans.length);
        System.out.println();

        youngHumans = Q1e.getHumansBelowAge(null, 88);
        System.out.println("Pass in null for array");
        System.out.println("Expected length: 0" );

        System.out.println("Result length: " + youngHumans.length);
    }
}