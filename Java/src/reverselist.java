import java.util.ArrayList;

import javax.swing.Spring;

public class reverselist {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> reverselist = new ArrayList<String>();
		list.add("a");
		list.add("ab");
		list.add("cd");
		list.add("abcd");
		
		for(int i=list.size()-1;i>=0;i--){
			
			reverselist.add(list.get(i));
		}
		
	        for (int i = 0; i < reverselist.size(); i++) { 
	            System.out.print(reverselist.get(i) + " "); 
	        } 
	    
	}
	

}
