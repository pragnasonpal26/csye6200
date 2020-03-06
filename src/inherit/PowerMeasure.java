package inherit;

public class PowerMeasure extends MeterA implements MeterI  {
	
		protected double current=1.0; //1 AMpre
		protected double voltage=12.0; //12 volts
		//Constructor
		public PowerMeasure()
		{
			System.out.println("PowerMeasure constructor called");
		}
		//V=IR
		public double getResistivity()
		{
			return voltage / current;
		}
		//From Interface (MeterA)
		@Override
		public double measure() {
			
			return voltage*current;
		}
		//From Abstract class (MeterA)
		@Override
		public double calcProbeMeasure() {
			// TODO Auto-generated method stub
			return 0;
		}
}
