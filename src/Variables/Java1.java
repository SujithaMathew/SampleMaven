package Variables;

public class Java1 extends Branch1 {
 static int a=10;
 public static void add() {
	System.out.println("Add");
	System.out.println(a);
	System.out.println(s);
	System.out.println(Branch1.a);

}
 public static void main(String[] args) {
	Java1 j=new Java1();
	j.add();
	Branch1.add();
}
}
