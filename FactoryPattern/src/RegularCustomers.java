public class RegularCustomers extends CustomerTypeBaseOnArrival {
	public RegularCustomers(String Name, int Age) {
		super(Name, Age);
    }

    public void displayCustomerType() {
    	System.out.println("This is Regular Customer");
    }

}