package Day5;

public class Example1 extends Example2 {
public Example1() {
	this("Sujitha",45);
	System.out.println("Default");
}
public Example1(int a) {
	super(7);
	System.out.println(a);
}
public Example1(String name,int a) {
	this(123.7865f);
	System.out.println(name+a);
	
}
public Example1(float b) {
	this(34);
	System.out.println(b);
}
public static void main(String[] args) {
	Example1 e=new Example1();
	//Example1 d=new Example1("Sujitha",23);
	//Example1 f=new Example1(123.56f);
	
}
}
