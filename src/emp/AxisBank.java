package emp;

public class AxisBank extends BankInfo {
	public void deposit(int a,float b) {
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		AxisBank a=new AxisBank();
		a.deposit(7, 56.7f);
		BankInfo b=new BankInfo();
		b.saving(2, 34.5f);
		b.fixed(4, 23.5f);
		b.deposit(9, 54.90f);
		
	}
}
