package JavaCodingQues;


public class ReverseEachWord
{
	public static void main(String[] args) {
   
    	
    	String text="Reverse Me";
    
        String[] array = text.split(" ");
         
        String reverseString = "";
         
        for (int i = 0; i < array.length; i++) 
        {
            String word = array[i];
             
            String reverseWord = "";
             
            for (int j = word.length()-1; j >= 0; j--) 
            {
                reverseWord = reverseWord + word.charAt(j);
            }
             
            reverseString = reverseString + reverseWord + " ";
        }
         
        System.out.println(text);
         
        System.out.println(reverseString);
         
        System.out.println("-------------------------");
    }
}

