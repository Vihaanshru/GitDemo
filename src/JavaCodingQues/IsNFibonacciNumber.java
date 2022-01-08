package JavaCodingQues;

public class IsNFibonacciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int InputNumber=34;//17711
		
		int a=0;
		int b=1;
		int c=0;//sum
		
		while(c<InputNumber)
		{
			c=a+b;
			a=b;
			b=c;	
		}
if(c>InputNumber)
{
	System.out.println("Number is not a fibonacci series");
}
else

	{
		System.out.println("Number is  a fibonacci series");
	}

		
	}

}
