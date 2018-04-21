package facade;

public class HotelStay implements BookStay {

	@Override
	public void book() {
		System.out.println("Hotel Stay booked");

	}

}
