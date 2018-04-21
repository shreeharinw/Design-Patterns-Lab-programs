package facade;

public class Taxi implements BookTransport {

	@Override
	public void book() {
		System.out.println("Taxi booked");

	}

}
