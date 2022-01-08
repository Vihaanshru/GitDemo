package JavaPractice;

import java.util.Arrays;

public class practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[]= {1,2,3,4,5,6,0,0,0,10};
		
		
		int counter=arr.length-1;
		
		
		for(int i=arr.length-1;i>=0;i--)
		{
			
			if(arr[i] !=0)
			{
				arr[counter]=arr[i];
				counter--;
				
			}
	
			
		}
		
		while(counter>=0)
		{
			
			
			arr[counter]=0;
			counter--;
		}
	System.out.println(Arrays.toString(arr));
}
}		