package JavaCodingQues;

import java.util.Arrays;

public class MoveZerosToEndOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1.Given Input array:
		
		int array[]= {10,20,0,40,0,60,0,1,0};
		
		//2.initialize counter to move all the non zero elements to it
		
		int counter=0;
		
		//3.traverse the array from left to right
		for(int i=0;i<array.length;i++)
		{
			////If inputArray[i] is non-zero
			if(array[i]!=0)
			{
				//4.Assigning Array[i] to Array[counter]
				array[counter]=array[i];
				//5.incrementing counter by 1
				counter++;
			}		
		}
		
		//6.Assigning zero to remaining elements// imp remeber while statement here not if
		while(counter<array.length)
		{
			array[counter]=0;
			counter++;
		}
		
		System.out.println(Arrays.toString(array));

	}

}
