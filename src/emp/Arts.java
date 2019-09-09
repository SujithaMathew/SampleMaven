package emp;

public class Arts extends Education{
	public void bsc() {
		System.out.println("BSc");

	}
	public void bEd() {
		System.out.println("B.Ed");

	}public void bA() {
		System.out.println("BA");

	}
	public void bBA() {
		System.out.println("BBA");

	}
	public void ug() {
		System.out.println("Under Graduate");

	}
	public void pg() {
		System.out.println("Post Graduate");

	}
	public static void main(String[] args) {
		Arts a=new Arts();
		a.bA();
		a.bBA();
		a.bEd();
		a.bsc();
		a.ug();
		a.pg();
		Education e=new Education();
		e.ug();
		e.pg();
	}
}
