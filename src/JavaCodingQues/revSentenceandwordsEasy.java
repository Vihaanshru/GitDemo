package JavaCodingQues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.steadystate.css.util.Output;

public class revSentenceandwordsEasy {
	
	
	public static void main(String[] args) {
	
	
	
		//reverse each word: Reverse Me--->esreveR eM;
		
		
		String text="Reverse Me";
		
		String rev="";
		
		for(int i=text.length()-1;i>=0;i--)
		{
			rev=rev+text.charAt(i);
			
			
		}
		
		System.out.println(rev);
		
		String[] arr=rev.split(" ");
	
    	String finaloutput="";
    	
    	
    	for(int j=arr.length-1;j>=0;j--)
    	{
    		
    		finaloutput=finaloutput+arr[j]+" ";
    		
    	}
    	
    	System.out.println(finaloutput);
}}
		
		
		
		

		
	
			
		
		
		 


	
	
		


