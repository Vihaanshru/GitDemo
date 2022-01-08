package JavaCodingQues;

public class maximumOccuranceOfCharacter_IMP_EASYWAY   
{  
     public static void main(String[] args) {  
        String str = "java is easy and fun";  //grass is greener on the other side";  
       
        int[] freq = new int[str.length()];  //Declare an array freq with the same size as that of string. 
        //Array freq will be used to store counts of unique character based upon their index.
        
        //3.Step:
        //Variable minChar represent the minimum occurring character and maxChar 
        //represent the maximum occurring character.
        //Initially, they are initialized to first character present in the string.(==j)
        char minChar = str.charAt(0), maxChar = str.charAt(0);  
       
        int i, j, min, max;          
          
        //Converts given string into character array  
        char string[] = str.toCharArray();  
          
        //Count each word in given string and store in array freq  
        //Step 4>Two loops will be used. 
       // Outer will select a character and initialize corresponding index in freq with 1.
        for(i = 0; i < string.length; i++) {  
            freq[i] = 1;  
           
            //Step 5.Inner loop will compare the selected character with rest of characters present in the string.
            //If a match found, then increment the freq[i] by 1.
            for(j = i+1; j < string.length; j++) {  
                if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {  
                    freq[i]++;  
                      
                    //Set string[j] to 0 to avoid printing visited character  
                    string[j] = '0';  
                }  
            }  
        }  
          
        //Determine minimum and maximum occurring characters  
        //Step 6.Variable min and max is used to store the count of minimum and maximum occurring character 
       // which will initially point to count of first element of freq i.e. freq[0].
        min = max = freq[0];  
        
        for(i = 0; i <freq.length; i++) {  
              
            //If min is greater than frequency of a character   
            //then, store frequency in min and corresponding character in minChar  
        	//7.Loop through the array freq and compare count of each 
        	//character stored in freq with min and max.
        	
        	//If count stored in freq is less than value of min, 
        	//then store that count in min and corresponding character in minChar.
            if(min > freq[i] && freq[i] != '0') {  
                min = freq[i];  
                minChar = string[i];  
            }  
            //8.If count stored in freq is more than value of max, 
            //then store that count in max and corresponding character in maxChar.
            //If max is less than frequency of a character   
            //then, store frequency in max and corresponding character in maxChar  
            if(max < freq[i]) {  
                max = freq[i];  
                maxChar = string[i];  
            }  
        }  
          //At the end of the loop, minChar will store 
        //the minimum occurring character and maxChar will store the maximum occurring character.

        System.out.println("Minimum occurring character: " + minChar);  
        System.out.println("Maximum occurring character: " + maxChar);  
    }  
}  
