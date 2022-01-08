package JavaCodingQues;

public class checkIfNumberIsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			    int num = 100;
			    boolean isPrime = true;
			    for (int i = 2; i <= num / 2; ++i) {
			      // condition for nonprime number
			      if (num % i == 0) {
			    	  isPrime = false;
			        break;
			      }
			    }

			    if (isPrime==true)
			      System.out.println(num + " is a prime number.");
			    else
			      System.out.println(num + " is not a prime number.");
			    //Simple code added for git
			  }
			
	}


