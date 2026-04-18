package day3;

public class nestedif {

	public static void main(String[] args) {
	   int a=5;
	   if(a<=10)
	   {
		   System.out.println("insider outer if");
		   if(a==5)
		   {
			   System.out.println("a is greater to 5");
		   }
		   else
		   {
			   System.out.println("a is not equal to 5");
		   }
	   }
	   else
	   {
		   System.out.println("a is greater than 10");
	   }
	}
}

