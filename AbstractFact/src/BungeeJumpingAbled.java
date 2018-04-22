import java.util.ArrayList;

public class BungeeJumpingAbled implements OutdoorAdventureSports 
{

	String SportsName =  "Bungee Jumping for ABLED Brave Sports Enthusiasts....";
	ArrayList<String> bungeeEquipments = new ArrayList(); 
	
	BungeeJumpingAbled()
	{
		bungeeEquipments.add("bungee cord"); 
		//bungeeEquipments.add("wheel-chair");
		bungeeEquipments.add("full-body harness");
		bungeeEquipments.add("ankle harness"); 
	}

   public String  getSportsName()
   {
	   return SportsName;
   }  

    public void displayAdvSportsEquipments() 
    { 
    	
    	System.out.println("Bungee-Jumping for Abled Sports Eqipments are"); 
    	System.out.println(bungeeEquipments); 
    }


}
