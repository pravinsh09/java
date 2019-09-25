package inherit_Interface;

public class Class_A implements Interface1 {
	
	@Override
	public void firefox() {
		
		
		System.out.println("inside firefox");
		
	}

	@Override
	public void chromedriver() {
		
		System.out.println("inside chromedriver");
		
	}
	
	
	public static void main(String[] args) {
		
		Interface1 c = new Class_A();
		c.chromedriver();
		
		
		
	}


	

	
}
