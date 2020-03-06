package concth;

public class MyThreadTest {
	private MyThread threadA=null;
	private MyThread[] threads=new MyThread[10];  // a group of threads
	
	//Constructor
 	public MyThreadTest()
	{
		threadA=new MyThread("A");
		for(int i=0;i<threads.length;i++)
		{
			threads[i]=new MyThread("Thread:" + i);
		}
	}
	//Constructor
	public void run()
	{
		threadA.start();   //Launch our thread-lift off!
		
	}
	public static void main(String[] args)
	{
		MyThreadTest mtt=new MyThreadTest();
		mtt.run();
		System.out.println("We are done with main!!");
		
		for(int i=0;i<threads.length;i++)
		{
			threads[i]=start();
		}
	}

}
