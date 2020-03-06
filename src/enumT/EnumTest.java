package enumT;

public class EnumTest {
	
	enum WeekDay {SUNDAY(0), MONDAY(10), TUESDAY(20), WEDNESDAY(30), THURSDAY(40), FRIDAY(50), SATURDAY(60);
	
		private int value;
		
		//Constructor
		WeekDay(int n) {value=n;}
		
		//Getter and setter
		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = value;
		}	
		
	};
	private WeekDay currDay=WeekDay.TUESDAY;
	
	//Constructor
	public EnumTest()
	{
		System.out.println("Current day is "+ currDay + " ordinal value " + currDay.ordinal());
		
		WeekDay days[]=WeekDay.values();
		for(WeekDay d: days)
		{
			System.out.println("Day: " + d.name()+
					" Ordinal " + d.ordinal()+
					" value " + d.getValue());
		}
		setCurrDay(WeekDay.SATURDAY);
		setCurrDay(WeekDay.FRIDAY);
	}

	public void setCurrDay(WeekDay currDay) {
		this.currDay = currDay;
		System.out.println("Day: "+ this.currDay);
	}

	public static void main(String[] args) {
		EnumTest et=new EnumTest();

	}

}
