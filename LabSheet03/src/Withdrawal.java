import javax.swing.*;
import java.util.*;
import java.text.*;

public class Withdrawal {
	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		int withdraw = Integer.parseInt(JOptionPane.showInputDialog("Your balance : " + frm.format(balance) + "\nInput money to withdraw:"));

		int athousand = withdraw/1000;
		int fivehundred = withdraw%1000/500;
		int ahundred = withdraw%1000%500/100;
		int remainder = withdraw%1000%500%100;
		
		if (withdraw > balance) {
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than balance", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		else if(withdraw > 20000) {
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than 20,000", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		else if (remainder != 0) {
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw " + remainder + " baht.", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, "You withdrawed " + frm.format(withdraw) + " baht.");
		}
		
	}

}
