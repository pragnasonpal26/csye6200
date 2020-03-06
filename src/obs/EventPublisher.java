
package obs;

import java.util.Observable;

/**
 * @author Admin
 *
 */
public class EventPublisher extends Observable {

		private boolean done=false; //set true to stop the run method
		private int ctr=0;
		public EventPublisher()
		{
			System.out.println("EventPublisher- we are here");
		}
		//AN event has occurred, so notify the subscribers
		public void doAction()
		{
			setChanged();     //Indicate that a change has happened
			notifyObservers(new String("A message" + ctr));
		}
		//DO a lot of messaging
		public void run()
		{
			while(!done)
			{
				doAction();
				if(ctr++>10)
					done=true;
			}
		}
		public static void main(String[] args) {
		EventPublisher ep=new EventPublisher();  //We have a publisher
		EventSubscriber sub1=new EventSubscriber(); //We have a subscriber 
		ep.addObserver(sub1);
		ep.run();
		ep.run();

	}

}
