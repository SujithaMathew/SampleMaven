package Day8List;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Example {
public static void main(String[] args) {
	TreeMap<Integer,String> stu=new TreeMap<>();
	stu.put(10, "Suji");
	//stu.put(10,"Jose");
	//stu.put(10, "Sowmi");
	stu.put(5,"Bria");
	stu.put(30, null);
	stu.put(40, null);
	
	System.out.println(stu);
	/*boolean c = stu.containsKey(30);
	System.out.println("ContainsKey :"+c);
	boolean k = stu.containsValue("Bria");
	System.out.println("ContainsValue :"+k);
	Set<Integer> ks = stu.keySet();
	System.out.println("Key :"+ks);
	Collection<String> v = stu.values();
	System.out.println("Values :"+v);
	System.out.println(stu.get(10));
	System.out.println(stu.size());
	Set<Entry<Integer, String>> es = stu.entrySet();
	for(Entry<Integer, String> entry:es) {
		System.out.println(entry);
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
		//System.out.println();*/
		
	}
}
