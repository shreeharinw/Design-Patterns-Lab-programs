package facade;

public class International implements BookFlight {

	@Override
	public void book() {
		System.out.println("Overseas flight booked");

	}

}
