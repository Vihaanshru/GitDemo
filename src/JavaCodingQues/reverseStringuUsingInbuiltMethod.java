package JavaCodingQues;

public class reverseStringuUsingInbuiltMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder s=new StringBuilder("Vihaan");
		System.out.println(s.reverse());
		usingAltmethod("Shruti");
	}
	
	public static void usingAltmethod(String name)

	{
		//String name1="shruti";
		
		String rev="";
		
		char ch;
		
		for(int i=0;i<name.length();i++)
		{
			 ch=name.charAt(i);//extracts each character
			 System.out.println(ch);// s h r u t i
			 rev=ch+rev;//rev=sh
			 ////adds each character in front of the existing string
	      }
		
		
		System.out.println(rev);
	}
}
