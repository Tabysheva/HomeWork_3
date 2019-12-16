public class Main {

    public static void main(String[] args) {
	BankAccount ba = new BankAccount();
	ba.deposit(10000);
	while (true) {
	    ba.withDraw(6000);
	     if (ba.amount<10000) {return;}
    }
    }
}
