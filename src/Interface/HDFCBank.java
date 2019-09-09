package Interface;

public class HDFCBank extends Abstract {

	@Override
	public void calInt() {
		System.out.println("10%");
	}

	@Override
	public void call() {
		System.out.println("20%");
		
	}
	public static void main(String[] args) {
		HDFCBank h=new HDFCBank();
		h.calInt();
		h.call();
		h.Deposit();
		h.withDraw();
	}

}
