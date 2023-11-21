import javax.swing.*;
import java.text.*;
import java.text.DecimalFormat;

public class Example1 {
	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		final int BUFFET = 299;
			//input via dialog box -> int number
		int numofCustomer = Integer.parseInt(JOptionPane.showInputDialog("How many customer per bill"));
		double discount, totalPrice = 0;
		//total price of Buffet
		totalPrice = BUFFET * numofCustomer;
		//using Confirm Dialog Box
		int member;
		
		do {
			member = JOptionPane.showConfirmDialog(null, "Total price is "
					+ frm.format(totalPrice) + " baht." 
					+ "\nDo you have a member card?");
		}while(member==JOptionPane.CANCEL_OPTION);
		
		
		if (member == JOptionPane.YES_OPTION) {
			discount = totalPrice * 90/100;
			JOptionPane.showMessageDialog(null, "Amount to be paid is " + frm.format(discount) + " baht.");
			
		}
		else if (member == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Amount to be paid is "+frm.format(totalPrice) + " baht.");
			
		}
		
		
		
	}

}
