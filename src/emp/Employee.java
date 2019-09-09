package emp;

public class Employee {
public void empId(int a) {
	System.out.println(a);

}
public void empId(float a) {
	System.out.println(a);

}
public void empId(String a,char c) {
	System.out.println(a+c);

}
public void empId(String b,String c) {
	System.out.println(b+c);

}
public static void main(String[] args) {
	Employee e=new Employee();
	e.empId(5);
	e.empId(123.78f);
	e.empId("Sujitha", 'M');
	e.empId("Sujitha","Mathew");
}
}
