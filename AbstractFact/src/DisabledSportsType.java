
public class DisabledSportsType implements SportsTypeAbstractFactory 
{
	public OutdoorAdventureSports createAdventureSports() 
	{ 
		return new BungeeJumpingDisabled(); 
	}
	public OutdoorRegularSports createOutdoorRegularSports()
	{
		return new WheelChairCricket(); 
	}
	public IndoorRegularSports createIndoorRegularSports()
	{
		return new SquashDisabled(); 
	}

}
