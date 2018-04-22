
public class MainClientClass
{

	public static void main(String[] args)
	{
		System.out.println("------AVAILABLE SPORTS & EQUIPMENTS FOR THE DIFFERNTLY ABLED SPORTS ENTHUSIASTS-----");
		DisabledSportsEnthusiast DiasbledPerson1 = new DisabledSportsEnthusiast(); 
		SportsEquipment mySportsDisabled; 
		mySportsDisabled = DiasbledPerson1.createSports("Bungee-Cricket-Squash Disabled"); 
		mySportsDisabled.displayDetails();
		
		System.out.println("\n\n------AVAILABLE SPORTS & EQUIPMENTS FOR THE NORMALLY ABLED SPORTS ENTHUSIASTS-----");
		AbledSportsEnthusiast NormalPerson1 = new AbledSportsEnthusiast(); 
		SportsEquipment mySportsAbled; 
		mySportsAbled = NormalPerson1.createSports("Bungee-Cricket-TableTennis Abled"); 
		mySportsAbled.displayDetails();

	}

}
