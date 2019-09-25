package code;

  interface test1 {

	  public void method1();
		
}
  
  public class testClass implements test1{

	@Override
	public void method1() {
		System.out.println("testing1");
		
	}
	  
	public static void main (String[] args) 
    { 
        testClass t = new testClass(); 
        t.method1(); 
        //System.out.println(t.method1());
       
        
    }   
	  
  }
 
  
  
  
 