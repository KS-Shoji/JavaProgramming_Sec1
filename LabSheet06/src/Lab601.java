import javax.swing.*;
public class Lab601 {

	public static void main(String[] args) {
		
		String urEmail = JOptionPane.showInputDialog("Input your e-mail:").toLowerCase();			

		
		boolean validateEmail = checkEmail(urEmail);
		if(validateEmail==true) {
			JOptionPane.showMessageDialog(null, "Your e-mail is " + urEmail);
		}
		else {
			JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail.com");
		}
		
	}

	public static boolean checkEmail(String email) {
		if(email.endsWith("hotmail.com") || email.endsWith("gmail.com")) {
			return true;
		}
		
		else return false;
	}
	
	
}
