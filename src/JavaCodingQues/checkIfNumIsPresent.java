package JavaCodingQues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.steadystate.css.util.Output;

public class checkIfNumIsPresent {
	
	
	public static void main(String[] args) {
	
	
	
	int[] arr= {1,2,3,3,9,15};
	
	int sum=0;
	
	for(int i=0;i<arr.length;i++)
	{
		
		sum=sum+arr[i];
	}
	
	System.out.println(sum);
	
	
	
		for(int element:arr)
		{
			boolean isPresent=false;
			
			if(element==sum)
			{
			isPresent=true;
			
			}
		
		if(isPresent)
		{
			System.out.println("number is present");
			break;
		}
		else
		{
			System.out.println("number is not present");
			break;
		}
		
	}}}
	
	

		

		
	
			
		
		
		 


	
	
		


