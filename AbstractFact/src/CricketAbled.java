import java.util.ArrayList;

public class CricketAbled implements OutdoorRegularSports 
{

	String SportsName =  "Cricket for Normally Abled Brave Sports Enthusiasts....";
	ArrayList<String> CricketEquipments = new ArrayList(); 
	
	public CricketAbled()
	{
		CricketEquipments.add("Bat, Gloves,Helmet"); 
	}
	public void displayRegSportsEquipments() 
	{
		System.out.println("Cricket for Normally abled Sports Eqipments are"); 
		System.out.println(CricketEquipments); 
	}
	public String  getSportsName()
	{
		return SportsName;
	}

}
