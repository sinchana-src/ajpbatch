package day4;

public class pattern {
	
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i += 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // move to next line
        }
    }
}
