
public class AbledSportsEnthusiast extends SportsEnthusiast
{

	SportsTypeAbstractFactory mySportsTypeAF2 = new AbledSportsType();
	
	public SportsEquipment createSports(String s) 
	{
		
		//if(s.equals("Bungee-Cricket Disabled"))
		return new AbledSportsEquipment(mySportsTypeAF2);
		//else if (s.equals("Para Gliding-Cricket Disabled"))
			//return new OutdoorSportsEquipment(mySportsTypeAF2);	
		//else 
		//return null; 
	}

}
