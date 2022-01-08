package JavaCodingQues;

public class SumOfAllDigitsinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*  They are Modulus Operator (%) and Division operator (/). 
		 * You know that, if we use modulus operator on any number like number%10, 
		 * then it will give last digit of the number. 
		 * And if we divide any number by 10 i.e number/10, 
		 * it will remove last digit from the number. For example, if 456 is the number, 
		 * then 456%10 = 6 and 456/10 = 45. 
		 * We use these two techniques to find the sum of all digits of a given number. */
		int InputNumber=111;
		
		int copyNumber=InputNumber;

		int sum=0;
		
		while(copyNumber !=0)
		{
			 int n =copyNumber%10;//gives=1,1,1
			 sum=sum+n;//1+1=2+
			 copyNumber=copyNumber/10;//11.,1
			
		}
		
		
			System.out.println(sum);
	
	}

}
