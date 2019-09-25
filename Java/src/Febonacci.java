
public class Febonacci {

	public static void main(String[] args) {
		
		
		int febcount=20;
		int[] feb = new int[febcount];
		feb[0]=0;
		feb[1]=1;
		for(int i=2;i<febcount;i++){
			
			feb[i]=feb[i-1]+feb[i-2];
			
		}
		System.out.println(feb.length);
		for(int i=0;i<febcount;i++){
			System.out.print(feb[i] + " ");
			
			
		}
		
	}
	
}
