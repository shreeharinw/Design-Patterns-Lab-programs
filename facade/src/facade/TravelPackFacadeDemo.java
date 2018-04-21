package facade;

public class TravelPackFacadeDemo {

	public static void main(String[] args) {
		TravelPack tp = new TravelPack();
		tp.type1();
		tp.type2();
		System.out.println("-----------------------------");
		BookFlight bf = new Domestic();
		BookStay bs = new Resort();
		bf.book();
		bs.book();
	}

}
