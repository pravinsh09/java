
public class greatestnumber {

	public static void main(String[] args) {
		
		
		
		int number[]={1,4,9,8};
		int temp;  
		for(int i=0;i<number.length;i++){
			
			for(int j=i+1;j<number.length;j++){
				
				if(number[i]>number[j]){
					
					 temp = number[i];  
					 number[i] = number[j];  
					 number[j] = temp;
				}
			}
		}
		
		System.out.println(number[number.length-1]);

	}

}
