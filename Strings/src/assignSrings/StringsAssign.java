package assignSrings;
import java.util.Scanner;


public class StringsAssign {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input
	        String input = scanner.nextLine();
	        scanner.close();

	        // Process
	        StringBuilder lowerPart = new StringBuilder();
	        StringBuilder upperPart = new StringBuilder();

	        for (char ch : input.toCharArray()) {
	            if (Character.isUpperCase(ch)) {
	                upperPart.append(ch);
	            } else {
	                lowerPart.append(ch);
	            }
	        }

	        // Output
	        System.out.println(lowerPart.toString() + upperPart.toString());
	    }
	}

