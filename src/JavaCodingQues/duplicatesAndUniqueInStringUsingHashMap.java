//How to count duplicate characters
package JavaCodingQues;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
 

/*
 * Pseudo steps
1.Split the string into character array.
2.Iterate over character array.
3.For each iteration, use character as map key and check is same character is present in map, already.
4.If map key does not exist it means the character has been encountered first time. Store it in map with count value to 1.
5.If map key exist, increment the counter.
6.Repeat until all characters in array has been iterated.
7.Check map. Duplicate characters have count more than 1.
8.Distinct characters will have count as 1.
 */
public class duplicatesAndUniqueInStringUsingHashMap 
{
    public static void main(String[] args) 
    {
        String blogName = "ABCAABCAEBEDF";//howtodoinjava dot com
        char[] chars = blogName.toCharArray();
         
        Map<Character, Integer> map = new LinkedHashMap<>();
        //here we can use Hasmap but linkedhashmap maintains the order of insertion.
        //in this case last line of code with entry set is not required
       
        for(char c : chars) 
        {
            if(map.containsKey(c)) {
                int counter = map.get(c);
                map.put(c, ++counter);
            } else {
                map.put(c, 1);
            }
        }
         
        System.out.println("Duplicate characters:");
         
        //Print duplicate characters
        for(char c : map.keySet()) {
            if(map.get(c) > 1) {
                System.out.println(c);
            }
        }
         
        System.out.println("Duplicate characters excluding white space :");
         
       //Print duplicate characters excluding white space
        for(char c : map.keySet()) {
            if(map.get(c) > 1 && !Character.isWhitespace(c)) {
                System.out.println(c);
            } 
        } 
         
        System.out.println("Distinct characters:");
         
        //Print distinct characters
        for(char c : map.keySet()) {
            if(map.get(c) == 1) {
                System.out.println(c+" = "+map.get(c));
                //System.out.println(map.get(c));
                break;
   
            }
        }
        
//        System.out.println("First unique characters:");
//        
//        // Find the first character with count 1
//        for(Entry<Character, Integer> c: map.entrySet()){
//         if(c.getValue() == 1){
//          System.out.println(c.getKey());
//          break;
//         }
    }}
