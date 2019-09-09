package Day8List;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Ques3 {
public static void main(String[] args) {
	TreeSet<Integer> set=new TreeSet<>();
	set.add(10);
	set.add(20);
	set.add(30);
	set.add(40);
	set.add(50);
	set.add(60);
	set.add(70);
	set.add(80);
	
	System.out.println("Set :"+set);
	TreeSet<Integer> emp=new TreeSet<>();
	emp.add(100);
	emp.add(200);
	emp.add(300);
	emp.add(400);
	emp.add(500);
	emp.add(600);
	emp.add(700);
	emp.add(8000);
	
	
	System.out.println("Emp :"+emp);
	set.removeAll(emp);
	System.out.println("Common values :"+set);
	
	
}
}
