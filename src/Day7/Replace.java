package Day7;

import java.util.ArrayList;

public class Replace {
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
	list.add(30);
	System.out.println(list);
	int size=list.size();
	for(int i=0;i<size;i++) {
	if(list.contains(10)) {
		list.set(i, 100);
	}
	}
	System.out.println("After Replacing :"+list);
}
}
