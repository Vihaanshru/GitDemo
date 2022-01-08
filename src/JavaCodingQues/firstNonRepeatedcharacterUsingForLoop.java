package JavaCodingQues;

//findthe First Occurance or non repeated character or Unique character
public class firstNonRepeatedcharacterUsingForLoop {

	
	
	 public static void main(String[] args) {
	  String str1 = "abab";
	  System.out.println("The given string is: " + str1);
	  for (int i = 0; i < str1.length(); i++) {
	   boolean unique = true;
	   for (int j = 0; j < str1.length(); j++) {
	    if (i != j && str1.charAt(i) == str1.charAt(j)) {
	     unique = false;
	     break;
	    }
	   }
	   if (unique) {
	    System.out.println("The first non repeated character in String is: " + str1.charAt(i));
	    break;
	   }
	 }
	}}
