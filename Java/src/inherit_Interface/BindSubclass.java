package inherit_Interface;

public class BindSubclass extends BindParent  {
	
	public void subclass1(){
		
		System.out.println("inside subclass 1");
	}
	
	public void duplicate(){
		
		System.out.println("inside duplicate subclass ");
	}
	
	public static void  duplicate2(){
		
		System.out.println("inside static duplicate2 subclass");
	}
	
	
	public static void main(String[] args) {

		
		BindParent b = new BindSubclass();
		b.parent1();
		b.duplicate();
		BindSubclass.duplicate2();
		
		
	}

}
