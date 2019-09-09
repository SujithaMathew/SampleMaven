package Interface;

public class IOBBank implements bank,Bank2 {

	@Override
	public void savingAct() {
		System.out.println("1000");
		
	}

	@Override
	public void currentAct() {
		System.out.println("2000");
	}

	@Override
	public void fixedAct() {
		System.out.println("500");
	}
	public static void main(String[] args) {
		IOBBank i=new IOBBank();
		i.currentAct();
		i.savingAct();
		i.fixedAct();
	}

	@Override
	public void withDraw() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Deposit() {
		// TODO Auto-generated method stub
		
	}

}
