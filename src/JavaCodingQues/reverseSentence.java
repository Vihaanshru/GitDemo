package JavaCodingQues;

public class reverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text= "sky is sunny and blue.";
		
		//Put it to string array--very imp
		
		String[] newtext=text.split(" ");
		
		String rev="";
		
		for(int i=newtext.length-1;i>=0;i--)
				{
			
			rev=rev+newtext[i]+" ";				
		

	}
	System.out.println(rev);

}
}
