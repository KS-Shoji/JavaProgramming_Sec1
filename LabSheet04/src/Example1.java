import java.util.*;
public class Example1 {
	public static void main(String[] args) {
		//define object for input data from keyboard or console
		Scanner scan = new Scanner(System.in);
		
		//display message and input data (1st num)
		System.out.print("Input a number : ");
		int prevNum = scan.nextInt();
		
		int currentNum;
		
		//loop for 2nd num
		while(true) {
			System.out.print("input a number : ");
			currentNum = scan.nextInt();
			if(currentNum < prevNum) {
				System.out.println("Bye Bye");
				break;
			}
			prevNum = currentNum;
		}
		
	}

}
