import java.util.*;

public class PortalMenu {
	private PortalController pctrl;

    // constructor
	public PortalMenu(PortalController pctrl) {
		this.pctrl = pctrl;
	}

	// gets account to, account from and amount to transfer from user input and perform transfer
    public void processTransfer(){
		System.out.println("Bank Portal"); 
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter your account number > "); 
		String fromAccNum = sc.next(); 
		System.out.print("Enter account to transfer to > ");
		String toAccNum = sc.next();
		System.out.print("Enter amount to transfer > "); 
		double amount = sc.nextInt(); 

		int transferred = pctrl.transfer(fromAccNum, toAccNum, amount);

		if (transferred == -1) {
			System.out.printf("%s has insufficient funds for transfer", fromAccNum); 
			System.out.println();
		} else if (transferred == 0) {
			System.out.printf("%.1f is transferred from %s to %s", amount, fromAccNum, toAccNum); 
			System.out.println();
		}


    }        
}