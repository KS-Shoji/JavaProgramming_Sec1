import javax.swing.*;
import java.util.*;
public class Lab501 {

	public static void main(String[] args) {
		char spacebar = ' ';
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Full Name: ");
		String fullName = input.nextLine();
		int space = fullName.trim().indexOf(" ");
		if (space==-1) {
			
			System.out.println("Incorrect Name");
			
		}else {
			String[] nameArray = fullName.split(" ");
			String firstName = nameArray[0];
			String lastName = nameArray[1];
			System.out.println("First Name: " + firstName.toUpperCase());
			System.out.println("Last Name: " + lastName.toLowerCase());
		}
	}

}
