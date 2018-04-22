import java.util.ArrayList;

public class BungeeJumpingDisabled implements OutdoorAdventureSports 
{

	String SportsName =  "Bungee Jumping for Disabled Brave Sports Enthusiasts....";
	ArrayList<String> bungeeEquipments = new ArrayList(); 
	
	BungeeJumpingDisabled()
	{
		bungeeEquipments.add("bungee cord"); 
		bungeeEquipments.add("WHEEL-CHAIR");
		bungeeEquipments.add("full-body harness");
		bungeeEquipments.add("ankle harness"); 
	}

   public String  getSportsName()
   {
	   return SportsName;
   }  

    public void displayAdvSportsEquipments() 
    { 
    	
    	System.out.println("Bungee-Jumping for Disabled Sports Eqipments are"); 
    	System.out.println(bungeeEquipments); 
    }


}
