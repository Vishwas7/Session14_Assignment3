package InterThreadCommunication;
/**
 * 
 * @author Vishwas
 * In here creating a thread class by extending Thread
 * than implementing run method to create a class
 * than declaring variables 
 *
 */
public class Consumer extends Thread{
	private Cup cup;
	private int number;
	
 /**
  * 
  * In the Consumer constructor passing Cup  and number.
  * and initializing cup in 'c'
  * 
  */
 public Consumer(Cup c, int number){
	 cup =c;
	 this.number=number;
	  }
 public void run(){
	 int value=0;
	 /**
	  *  10 times try to take something out of the cup
	  *  and using sleep method to check behavior
	  */
		for(int i=0; i<10; i++){
			try{
				sleep((long)(Math.random()*200));	
			}catch(InterruptedException e){
				// window console to show if any exception will occur
				System.out.println(e.getMessage());
			}
			value=cup.get();
			System.out.println("Consumer # " +this.number + " got : " +value);
			
		}
}

}




