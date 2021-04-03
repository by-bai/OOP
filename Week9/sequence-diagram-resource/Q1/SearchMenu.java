import java.util.Scanner;

public class SearchMenu {
    private SearchCtrl ctrl;

    public SearchMenu(SearchCtrl ctrl) {
        this.ctrl = ctrl;
    }

    public void display() {
        System.out.println("== Interest Group Management System ==");
        System.out.println("1. President Gender Search");
        System.out.println("2. Quit Application");
        System.out.print("Please enter your choice:");
    }

    public void readOption() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            display();
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    searchPresident();
                    break;
                case 2:
                    System.out.println("bye bye");
                    break;
                default:
                    System.out.println("Enter a choice between 1 to 2");
            }
        } while (choice != 2);
    }

    public void searchPresident() {
        String IGName;
        int year; 

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Interest Group's name> "); 
        IGName = sc.next();
        sc.nextLine();
        System.out.print("Enter the year> ");
        year = sc.nextInt();  
        Student president = ctrl.searchPresident(IGName, year); // save the returned Student object
        
        
        if (president != null) {
            String genderString = "lady"; 
            char gender = president.getGender(); 
            //primitive data type use == not .equals
            if (gender == 'M') {
                genderString = "gentleman"; 
            }
            System.out.println("The president " + president.getName() + " is a " + genderString); 
            System.out.println(); 
        } else { 
            System.out.println("Invalid Interest Group/Year entered."); 
            System.out.println(); 
        }

    }
}