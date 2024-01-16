
import java.util.*;
public class Lab603 {

	public static void main(String[] args) {
		
		String firstName;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your name, seperated by a space.\n:");
		String fullname = input.nextLine();

		
	}
	
	public static String abbreviatName(String fullname) {
		
		String firstName, midName, lastName;
		String str = "";
		
		char[] nameArray = fullname.toCharArray();

		for (int i = 0; i<fullname.length();i++) {
		
			if (nameArray[i] == ' ') {
				fullname = 
			}
			
			nameArray[i] = fullname.charAt(i);
			System.out.println(nameArray[i]);
			
			
		}
		
		
	}

}
