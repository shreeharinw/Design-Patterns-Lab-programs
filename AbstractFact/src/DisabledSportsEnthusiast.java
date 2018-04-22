
public class DisabledSportsEnthusiast extends SportsEnthusiast 
{

	SportsTypeAbstractFactory mySportsTypeAF1 = new DisabledSportsType();
	
		public SportsEquipment createSports(String s) 
		{
			
			//if(s.equals("Bungee-Cricket Disabled"))
			return new DisabledSportsEquipment(mySportsTypeAF1);
			//else if (s.equals("Para Gliding-Cricket Disabled"))
				//return new OutdoorSportsEquipment(mySportsTypeAF2);	
			//else 
			//return null; 
		}




}
