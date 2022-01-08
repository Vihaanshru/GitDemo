package JavaCodingQues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.steadystate.css.util.Output;

public class TriangularNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Printing Triangular number for a number in Java */
		
		 
		int input[] = {1,2,3,4,5,6,7};//(1,1+2,3+2+1,4+3+2+1,5+4+3+2+1)
				//int i = 1;
				int sum=0;//initalizing one array for sum
				
		List<Integer> output = new ArrayList<Integer>();//declar arraylist for adding it and storing it as list
				
				//while( i <= input.length)
		for(int i=1;i<input.length;i++){
					
				
				    sum = sum + i;
				    output.add(sum);
				    
				    //i = i+1;
				
		    }System.out.println (output);
		     
	
	}}
		


