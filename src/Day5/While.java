package Day5;

public class While {
public static void main(String[] args) {
	int i=1;
	while(i<=7) {
		System.out.println(i);
		i++;
	}
	//do While
	int j=1;
	do {
		System.out.println(j);
		j++;
		
	}while(j<=5);
	//Switch
	String day ="Suji";
	switch(day) {
	case "Suji":
		System.out.println("Monday");
		break;
	case "Sowmi":
		System.out.println("Tuesday");
		break;
	case "Bria":
		System.out.println("Wednesday");
		break;
		default:
			System.out.println("Default");
			break;
			
	}
}
}
