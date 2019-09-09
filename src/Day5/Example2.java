package Day5;

public class Example2 {
public Example2() {
	System.out.println("Parent class");
}
public Example2(String name,char c) {
	System.out.println(name+c);
}
public Example2(int v) {
	this("Sujitha",'M');
	System.out.println(v);
}
}
