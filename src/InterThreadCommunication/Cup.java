package InterThreadCommunication;
/**
 * 
 * @author Vishwas
 * 
 * In this program i'm showing the difference between 
 * notify() and notifyAll() method of thread class.
 * for this i've created a Class Cup
 *
 */
public class Cup {
	private int contents;
	private boolean avaiable=false;
	
	/**
	 * using synchronized method 
	 * synchronization is use for capability to control the access of 
	 * multiple threads to any shared resource.
	 * and using try and catch block to handle Exception
	 * inside the try and catch block using wait method for wait a thread
	 */
	 synchronized public int get(){
		 while(!avaiable){
			 try{
				 wait();
			 }catch(InterruptedException e){
				 
			 }
		 }
		 /**
		  * In here using notify method
		  * notify() use to wakes up a single thread that is waiting 
		  * on this object's monitor
		  */
		 avaiable=false;
		 notify();
		 return contents;
		
	}
	 synchronized public void put(int value){
		 
	  while(avaiable){
		 try{
			 wait();
		 }catch(InterruptedException e){
			 
		 }
	 }
	 avaiable=true;
	 contents = value;
	 notifyAll();
	 
}
}
