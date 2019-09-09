package Day7;

import java.util.ArrayList;

public class Index {
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
	list.add(10);
	
	for(int i=0;i<list.size();i++) {
		int l = list.indexOf(10);
		
		System.out.println(l);
	}
	
}
}
