import java.util.*;
import javax.swing.*;
public class Lab502 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Input some sentence : ");
		String sentence = input.nextLine();
		
		while(!sentence.endsWith(".")) {
			System.out.print("The sentence must ends with a full stop : ");
			sentence = input.nextLine();
		}
		System.out.println();
		for (int i = 0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				System.out.print("\n");
			}
			else {
				System.out.print(sentence.charAt(i));
			}
			
			
			}
		

	}

}
