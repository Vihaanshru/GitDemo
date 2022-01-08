package JavaPractice;

public class ConstructorPractise {
	

	 String name;
	int value;

	public ConstructorPractise(String book, int price) {
		// TODO Auto-generated constructor stub
		this.name=book;
		this.value=price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorPractise obj1=new ConstructorPractise("Selenium",8);
		
		System.out.println(obj1.name);
		
	}

}
