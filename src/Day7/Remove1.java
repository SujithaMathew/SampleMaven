package Day7;

import java.util.ArrayList;

public class Remove1 {
public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(90);
	list.add(10);
	list.add(10);
	list.add(40);
	System.out.println(list);
	int i = list.lastIndexOf(10);
	
	list.remove(i);
	System.out.println("After removing :"+list);
}
}
