package facade;

public class Resort implements BookStay {

	@Override
	public void book() {
		System.out.println("Resort stay is booked");

	}

}
