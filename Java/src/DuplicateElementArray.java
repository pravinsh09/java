import java.util.Arrays;

public class DuplicateElementArray {

	public static void main(String[] args) {
		
		
		 int a[]={1,2,5,6,5,1,3};
		 
		 for(int i=0; i<=a.length;i++){
			 
			 for(int j=i+1;j<=a.length-1;j++){
				 
				 if(a[i]==a[j]){
					System.out.println(a[i]);
//					/break;
					 
				 }
			 }
		 }

	}

}
