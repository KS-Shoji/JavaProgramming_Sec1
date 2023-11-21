import javax.swing.*;
import java.util.*;
import java.text.*;

public class IceCream {

	public static void main(String[] args) {

		int flavor;
		int total = 0;
		
		final int vanilla = 10;
		final int chocolate = 15;
		final int topping = 5;
		
		do {
		flavor = Integer.parseInt(JOptionPane.showInputDialog("[1] Vanilla Flavor 10 B." + "\n[2] Chocolate Flavor 15 B." + "\nPress number to choose flavor:"));
		}while (flavor != 1 && flavor != 2); 	

		int toTotal = (flavor == 1) ? vanilla : ((flavor == 2) ? chocolate : 0);
		
		int toppingOption;
		
		toppingOption = JOptionPane.showConfirmDialog(null, "Do you want to add topping?", "TOPPING", JOptionPane.YES_NO_OPTION);
		int toppingYN = (toppingOption == JOptionPane.YES_OPTION) ? total + 5 : total + 0;
		
		


	
	}
}
