import java.util.*;
import java.io.*;

public class ATMChecking extends ATMData {

	private int money;
	
	ATMChecking(String name, String password, int money){
		super(name, password);
		this.money = money;
	}
	
	public boolean checkBookBank(){
		try {
			Scanner readFile = new Scanner (new File("d://txtFile//ATMBookBank.txt"));
			String accNO = readFile.next();
			
			
		}catch(IOException e) {
			
		}
		
		
		return true;
	}
	
	public void show() {
		
	}
	
}
