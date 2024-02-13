import java.io.*;
import java.util.*;
public class SaveandOpen extends Employee{

	private String name;
	private String dept;
	
	public void insert() throws IOException {
		Scanner input = new Scanner(System.in);
		PrintStream writeFile = new PrintStream((new File("d://txtFile//employee.txt")));
		String answer;
		do {
			header();
			
			System.out.print("Enter name:");
			name = input.next();
			System.out.print("Enter department:");
			dept = input.next();
			
			writeFile.println(name+"\t"+dept);
			
			System.out.print("Enter data again?:");
			answer = input.next();
			
		}while(answer.equalsIgnoreCase("y"));
		
	
		writeFile.close();
	
	}
	public void read() {
		try {
			Scanner readFile = new Scanner (new File("d://txtFile//employee.txt"));
			boolean check = false;
			header();
			while(readFile.hasNext()) {
				name = readFile.next();
				dept = readFile.next();
				if(dept.equalsIgnoreCase(super.getDept())) {
					System.out.print(name);
					check = true;
				}
			}
			if(check==false) {
				header();
				System.out.print("\nSorry,no department: "+super.getDept()+" in file.");
			}
			
		}catch(IOException e) {
			System.out.print("Sorry, file not found");
		}
	}

}
