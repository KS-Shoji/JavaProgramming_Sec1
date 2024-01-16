import java.util.*;
public class BookDemo {	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Book b1 = new Book();
		
		
		System.out.print("Input book title   : ");
		String title = input.nextLine();
		
		System.out.print("Input book price   : ");
		float price = input.nextFloat();
		
		System.out.print("Input publish year : ");
		int year = input.nextInt();
		
		System.out.println("");
		
		b1.setTitle(title);
		b1.setPrice(price);
		b1.setPublishyear(year);
		
		System.out.println(b1);
		
		
		
		
		
	}
	
}
