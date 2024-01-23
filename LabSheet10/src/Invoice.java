
public class Invoice {

	private int id;
	private Customer customer;
	private double amount;
	
	Invoice(int id, Customer customer, double amount){
	}
	
	public int getID() {
		return id;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public int getCustomerID() {
		return getCustomer().getID();
	}
	
	public String getCustomerName() {
		return getCustomer().getName();
	}
	
	public int getCustomerDiscount() {
		return getCustomer().getDiscount();
	}
	
	public String toString() {
		return "Invoice: ";
	}
}
