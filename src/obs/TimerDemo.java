package obs;

import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;

public class TimerDemo {
	
	private Timer timer;
	
	//Constructor
	public TimerDemo()
	{
		timer=new Timer();
		timer.schedule(new RemindTask(), 3000L, 1000L);
	}
	//A TimerTask Class
	class RemindTask extends TimerTask
	{
		private int ctr=0;
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Timer alert" + ctr++);
			Toolkit.getDefaultToolkit().beep();   //Ring the bell
			if(ctr>5)
				timer.cancel();
		}
		
	}
	
	
	public static void main(String args[])
	{
		new TimerDemo();
	}
}
