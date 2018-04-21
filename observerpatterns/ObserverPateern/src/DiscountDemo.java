
public class DiscountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store northStore = new Store();
		Customer c1 = new Customer(northStore,"hari");
		Customer c2 = new Customer(northStore,"pruthvi");
		Customer c3 = new Customer(northStore,"rakshit");
		northStore.setdiscount(10.0f);
		northStore.unregister(c2);
		northStore.setdiscount(05.0f);
	}

}
