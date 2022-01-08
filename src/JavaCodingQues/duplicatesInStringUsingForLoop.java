package JavaCodingQues;

public class duplicatesInStringUsingForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Algorithm
1.Define a string.//ex: Great responsibility
2.Two loops will be used to find the duplicate characters.
 Outer loop will be used to select a character and initialize variable count by 1.
3.Inner loop will compare the selected character with rest of the characters present in the string.
4.If a match found, it increases the count by 1 and set the duplicates of selected character by
 '0' to mark them as visited.
5.After inner loop, if count of character is greater than 1, then it has duplicates in the string.

		 */

		String text="freshfish";
		char arr[]=text.toCharArray();
		
		for(int i=0;i<arr.length;i++)
		{
			int counter=1;	//or set to 1

			for(int j=1;j<arr.length;j++)
		{
				
			
			if(i != j && arr[i]==arr[j])
			{
			counter++;
			 //Set string[j] to 0 to avoid printing visited character  
		arr[j]='0';
			
		
			}					
		}
			if(counter>1 && arr[i] != '0' )
			{
				System.out.println(arr[i]);
			}
			
			
			
		}		
	}
}
