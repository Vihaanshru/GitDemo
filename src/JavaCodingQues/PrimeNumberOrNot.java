package JavaCodingQues;


//import com.google.common.collect.Maps;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//prime or not
		
		int num=11;
		
		boolean isPrime=true;
		
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				
				isPrime=false;
				break;
			}	
		}
		if(isPrime==false)
		{
			System.out.println(num +" "+ " is not a prime number");
		}
		else
		{
			System.out.println(num + " "+" is a prime number");
		}
		
		

}}
