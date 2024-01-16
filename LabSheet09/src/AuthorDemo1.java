import java.util.*;
public class AuthorDemo1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		System.out.print("Input author name   : ");
		String name = input.nextLine();
		
		System.out.print("Input author email  : ");
		String email = input.nextLine();
		
		System.out.print("Input author gender : ");
		char gender = input.next().charAt(0);
		
		System.out.println("");
		
		Author a1 = new Author(name, email, gender);
		System.out.println(a1);
	}
}
