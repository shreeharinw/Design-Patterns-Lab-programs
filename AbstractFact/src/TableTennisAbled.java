import java.util.ArrayList;

public class TableTennisAbled implements IndoorRegularSports 
{

	String SportsName =  "Table Tennis for Normally Abled Brave Sports Enthusiasts....";
	ArrayList<String> TableTennisEquipments = new ArrayList(); 
	
	public TableTennisAbled()
	{
		TableTennisEquipments.add("Table tennis racket, Ball, Table"); 
	}
	public void displayIndRegSportsEquipments() 
	{
		System.out.println("Table Tennis for Normally abled Sports Eqipments are"); 
		System.out.println(TableTennisEquipments); 
	}
	public String  getSportsName()
	{
		return SportsName;
	}

	
}
