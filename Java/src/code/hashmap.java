package code;

import java.util.HashMap;

public class hashmap {

	public static void main(String[] args) {
		
		String str ="esting";
		char[] c = str.toCharArray();
		
				
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
		 if(charCountMap.containsKey(c))
         {
		
		System.out.println("count--"+charCountMap.get(c)+1);
		System.out.println("count--"+charCountMap.get(c));
	}else {
		System.out.println("count--"+charCountMap.get(c));
		//System.out.println("count--"+charCountMap.get(c)+1);
		Integer i=charCountMap.get(c);
		System.out.println(i);
		System.out.println(i);
	}
	}
}
