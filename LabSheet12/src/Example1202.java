import java.util.*;
import java.io.*;
public class Example1202 {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		System.out.print("Input Section:");
		int section= input.nextInt();
		Header(section);
		showListStudent(section);		
		}
	
	public static void showListStudent(int sectionInput) throws IOException {
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//List107.txt"));
		String tmp = "";
		while((tmp = readFile.readLine())!=null) {
			String[] data = tmp.split("\t");
		double midScore = Double.parseDouble(data[4]);
		double finalScore = Double.parseDouble(data[5]);
		int sectionFile = Integer.parseInt(data[3]);
		
		if(sectionFile == sectionInput) {
			System.out.println(data[0]+"\t"+data[2]+"\t"+midScore+"\t"+finalScore+"\t"+findResult(midScore,finalScore));
		}
		}
		readFile.close();
	}
	
	public static String findResult(double midScore, double finalScore) {
		double totalScore = midScore + finalScore;
		if (totalScore <= 40) {
			return "FAIL";
		}
		else {
			return "PASS";
		}
	}
		
	public static void Header(int sec) {
		System.out.println("*************************************************************");
		System.out.println("\t\tList of Data for Section " + sec);
		System.out.println("*************************************************************");
		
	}
	
}
	
	
	

