package JavaCodingQues;

import java.util.Arrays;

public class MergeTwoArrayAndSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//merge two arrays and sort
		int[] arrA=new int[] {1,3,5};
		int[] arrB=new int[] {2,4,6};
		int[] mergearr=mergedArray(arrA,arrB);
		
		System.out.println("Array A : "+Arrays.toString(arrA));
        
        System.out.println("Array B : "+Arrays.toString(arrB));
         
        System.out.println("Merged Array : "+Arrays.toString(mergearr));
	}
	
	public static int[] mergedArray(int arrA[],int arrB[] ) {
		
		//int arrA[]= {1,3,5} ;
		
		//int arrB[]= {2,4,6};
		//O/p= {1,2,3,4,5,6}
		
		
		int[] mergedArray=new int[arrA.length+arrB.length];
		
		int i=0;int j=0; int k=0;
		
		
      //1.Move arrAto mergedArray
		while(i<arrA.length)
		{
			mergedArray[k]=arrA[i];
			i++;
			k++;

		}	
		
		//2.Move arrB to merged array
		
		while(j<arrB.length)
		{
			
			mergedArray[k]=arrB[j];
		j++;
		k++;
		}
		Arrays.sort(mergedArray);
		//return mergedArray;
		
	
		return mergedArray;
	}}

		


