package Day7;

import java.util.ArrayList;

public class Insert {
public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(90);
	list.add(10);
	list.add(10);
	list.add(40);
	list.add(50);
	System.out.println(list);
	int i = list.lastIndexOf(10);
	System.out.println(i);
	list.add(i,100);
	System.out.println("After adding :"+list);
}
}
