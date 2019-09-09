
package Day7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Array1 {
public static void main(String[] args) {
	TreeSet<Integer> stu=new TreeSet<> ();
	stu.add(10);
	stu.add(20);
	stu.add(30);
	stu.add(35);
	stu.add(30);
	stu.add(90);
	stu.add(30);
	System.out.println(stu);
	System.out.println(stu.size());
	stu.remove(30);
	System.out.println(stu);
	for (Integer x : stu) {
		System.out.println(x);
	}
	
	//stu.add(3,45);
	//System.out.println("After add :"+stu);
	//stu.remove(1);
	//System.out.println("After remove :"+stu);
	//stu.set(3,40);
	//System.out.println("After replace :"+stu);
	//boolean l = stu.isEmpty();
	//System.out.println(l);
	//stu.clear();
	//System.out.println(stu);
	//boolean s = stu.isEmpty();
	//System.out.println(s);
	/*int i = stu.indexOf(20);
	System.out.println(i);
	int e = stu.lastIndexOf(30);
	System.out.println(e);
	boolean c = stu.contains(20);
	System.out.println(c);
	ArrayList<Integer> emp=new ArrayList<>();
	System.out.println("Stu :"+stu);
	System.out.println("Emp :"+emp);
	emp.addAll(stu);
	stu.add(100);
	emp.add(200);
	emp.add(300);
	System.out.println("Stu :"+stu);
	System.out.println("Emp :"+emp);
	emp.removeAll(stu);
	System.out.println(emp);
	//boolean k = emp.containsAll(stu);
	//System.out.println(k);
	
	*/
	
	
}
}
