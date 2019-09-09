package Interface;

public class Ktm implements Bike {

	@Override
	public void cost() {
		System.out.println("20K");
	}

	@Override
	public void speed() {
		System.out.println("20km");
		
	}
	public static void main(String[] args) {
		Ktm k=new Ktm();
		k.cost();
		k.speed();
	}

}
