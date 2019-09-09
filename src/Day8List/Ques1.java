package Day8List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Ques1 {
public static void main(String[] args) {
	ArrayList<Integer> list=new ArrayList<>();
	list.add(100);
	list.add(200);
	list.add(300);
	list.add(400);
	list.add(500);
	list.add(600);
	list.add(700);
	list.add(100);
	list.add(300);
	list.add(500);
	
	System.out.println("List :"+list);
	
	LinkedHashSet<Integer> set=new LinkedHashSet<>();
	set.addAll(list);
	System.out.println("Set :"+set);
	
}
}
