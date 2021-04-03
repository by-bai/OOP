public class TransactionProcessorTest{
	public static void main(String[] args) {
		TransactionProcessor transProcs = new TransactionProcessor();
		
		// Task 3: Handle exceptions potentially thrown by debitAccount method invocation
		
		double balance1 = 2000;
		double amt1 = 1000;
		System.out.println("Debiting " + amt1 + " from " + balance1);
		double remainingBal1 = transProcs.debitAccount(balance1,amt1);
		System.out.println("Remaining balance : " + remainingBal1);
		
		double balance2 = 2000;
		double amt2 = -1000;
		System.out.println("Debiting " + amt2 + " from " + balance2);
		double remainingBal2 = transProcs.debitAccount(balance2,amt2);
		System.out.println("Remaining balance : " + remainingBal2);
	}
}