package JavaCodingQues;
import java.util.ArrayList;
import java.util.HashSet;


/*In this method, we use HashSet to remove duplicate elements from an ArrayList.
 *  As you know, HashSet doesn’t allow duplicate elements. 
 *  We use this property of HashSet to remove duplicate elements from already constructed ArrayList.
 *   But, there is one disadvantage of this method. That is, it erases the insertion order of ArrayList elements. 
 *   That means, after removing the duplicate elements,
 *  elements will not be in the insertion order. Let’s see one example. */ //so use linkedhash maintains order
 
 
public class RemoveDuplicatesFromArrayListUsingHashSet
{
    public static void main(String[] args)
    {
        //Constructing An ArrayList
 
        ArrayList<String> listWithDuplicateElements = new ArrayList<String>();
 
        listWithDuplicateElements.add("JAVA");
 
        listWithDuplicateElements.add("J2EE");
 
        listWithDuplicateElements.add("JSP");
 
        listWithDuplicateElements.add("SERVLETS");
 
        listWithDuplicateElements.add("JAVA");
 
        listWithDuplicateElements.add("STRUTS");
 
        listWithDuplicateElements.add("JSP");
 
        //Printing listWithDuplicateElements
 
        System.out.print("ArrayList With Duplicate Elements :");
 
        System.out.println(listWithDuplicateElements);
 
        
        //Constructing HashSet using listWithDuplicateElements-to remove dups
 
        HashSet<String> set = new HashSet<String>(listWithDuplicateElements);
 
        //Constructing listWithoutDuplicateElements using set //converting back to list with above set
 
        ArrayList<String> listWithoutDuplicateElements = new ArrayList<String>(set);
 
        //Printing listWithoutDuplicateElements
 
        System.out.print("ArrayList After Removing Duplicate Elements :");
 
        System.out.println(listWithoutDuplicateElements);//or u can use set here in the method.
        
        //use this for maintaining insertion order:
        //Constructing LinkedHashSet using listWithDuplicateElements
        
        //LinkedHashSet<String> set = new LinkedHashSet<String>(listWithDuplicateElements);
    }
}