package code;

import java.util.ArrayList;
import java.util.List;

public class Collection1 {

	public static void main(String[] args) {
		
		
		
		List<String> fruitlist = new ArrayList<>();
		fruitlist.add("apple");
		fruitlist.add("orange");
		fruitlist.add("papaya");
		fruitlist.add("kiwi");
		
		
		String[] Item = fruitlist.toArray(new String[fruitlist.size()]);  
		for(String fruit : Item ){
			System.out.println(fruit);		
		}
		
	}

}
