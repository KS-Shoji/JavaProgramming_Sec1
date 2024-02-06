import java.util.*;
import java.io.*;
public class Lab1202 {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		Scanner readFile = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		System.out.print("Input your E-mail: ");
		String emailInput= input.next();
		boolean matched = false;
		
		while(readFile.hasNext()) {
			readFile.next();
			readFile.next();
			String password = readFile.next();
			String email = readFile.next();
		
			if(email.equals(emailInput)) {
				System.out.println("Your password is " + password);
				matched=true;
			}
			}
		readFile.close();
		if(matched=false) {
			System.out.println("The data not found...");
		
		}
		
	
	}
	
}
