package Day4;

public class Fibonassi {
public static void main(String[] args) {
	int n1=1,n2=2,count=100,n3;
	System.out.println(n1+"\n"+n2);
	for(int i=3;i<=count;i++) {
		n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.println(" "+n3);
		
	}
}
}
