import java.util.Scanner;
public class StringManipulatorScanner {

	public static void main(String[] args) {
		
		String favoriteCity; //to hold favorite city
		
		//Create Scanner object to read input
		Scanner keyboard = new Scanner(System.in);
		
		//Get the user's favorite city
		System.out.print("Enter the name of your favorite city: ");
		favoriteCity = keyboard.nextLine();
		
		//Transform the user's input to upper, lower, length and index 0
		String upper = favoriteCity.toUpperCase();
		String lower = favoriteCity.toLowerCase();
		int stringSize = favoriteCity.length();
		char letter = favoriteCity.charAt(0);
		
		//Display the information
		System.out.println("You entered: " + favoriteCity);
		System.out.println("Uppercase: " + upper);
		System.out.println("Lowercase: " + lower);
		System.out.println("Number of Characters: " + stringSize);
		System.out.println("First Character: " + letter);
	}

}
