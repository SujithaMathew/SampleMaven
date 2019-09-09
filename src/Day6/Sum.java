package Day6;

public class Sum {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,6,7,8,9,10};
	int sum=0;
	System.out.println("Size :"+a.length);
	for(int i=0;i<a.length;i++) {
		sum=sum+a[i];
		
	}
	System.out.println("Sum :"+sum);
	int avg=sum/a.length;
	System.out.println("Average :"+avg);
}
}
