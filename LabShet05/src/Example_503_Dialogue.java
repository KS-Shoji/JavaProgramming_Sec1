import javax.swing.*;
import java.util.*;
public class Example_503_Dialogue {

	public static void main(String[] args) {
		String sentence = JOptionPane.showInputDialog("Input a sentence: ");
		
		while(!sentence.endsWith(".")) {
			
			sentence = JOptionPane.showInputDialog("Input a sentence, again: ");
			
		}
		System.out.println();
		
		int spacebar = 0;
		
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				spacebar++;
			}
		}

		JOptionPane.showMessageDialog(null, "This sentence has " + spacebar+" spacebars.");
		JOptionPane.showMessageDialog(null, "This sentence has " + (spacebar+1)+" words.");	
		
		
	}
}
	
