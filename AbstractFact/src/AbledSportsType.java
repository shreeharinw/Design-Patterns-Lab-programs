
public class AbledSportsType implements SportsTypeAbstractFactory 
{
	public OutdoorAdventureSports createAdventureSports() 
	{ 
		return new BungeeJumpingAbled(); 
	}
	public OutdoorRegularSports createOutdoorRegularSports()
	{
		return new CricketAbled(); 
	}
	public IndoorRegularSports createIndoorRegularSports()
	{
		return new TableTennisAbled(); 
	}
}
