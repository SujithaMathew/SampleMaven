package emp;

public class GreensTech {
public void greensOmr(int a) {
	System.out.println(a);

}
public void greensOmr(String a) {
	System.out.println(a);

}
public void greensOmr(int b,String d,char c) {
	System.out.println(b+d+c);

}
public void greensOmr(char v,float f,double d) {
	System.out.println(v);
	System.out.println(f);
	System.out.println(d);

}
public static void main(String[] args) {
	GreensTech gt=new GreensTech();
	gt.greensOmr(56);
	gt.greensOmr("Sujitha");
	gt.greensOmr(78, "Suji", 'M');
	gt.greensOmr('B', 567.8f, 456.89765);
}
}
