package inherit;

public class AltPowerMeasure extends PowerMeasure {
	
	public AltPowerMeasure()
	{
		System.out.println("ALtPowerMeasure constructor called");
	}
	
	public double getResistivity()
	{
		return (voltage/current) *2;
	}
}
