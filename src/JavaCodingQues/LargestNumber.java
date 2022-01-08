package JavaCodingQues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.steadystate.css.util.Output;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Largest number
		
		int arr[]= {10,20,40,200,100};
					
		int temp;
		
		for(int i=0;i<arr.length;i++)
		{
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];//put not the output
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
			
			
		}
		System.out.println("largest number is"+arr[0]);
		
					
					
					
				}
			}
		
		
		 


	
	
		


