package Day7;

import java.util.ArrayList;

public class Common {
public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<>();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	list.add(50);
	list.add(60);
	list.add(70);
	list.add(80);
	System.out.println("List :"+list);
	ArrayList<Integer> list1=new ArrayList<>();
	list1.add(100);
	list1.add(200);
	list1.add(300);
	list1.add(400);
	list1.add(500);
	list1.add(600);
	list1.add(700);
	list1.add(8000);
	System.out.println("List1 :"+list1);
	list.removeAll(list1);
	System.out.println("Common values of List :"+list);
}
}
