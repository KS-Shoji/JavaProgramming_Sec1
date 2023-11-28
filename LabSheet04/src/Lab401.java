import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);

	System.out.print("Input value of X : ");
	int valX = console.nextInt();
	System.out.print("Input value of Y : ");
	int valY = console.nextInt();
	
	if (valY < valX) {
		do {
			System.out.print("Input value of Y, again : ");
			valY = console.nextInt();
			
		} while (valY < valX);
	}
	
	int valXX = valX;
	int valYY;
	int sum = 0;
	
	for(int i=valX;i<valY;i++) {
		
		valYY = i+1;
		sum = valXX + valYY;
		
		
		System.out.print(valXX+" + "+valYY+" = " + sum + " \n");
		
		valXX = sum;
		
	}	
	}

}
