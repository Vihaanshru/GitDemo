package JavaCodingQues;

import java.util.Arrays;

public class MoveAllZerosToBeginning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Given Input array:
		
		int inputarray[]= {2,3,0,5,6,0,8,9,9,0,0};
		
		//Initializing counter to position of last element
		int counter=inputarray.length-1;
		
		//Traverse array from right to left
		for(int i=inputarray.length-1;i>=0;i--)
		{
			
			if(inputarray[i] !=0)
			{
               inputarray[counter]=inputarray[i];
               counter--;
			}		
		}
		
		while(counter >= 0)
		{
			inputarray[counter]=0;
			counter--;
		}
		
		System.out.println(Arrays.toString(inputarray));
	}

}
