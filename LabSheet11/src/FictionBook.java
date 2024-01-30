import java.time.Year;
public class FictionBook implements Author, Book {

	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	
	int space = author_name.indexOf(' ');
	
	String firstName = author_name.substring(0, space);
	String lastName = author_name.substring(space, author_name.length()-1);
	
	String hotmail = "@hotmail.com";
	String window = "@windowslive.com";
	
	Year currentYear = Year.now();
	String abbLast = lastName.substring(space+1)+".";
	
	FictionBook(String title, int publicYear){
		this.title = title;
		this.publicYear = publicYear;
	}


	public void setAuthorName(String name) {
		this.author_name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public boolean checkFormatName() {
		if (space ==1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public String getLastName() {
		return lastName = lastName.toUpperCase();
	}
	
	public String getFirstName() {
		return firstName = firstName.toUpperCase();
	}
	
	public boolean checkEmail() {
		if(email.contains(hotmail) || email.contains(window)) {
			return true;
		}
		else {
			return false; 
		}
	}
	
	public int totalPublicYear() {
		return currentYear.getValue() - publicYear;
	}
	
	public String toString() {
		return title + "write by";
	}


	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
