package JavaCodingQues;

public class max2numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 //take two variables and initiliaze them with zero.Iterate through each element of the array and compare each number 
		//against these two number. If current number is greater than maxOne then maxOne = number and maxTwo = maxOne.
		int array[]= {47498, 14526, 74562, 42681, 75283, 45796};
		
		int max1=0;
		int max2=0;
		
		for(int i=0;i<array.length;i++)
		{
			
				if(max1<array[i])
				{
					max2=max1;
					max1=array[i];
				}
				
				else	if(max2<array[i])//Otherwise if it only greater 
					//than maxTwo then we only update maxTwo with current number.
				{
					max2=array[i];
				}
		}
		
		System.out.println("second largest number="+ max2);
	}

}
