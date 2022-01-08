package JavaCodingQues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.steadystate.css.util.Output;

public class easyMergeANDSort {
	
	
	public static void main(String[] args)
	{
		
		int a[]= {1,2,3};
		int b[]= {4,5,6};
		System.out.println(Arrays.toString(mergedoutput(a,b)));
		
    	
		
	}
	
    public static int[] mergedoutput(int a[], int b[]) {
      //merge two arrays
    	
    	
    	//int a[]= {2,3,4};
    	//int b[]= {4,5,6};
    	
    	
    	int[] mergedarra=new int[a.length+b.length];
    	
    	int k=0;
      
      for(int i=0;i<a.length;i++)
      {
    	  mergedarra[k]=a[i];
    	  k++;
    	  
      }
      for(int j=0;j<b.length;j++)
      {
    	  mergedarra[k]=b[j];
    	  k++; 
      }
    	
      Arrays.sort(mergedarra);
      
      return mergedarra;
      //System.out.println(Arrays.toString(mergedarra));
    	
    	
    	
}}
		
		
		
		

		
	
			
		
		
		 


	
	
		


