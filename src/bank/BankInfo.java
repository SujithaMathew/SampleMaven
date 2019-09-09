package bank;

public class BankInfo extends AxisBank {
public void saving() {
	System.out.println("Saving Amount");

}
public void fixed() {
	System.out.println("Fixted Amount");

}
public static void main(String[] args) {
	BankInfo bi=new BankInfo();
	bi.saving();
	bi.fixed();
	bi.deposit();
}
}
