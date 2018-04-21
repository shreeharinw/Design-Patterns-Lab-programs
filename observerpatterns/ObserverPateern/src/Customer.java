
public class Customer implements Observer {
	Store store;
	String name;
	public Customer(Store store,String name) {
		this.store = store;
		store.register(this);
		this.name =name;
	}
	@Override
	public void update(float per) {
		// TODO Auto-generated method stub
		System.out.println(this +" you have a discount of " + per + " %");
	}
	public String toString()
	{
		return name;
	}

}
