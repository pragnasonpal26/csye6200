package run;

public class MyRunTest {
	
	MyRunnable myRunA=null;
	Thread threadA=null;
	MyRunnable myRunB=null;
	Thread threadB=null;
	public MyRunTest()
	{
		myRunA=new MyRunnable("A");  //Create a runnable
		threadA=new Thread(myRunA);  //Create a thread
		
		myRunA=new MyRunnable("B");  //Create a runnable
		threadA=new Thread(myRunB);  //Create a thread
	}

	public void run()
	{
		threadA.start();   //Start the thread
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunTest mrtTest=new MyRunTest();    //Initialize the threads
		mrtTest.run();
	}

}
