
public class checknumber {
	
	
	public void number(Integer number){
		
		if(number<0)
		{
			System.out.println(number+" is negative");
		
		}else if (number >0){
			System.out.println(number+" is positive");
		}
	}
	public static void main(String[] args) {
		
		checknumber num =  new checknumber();
		num.number(2);
		num.number(-1);

	}

}
