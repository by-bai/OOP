import java.util.Scanner;

public class CheckScoreMenu {
    private CheckScoreCtrl ctrl;

    public CheckScoreMenu(CheckScoreCtrl ctrl) {
        this.ctrl = ctrl;
    }

    public void display() {
        System.out.println("== Quiz Management System ==");
        System.out.println("1. Check student's score");
        System.out.println("2. Quit Application");
        System.out.print("Please enter your choice: ");
    }

    public void readOption() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            display();
            choice = sc.nextInt();
            switch (choice) {
                case 1 :
                    checkScore();
                    break;
                case 2 :
                    System.out.println("bye bye");
                    break;
                default :
                    System.out.println("Enter a choice between 1 to 2");
            }
        } while (choice != 2);
    }

    public void checkScore() {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the student's name> ");
        String stuName = sc.next(); 
        System.out.print("Enter the quiz's name> ");
        String quizName = sc.next(); 

        try {
            double difference = ctrl.calculateDifferenceFromAverage(stuName, quizName); 

            if (difference == 0.0) {
                System.out.println(stuName + " is sitting on the fence!");
                System.out.println();
            } else if (difference < 0) {
                System.out.println(stuName + " is " + Math.abs(difference) + " marks below the average"); 
                System.out.println();
            } else {
                System.out.println(stuName + " is " + difference + " marks above the average"); 
                System.out.println();
            } 
    
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); 
            System.out.println();
        }
            
        
    }


}