import java.util.*;
import javax.swing.*;
public class Example_502 {

	public static void main(String[] args) {
		//1.input
		String urEmail = JOptionPane.showInputDialog("Input your e-mail:");				
		//2.check
		while(urEmail.startsWith("@") || urEmail.startsWith(" ")) {
		urEmail = JOptionPane.showInputDialog("Input your e-mail:");
		}	
		//3.check hotmail or gmail
		urEmail = urEmail.toLowerCase();
		if(urEmail.endsWith("hotmail.com")||urEmail.endsWith("gmail.com")) {
			JOptionPane.showMessageDialog(null, "Your e-mail is " + urEmail);
		}
		else {
			JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or" + " gmail.com");
			
		}
			
		
		
	}

}

