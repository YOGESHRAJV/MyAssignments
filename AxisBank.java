package assignment3;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("5000");
	}
	public static void main(String[] args) {
		AxisBank bank=new AxisBank();
		bank.saving();
		bank.fixed();
		bank.deposit();
		bank.deposit();
	}

}
