import java.text.DecimalFormat;
import javax.swing.*; //dialog box
import java.util.*;
public class Example4 {

	public static void main(String[] args) {
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		String productName = JOptionPane.showInputDialog("Input product name : ");
		
		String strUnit = JOptionPane.showInputDialog("Input product unit : ");
		int productUnit = Integer.parseInt(strUnit);
		
		String strPrice = JOptionPane.showInputDialog("Input product price : ");
		float productPrice = Float.parseFloat(strPrice);
				
		float totalPrice = productUnit * productPrice;
		
		double vat = totalPrice +(totalPrice*7/100);
		JOptionPane.showMessageDialog(null, "Total Price is " +frm.format(totalPrice) + " baht." +"\nAdd VAT 7% is "+frm.format(vat) + " baht.");
		
		
	}

}
