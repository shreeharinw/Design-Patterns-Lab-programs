import java.util.ArrayList;

public class Store {
	ArrayList<Observer> customer = new ArrayList<Observer>();
	float per=0.0f;
	public void register(Observer e) {
		customer.add(e);
	}
	public void unregister(Observer e) {
		int i = customer.indexOf(e);
		if(i>=0)
		{	customer.remove(i);
		System.out.println(e + "customer removed successfully");
		}
		else
			System.out.println("customer doens't exist");
	}
	public void notifyObserver() {
		for(Observer o : customer) {
			o.update(per);
		}
	}
	public void setdiscount(float p) {
		per = p;
		notifyObserver();
	}
}
