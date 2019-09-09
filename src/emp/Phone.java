package emp;

public class Phone {
public void phoneInfo(int x,char c) {
	
System.out.println("Information :" +x+c);
}
public void phoneInfo(float f,char d) {
	
System.out.println("Information :" +f+d);
}
public void phoneInfo(String s,String t,char k) {
	
System.out.println("Information :" +s+t+k);
}
public void phoneInfo(char n,float l) {
	
System.out.println("Information :" +n+l);
}
public static void main(String[] args) {
	Phone p=new Phone();
	p.phoneInfo(5, 'S');
	p.phoneInfo(12.67f, 'd');
	p.phoneInfo("suji", "tha", 'M');
	p.phoneInfo('l', 23.78f);
}
}
