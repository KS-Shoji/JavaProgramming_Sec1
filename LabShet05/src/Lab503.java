import java.util.*;
public class Lab503 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Message : ");
		String message = input.nextLine();
		
		int wordCount = 0;
		if(message.toLowerCase().indexOf("nichi")>=0) {
			wordCount++;
			System.out.print("Nichi is a sentence");
		}
		else {
			System.out.print(message);
		}

	}

}
