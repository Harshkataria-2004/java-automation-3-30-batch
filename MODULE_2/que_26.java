//que-26-->W.A.J.Pto create a custom exception if Customer withdraw amount
//which is greater than account balance then program will show custom
//exception otherwise amount will deduct from account balance. Account
//balance is: 2000 Enter withdraw amount: 2500 o Sorry, insufficient
//balance, you need more 500 Rs. To perform this transaction. 

package MODULE_2;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
public class que_26 {
	private int balance = 2000;

    public void withdraw(int amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Sorry, insufficient balance, you need more " + (amount - balance) + " Rs. To perform this transaction.");
        } else {
            balance -= amount;
            System.out.println("Your account balance is now: " + balance);
        }
    }

    public static void main(String[] args) {
        InsufficientBalanceException insufficientBalance = new InsufficientBalance();
        try {
            insufficientBalance.withdraw(2500);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
