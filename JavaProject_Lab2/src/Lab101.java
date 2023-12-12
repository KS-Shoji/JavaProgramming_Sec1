import java.text.DecimalFormat;
import java.util.*;
public class Lab101 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
	
		System.out.print("Input Product Name	: ");
		String productName = input.nextLine();
		
		System.out.print("Input Product Unit	: ");
		int productUnit = input.nextInt();
		
		System.out.print("Input price per unit  : ");
		float priceperUnit = input.nextFloat();
		
		System.out.println("----------------------------------------");
		
		float totalPrice = productUnit * priceperUnit;
		System.out.println("Total Price is "+frm.format(totalPrice) + " baht.");
		
		System.out.println("----------------------------------------");
		

		System.out.print("How many discount (%) : ");
		int discount = input.nextInt();
		
		System.out.println("----------------------------------------");
		
		System.out.println("Discount from " + discount + "%" + totalPrice(totalPrice * 7/100) + " baht.");
		System.out.println("Amount to be paid	 " + (totalPrice - discount + " baht."));
	}

}
