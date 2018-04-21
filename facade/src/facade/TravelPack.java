package facade;

public class TravelPack {
	BookStay bs;
	BookFlight bfl;
	BookTransport bt;
	
	void type1() {
		bfl = new Domestic();
		bs = new HotelStay();
		bfl.book();
		bs.book();
		bt = new Taxi();
		bt.book();
		
	}
	void type2() {
		bfl = new International();
		bs = new Resort();
		BookFlight bfl2 = new Domestic();
		bfl2.book();
		bfl.book();
		bs.book();
	}
}
