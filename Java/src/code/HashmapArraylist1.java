package code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashmapArraylist1 {
	
	
	public static void main(String[] args) {
	Map<String,Boolean> antwoorden1 = new HashMap<>();
	Map<String,Boolean> antwoorden2 = new HashMap<>();
	
	
	/*HashMap antwoorden1 = new HashMap();
    HashMap antwoorden2 = new HashMap();
*/
       // Awnsers question 1
    antwoorden1.put("Hypertext Preprocessor",true);
    antwoorden1.put("Hypertext PHPprocessor2", false);        
    antwoorden1.put("Hypertext processor", false);
    antwoorden1.put("Preprocessor PHP", false);
    // Awnsers question 2
    antwoorden2.put("Model view config",false);
    antwoorden2.put("Model view connect", false);        
    antwoorden2.put("Model view controllers", false);
    antwoorden2.put("Model view controller4", true);  

    //ArrayList<HashMap> alleAntwoorden =  new ArrayList<HashMap>();
    List <Map<String, Boolean>> alleAntwoorden = new ArrayList<>();
    // Add the Hashmaps to the arrayList
    alleAntwoorden.add(antwoorden1);
    alleAntwoorden.add(antwoorden2);
    System.out.println(alleAntwoorden.size());
    
    for(int i = 0; i < alleAntwoorden.size(); i++)
    {

    	Iterator it = (Iterator)alleAntwoorden.get(i).entrySet().iterator();

         while (it.hasNext()) {
        	System.out.println(it.hasNext());
            Map.Entry pairs = (Map.Entry)it.next();
            System.out.println(pairs.getKey() + " = " + pairs.getValue());
            it.remove(); // avoids a ConcurrentModificationException
        }

    }

	}
}
