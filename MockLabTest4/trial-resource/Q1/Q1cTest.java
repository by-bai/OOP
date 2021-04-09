// You can do anything you want with this class, but it won't be marked.

public class Q1cTest {

    public static void main(String[] args) {
        Human clara = new Human("clara", 34);
        Human angelia = new Human("angelia", 5);
        Human peter = new Human("peter", 6);
        Human sarah = new Human("sarah", 88);
        Human ugine = new Human("ugine", 9);
        Human derrick = new Human("derrick", 98);
        Human desmond = new Human("desmond", 102);
        Human gareth = new Human("gareth", 38);
        Human joachim = new Human("joachim", 88);
        Human[] humans = {clara, angelia, peter, sarah, ugine, derrick, desmond, gareth, joachim};

        Human oldestHuman = Q1c.getOldest(humans);
        System.out.println("Expected: desmond");
        System.out.println("Result  : " + oldestHuman.getName());
    }
}