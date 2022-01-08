package JavaCodingQues;
public class RotateString
{
    public static void main(String[] args)
    
    //JavaJ2eeStrutsHibernate=s1
    //StrutsHibernateJavaJ2ee=s2
    {
        String s1 = "shrutivihaan";
 
        String s2 = "vihaanshruti";
 
        //Step 1
 
        if(s1.length() != s2.length())
        {
            System.out.println("s2 is not rotated version of s1");
        }
        else
        {
            //Step 2
 
            String s3 = s1 + s1;//JavaJ2eeStrutsHibernateJavaJ2eeStrutsHibernate//shrutivihaanshrutivihaan
 
            //Step 3
 
            if(s3.contains(s2))
            {
                System.out.println("s2 is a rotated version of s1");
            }
            else
            {
                System.out.println("s2 is not rotated version of s1");
            }
        }
    }
}