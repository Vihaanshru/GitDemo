
package JavaCodingQues;
public class SumOfEvenAndOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//odd sum
		
		
		int a[]= {1,3,2,4};
		
		int evensum=0;
		int oddsum=0;
		
		for(int i=0;i<a.length;i++)
		{
			
			if(a[i]%2==0)
			{
				evensum=evensum+a[i];
			}
			
			else
			{
				oddsum=oddsum+a[i];
			}
		}
		
		System.out.println("Odd sum"+"="+oddsum);
	}}
