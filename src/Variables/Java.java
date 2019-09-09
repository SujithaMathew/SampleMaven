package Variables;

public class Java extends Branch{
String s;
	
	int a=100;
public void add() {
	
int a=10;
System.out.println(a);
System.out.println(s);
System.out.println("Class global :"+this.a);
System.out.println(b);
System.out.println("Global :"+super.a);

	

}
 public static void main(String[] args) {
	Java j=new Java();
	j.add();
}
}
