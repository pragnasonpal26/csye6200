package concth;

public class MyThread extends Thread {
	private boolean done=false; //We're not done initially
	private int ctr=0;   //how many times around the loop?
	
	//Constructor -with a name
	public MyThread(String name)
	{
		super(name);
	}
	public void run()
	{
		while(!done)
		{
			doWork();   //DO important time consuming work
			ctr++;    //Count how many times around the loop
			System.out.println("Thread: "+this.getName() +ctr);
			if(ctr>100)
				done=true;
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
