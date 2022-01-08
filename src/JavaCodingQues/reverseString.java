package JavaCodingQues;

public class reverseString{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Reverse String :
		//Input= Reverse Me
		//Output=eM esreveR
		
		//Reverse Sentence:--check other program
		//Input= Sky is sunny and blue
		//Output=blue and sunny is Sky
		
		//Reverse sentence and words-Check other program
		
		String name="vihaan";
		
		String rev_name="";	
		
		for(int i=name.length()-1;i>=0;i--)//length=6 but we need to give index so do -1 ;
			//i> or equal to zero is always true here 
			//
		{
			rev_name=rev_name+name.charAt(i)+"";
			
		}
		System.out.println(rev_name);
		convertingStringtoCharArray("Reverse Me");
		
	}

	
	public static void convertingStringtoCharArray(String newname)
	{
		
		//String name1="shruti";
		String rev="";
		
		//convert String to char array
		
		char[] arr=newname.toCharArray();
		
		for(int i=arr.length-1;i>=0;i--)
		{
			rev=rev+arr[i];
			
		}
		
		System.out.println(rev);
		
		if(newname.equalsIgnoreCase(rev))
		{
			System.out.println("string palindrome");
			
		}
		else
		{
			System.out.println("string not palindrome");
		}

	}
}
