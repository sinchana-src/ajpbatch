package day3;

public class gradevalidation {

	public static void main(String[] args) {
		char grade = 'C';

        switch (grade)
        {
            case 'A':
                System.out.println("Excellent");
                break;

            case 'B':
                System.out.println("Good");
                break;

            case 'C':
                System.out.println("Bad");
                break;

            default:
                System.out.println("Invalid grade");
        }
    }
}
