package facade;

public class Domestic implements BookFlight {

	@Override
	public void book() {
		System.out.println("Domestic Flight booked");
	}

}
