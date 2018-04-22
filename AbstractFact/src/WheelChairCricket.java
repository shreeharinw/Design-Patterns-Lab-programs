import java.util.ArrayList;

public class WheelChairCricket implements OutdoorRegularSports 
{

	String SportsName =  "Wheel Chair Cricket for Disabled Brave Sports Enthusiasts....";
	ArrayList<String> wheelChairEquipments = new ArrayList(); 
	
	public WheelChairCricket()
	{
		wheelChairEquipments.add("WHEEL-CHAIR, PERSONAL ASSISTNACE");
		wheelChairEquipments.add("Bat, Gloves,Helmet"); 
	}
	public void displayRegSportsEquipments() 
	{
		System.out.println("Wheel Chair Cricket for Disabled Sports Eqipments are"); 
		System.out.println(wheelChairEquipments); 
	}
	public String  getSportsName()
	{
		return SportsName;
	}
	
		

}
