import java.util.*;
import java.io.*;
public class Lab1203 {

	public static void main(String[] args) throws IOException  { 
		
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//BookData.txt"));
		String tmp="";
		int count=0,i=1;
	
			while((tmp=readFile.readLine()) != null) {
				String[] data = tmp.split("\t");
				String nameBook = data[0];
				String name = data[1];
				String rating = data[2];
				String year = data[5];		
				System.out.println(i + "." + nameBook + " (" + name + "), Rating " + rating + " publish on " + year);
				count++;
				i++;
				
			}
			
			System.out.println("===================================================================");
			System.out.println("Total Books = " + count);
			readFile.close();
			
		}

}
