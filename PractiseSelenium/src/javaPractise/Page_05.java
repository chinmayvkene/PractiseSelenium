package javaPractise;

import java.util.HashMap;
import java.util.Set;

public class Page_05 {

	public static void main(String[] args) {
		String[] a = { "avdhut", "jasmine", "avdhut", "rajesh", "maddy", "Keshav", "Priyanka", "maddy", "addy",
				"priyanka", "avdhut", "jasmine", "jasmine" };

		HashMap<String, Integer> smap = new HashMap<String, Integer>();
		
		for(String str1:a)
			if(smap.containsKey(str1))
				smap.put(str1, smap.get(str1)+1);
			else
				smap.put(str1, 1);
		
		Set <String> keys = smap.keySet();
		for(String key:keys)
			if(smap.get(key)>1)
				System.out.print(key+":"+smap.get(key)+" ");
	}
}
