import java.util.*;
import java.io.*;
public class AddProduct {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		
		FileWriter filename = new FileWriter("d://txtFile//product.txt",true);
		PrintWriter writeFile = new PrintWriter(filename);
		
		System.out.print("Product ID: ");
		String id = input.next();
		System.out.print("Product Name: ");
		String proName = input.next();
		System.out.print("Product Unit: ");
		int proUnit = input.nextInt();
		System.out.print("Product Price: ");
		float proPrice = input.nextFloat();
		
		writeFile.println(id+","+proName+","+proUnit+","+proPrice);
		System.out.println("Write file already...");
		
		writeFile.close();
		
		
		
	}

}
