package run;



public class MyRunnable extends Object implements Runnable {
	
	private String name;
	private boolean done=false;
	private boolean paused=false;
	private int ctr=0;
	public MyRunnable(String name)
	{
		this.name=name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(!done)
		{
			if(ctr==100)
				paused=true;
			if(ctr==110)
				paused=false;
			if(paused)
			{
				try {
				Thread.sleep(1000L);
				}catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				ctr++;
			}
			else {
			doWork();   //DO important time consuming work
			ctr++;    //Count how many times around the loop
			if((ctr%=10)==0)
				System.out.println("Thread: "+name + "-loop"+ctr);
			if(ctr>100)
				done=true;
			}
		}

	}
	public void doWork()
	{
	for(int i=0;i<100000;i++)
	{
		double val=Math.exp((double) i);
	}
	}
}
