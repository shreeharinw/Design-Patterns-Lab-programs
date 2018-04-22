import java.util.ArrayList;

public class SquashDisabled implements IndoorRegularSports 
{
	String SportsName =  "Squash for DisAbled Brave Sports Enthusiasts....";
	ArrayList<String> SquashEquipments = new ArrayList(); 
	
	public SquashDisabled()
	{
		SquashEquipments.add("Squash racket, Ball, PERSONAL ASSISTANCE"); 
	}
	public void displayIndRegSportsEquipments() 
	{
		System.out.println("Squash for Disabled Sports Eqipments are"); 
		System.out.println(SquashEquipments); 
	}
	public String  getSportsName()
	{
		return SportsName;
	}
}
