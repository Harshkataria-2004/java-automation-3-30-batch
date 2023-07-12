//que-16-->Create an abstract class 'Bank' with an abstract method 'getBalance'. $100,
//$150 and $200 are deposited in banks A, B and C respectively. 'BankA',
//'BankB' and 'BankC' are subclasses of class 'Bank', each having a method
//named 'getBalance'. Call this method by creating an object of each of the three
//classes.

package MODULE_2;

abstract class Bank {
	abstract void getBalance();
}

class BankA extends Bank {
	  @Override
	  void getBalance() {
		  System.out.println("Balance in Bank A : $100");
	  }
}
class BankB extends Bank {
	  @Override
	  void getBalance() {
		  System.out.println("Balance in Bank B : $150");
	  }
}
class BankC extends Bank {
	  @Override
	  void getBalance() {
		  System.out.println("Balance in Bank C : $200");
	  }
}
public class que_16 {
	public static void main(String[] args) {
	    BankA bankA = new BankA();
	    BankB bankB = new BankB();
	    BankC bankC = new BankC();
	    bankA.getBalance();
	    bankB.getBalance();
	    bankC.getBalance();
	}
}
