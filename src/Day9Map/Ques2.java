package Day9Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Ques2 {
public static void main(String[] args) {
	HashMap<Integer,String> edu=new HashMap<>();
	
	edu.put(10,"java");
	edu.put(20,"sql");
	edu.put(30,"oops");
	edu.put(40,"Sql");
	edu.put(50,"oracle");
	edu.put( 60,"DB");
	edu.put(10,"selenium");
	edu.put( 50,"psql");
	edu.put( 40,"Hadoop");
	
	System.out.println(edu);
	Set<Entry< Integer,String>> e = edu.entrySet();
	for (Entry< Integer,String> entry : e) {
		System.out.println(entry);
		System.out.println(entry.getKey());
		System.out.println(entry.getValue());
		System.out.println();
	}
	
}
}
