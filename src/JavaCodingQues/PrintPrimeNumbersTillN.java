package JavaCodingQues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.steadystate.css.util.Output;

public class PrintPrimeNumbersTillN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//check if number is prime:
		
		
		
		int n=10;//find all the prime numbers until n=10 i.e from 1 to 10
		
		for(int i=1;i<n;i++)
		{
			//i=1
			boolean isPrime=true;
			
			for(int j=2;j<=i/2;j++)
			{
				
				if(i%j==0) {
					isPrime=false;
				break;
				}
			}
			if(isPrime)
			{
				System.out.println(i+" is a prime numbers");
			}
			else
			{
			
					System.out.println(i+"is Not prime number");
				}
			}
		}}

		
	
			
		
		
		 


	
	
		


