package inherit;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class InheritTest {
	public InheritTest()
	{
		Handler handler=null;
		try
		{
			handler=new FileHandler("server.log");
		}catch(SecurityException | IOException e)
		{
			e.printStackTrace();
		}
		Logger.getLogger("").addHandler(handler);
	}
	public void run()
	{
		PowerMeasure pm0=new PowerMeasure();
		System.out.println("PowerMeasure resistivity:" + pm0.getResistivity());
		
		PowerMeasure apm0=new AltPowerMeasure();
		System.out.println("AltPowerMeasure resistivity:" + apm0.getResistivity());
		
		displayMeasure(apm0); // it is-1 MeterI
		//Static call to create an instance of MeterMnager
		MeterManager meterMgr=MeterManager.instance();  //build it or get it
		meterMgr.add(pm0);
		meterMgr.add(apm0);
		meterMgr.displayMeters();
		
		MeterManager meterMgr2=MeterManager.instance();
		meterMgr2.displayMeters();
	}
	
	public void displayMeasure(MeterI meter)
	{
		System.out.println("Measure is:"+ meter.measure());
	}

	public static void main(String[] args) {
		InheritTest iTest=new InheritTest();
		iTest.run();

	}

}
