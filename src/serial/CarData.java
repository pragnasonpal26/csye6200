package serial;

import java.io.Serializable;

public class CarData implements Serializable,Comparable <CarData> {
	
	private int iValue=0;
	private double dValue=0.1;
	private double dValue2=0.2;
	private String name;

		//Constructor
		public CarData(int iValue,double dValue,double dValue2,String name)
		{
			this.iValue=iValue;
			this.dValue=dValue;
			this.dValue2=dValue2;
			this.name=name;
		}
		
		@Override
		public int compareTo(CarData cd) {
			
			return name.compareTo(cd.getName());
		}

		public double getdValue() {
			return dValue;
		}

		public void setdValue(double dValue) {
			this.dValue = dValue;
		}

		public double getdValue2() {
			return dValue2;
		}

		public void setdValue2(double dValue2) {
			this.dValue2 = dValue2;
		}

		public String getName() {
			// TODO Auto-generated method stub
			return name;
		}

}
