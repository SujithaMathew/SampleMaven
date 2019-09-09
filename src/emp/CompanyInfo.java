package emp;

public class CompanyInfo {
public void companyName(String a) {
	System.out.println("Company name is :" +a);

}
public void companyName(String b,char a) {
	System.out.println("Company name is :" +b+a);

}
public void companyName(int a,char b,String c) {
	System.out.println("Company name is :" +a+b+c);

}
public void companyName(char d,float f) {
	System.out.println("Company name is :" +d+f);

}
public static void main(String[] args) {
	CompanyInfo c=new CompanyInfo();
	c.companyName("CTS");
	c.companyName("TC", 'S');
	c.companyName(1, 'W', "ipro");
	c.companyName('d',12.67f);
}
}
