import java.util.*;
import java.io.*;
public class Lab1205 {

	public static void main(String[] args) throws IOException {
		Header();
		Scanner readFile = new Scanner(new File("d://txtFile//student.txt"));
		int i=1;
		while(readFile.hasNext()) {
			
			String studentID = readFile.next();
			readFile.next();
			String fName = readFile.next();
			String lName = readFile.next();
			double grade = Double.parseDouble(readFile.next());
			
			readFile.nextLine();
			
			String aName = fName.substring(0,1).toUpperCase() + "."+lName;
			System.out.println(i+"."+"\t"+studentID+"\t\t"+Level(studentID) + "\t" + aName + "\t" + grade + "\t" + Status(grade));

			i++;
		}
	}
	
	public static String Level(String id) {
		int Lvl = 22 - Integer.parseInt((id.substring(0,2)));
		return Integer.toString(Lvl) + "th";
	}
	
	
	public static String Status(double grade) {
		if (grade >= 2) {
			return"PASS";
		}
		else if(grade > 1 && grade < 2) {
			return"CRITICAL";
		}
		else {
			return"RETIRED";
		}
		
	}
	
	public static void Header() {
		System.out.println("No.\tID\t\t\tLevel\tName\t\tGrade\tStatus");
		System.out.println("**********************************************************************");
	}
	
	

}
