
public class DisabledSportsEquipment extends SportsEquipment 
{

	SportsTypeAbstractFactory myAF;
	OutdoorAdventureSports myoutdoorSports; 
	OutdoorRegularSports myoutregsports; 
	IndoorRegularSports myindregsports;
	
	DisabledSportsEquipment(SportsTypeAbstractFactory myAF)
	{ 
		
		this.myAF = myAF; 
		
	}
	
	@Override
	void displayDetails()
	{
		myoutdoorSports = myAF.createAdventureSports(); 
		System.out.println("\nOutdoor Adventure Sports Equipment are:"); 
		myoutdoorSports.displayAdvSportsEquipments(); 
		myoutregsports = myAF.createOutdoorRegularSports();
		System.out.println("\nOutdoor Regular Sports Equipment are"); 
		myoutregsports.displayRegSportsEquipments();
		myindregsports = myAF.createIndoorRegularSports();
		System.out.println("\nIndoor Regular Sports Equipment are"); 
		myindregsports.displayIndRegSportsEquipments();
		
	}

}
