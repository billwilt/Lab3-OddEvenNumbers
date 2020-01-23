import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		
		/*
		 * @author Bill Wilt
		 */
		
		Scanner keyboard = new Scanner(System.in);
		
		int chosenNumber;
		boolean wantToContinue;
		
		
		do {
			System.out.print("Enter a number between 1 and 100: ");
			chosenNumber = keyboard.nextInt();
			
			
			if (chosenNumber % 2 == 0) {
				
				if ((chosenNumber > 1) & (chosenNumber < 26)) {
					System.out.println("Even and less than 25.");
					
				}else if ((chosenNumber > 25) & (chosenNumber < 61)) {
					System.out.println("Even");
				} else 
					System.out.println(chosenNumber + " is even");
				
			} else if (chosenNumber > 60) {
				System.out.println(chosenNumber + " is odd and over 60");
				
			} else System.out.println(chosenNumber + " is odd");

			System.out.println("Would you like to continue (y/n)?");
			wantToContinue = keyboard.next().startsWith("y");
		} while (wantToContinue);
		
		System.out.println("Thank you for playing, goodbye!");
		
		keyboard.close();
	}

}
