package JavaCodingQues;
import java.util.*;



public class MaximumOccuringCharacter_IMP
{
	
	//whattodo i/p
	//o/p==o
	
	//javaiseasyandfun
	//a
	
	//dosent work if there is white sapce
  public static void main(String[] args) {
      Scanner in = new Scanner(System. in);
     System.out.println("Enter your input:");
      String k = in.nextLine();
      
      char tempArray[] = k.toCharArray(); 
       Arrays.sort(tempArray); 
        
       String s = new String(tempArray);
        int n = s.length();
        int max_count = 0;
        int count = 1;
        char ans = '-';
        for (int i = 1; i <= n; i++)
        {
            if ((i == n) || (s.charAt(i) != s.charAt(i - 1)))
            {
                if (max_count < count)
                {
                    max_count = count;
                    ans = s.charAt(i-1);
                }
                count = 1;
            }
            else
            {
                count++;
            }
        }
    System.out.println("Maximum occurring character is "+ans);
  }
}