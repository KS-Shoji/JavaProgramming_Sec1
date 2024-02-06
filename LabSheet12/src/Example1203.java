import java.io.*;
public class Example1203 {
	public static void main(String[] args) throws IOException{
		BufferedReader readFile = new BufferedReader(new FileReader("d:\\txtFile\\BookData.txt"));
		String tmp="";
		
		
		
		int count = 0;
		while((tmp=readFile.readLine())!=null) {
			String[] data = tmp.split("\t"); //depends on how the data is saved, this one was split with Tab.
			System.out.println(data[0]+" ("+data[1]+")"+", Rating "+ data[2]+
					" publish on " + data[5]);
		count++;
		
		}
		System.out.println("Total Books : " + count);
		
		readFile.close();
		
	}

}
