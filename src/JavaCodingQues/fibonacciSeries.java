package JavaCodingQues;

public class fibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		
		int a = 0, b = 1, c;
        if (n == 0)
            
        System.out.println(a);
        for (int i = 2; i <= n; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(b);
		
	}

}
