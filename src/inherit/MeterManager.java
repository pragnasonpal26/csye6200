package inherit;

import java.util.ArrayList;
import java.util.logging.Logger;

public class MeterManager {
	
	private static Logger log= Logger.getLogger(MeterManager.class.getName());
	
	private static MeterManager instance=null; // The single copy
	
	private ArrayList<MeterI> meterList = new ArrayList<MeterI>();
	
	private MeterManager()   //Can't be built externally to class
	{
		log.info("COnstructing a MeterManager instance");
	}
	public static MeterManager instance()
	{
		if(instance==null)
			instance=new MeterManager();
		return (instance);       //Return the single copy
	}
	
	public void add(MeterI meter)
	{
		meterList.add(meter);
		log.warning("Added a meter");
	}
	
	public void displayMeters()
	{
		for(MeterI meter : meterList)
		{
			String fTxt=String.format("Measure: %1$8f %2$8f",meter.measure(),meter.getResistivity());
			System.out.println(fTxt);
		}
	}

}
