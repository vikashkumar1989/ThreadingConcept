package multiTreadingConepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collection {
	
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("name1");
		list.add("name2");
		list.add("name3");
		list.add("name8");
		list.add("name9");
		list.add("name6");
		list.add(null);
		
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		Collections.sort(list);
		Iterator<String> itr2=list.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		Map<Integer,String> mp=new HashMap<Integer, String>();
		
		mp.put(1, "Vikash1");
		mp.put(2, "Vikash2");
		mp.put(3, "Vikash3");
		mp.put(4, "Vikash6");		
		mp.put(5, "Vikash5");
		
		
		
		System.out.println(mp.get(1));
		Set<Integer> str=mp.keySet();
	
	}

}
