package assigmentprogram;

public class marksvalidation {

	public static void main(String[] args) {
		    
		    int marks=89;
		    
		    if(marks>=81 && marks<=100) {
		    	System.out.println("distinction");
		    }
		    else if(marks>=60 && marks<=80) {
		        System.out.println("first class");
		    }
		    else if(marks>=35 && marks<=58) {
		    	System.out.println("Second Class");
		    }
		    else if(marks>=0 && marks<=34) {
		    	System.out.println("Fail");
		    }
		    else
		    {
		    	System.out.println("Invalid marks");
		    }
		    	
		   }
		}