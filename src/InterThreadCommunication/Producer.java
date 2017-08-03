package InterThreadCommunication;
/**
 * 
 * @author Vishwas
 * In here creating a thread class by extending Thread
 * than declaring variables
 * In the Producer Class putting something in the cup 
 *
 */
public class Producer extends Thread{
	private Cup cup;
	private int number;
	
 public Producer(Cup c, int number){
	 /**
	  * 
	  * In the Consumer constructor passing Cup  and number.
	  * and initializing cup in 'c'
	  * 
	  */
	 cup =c;
	 this.number=number;
	  }
 // Implementing run method to create a class
 public void run(){
		for(int i=0; i<10; i++){
			// in here put in the cup something
			cup.put(i);
			
			System.out.println("Producer # " +this.number + " put : " +i);
			try{
				//using sleep method to check behavior
				sleep((long)(Math.random()*100));	
			}catch(InterruptedException e){
				// window console to show if any exception will occur
				System.out.println(e.getMessage());
			
		}
}

 }
}
