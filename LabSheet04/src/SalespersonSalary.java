import java.util.*;
public class SalespersonSalary {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		final double COMMISSION_RATE = 0.15;
		final int SENTINEL = -1;
		
		
		int sales;
		double salary;
		 
		
		while(true) {
			System.out.print("Enter sales in dollars (or -1 to end): ");
			sales = console.nextInt();
			salary = 1000 + sales*COMMISSION_RATE;
			System.out.printf("Salary is: $%.2f",salary);

			if (sales == -1) {
				System.out.println("\nbye");
				break;
			}

			System.out.println();
			
			}
		}
	}

