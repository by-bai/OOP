// controller class containing the logic for bank transfer
public class PortalController {
	private Bank bank; // store all accounts in the bank
	// constructor

    public PortalController() {
        bank = new Bank();
    }


    // Write your answer below.
    public int transfer(String fromAccNum, String toAccNum, double amount) {
        String output; 

        Account fromAcc = bank.retrieveAccount(fromAccNum); 
        Account toAcc = bank.retrieveAccount(toAccNum);

        if (fromAcc.getBalance() >= amount) {
            fromAcc.deduct(amount);
            toAcc.add(amount); 
            
            return 0;
        }
        return -1; 


    }
}