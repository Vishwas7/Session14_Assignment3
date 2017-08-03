package InterThreadCommunication;
/**
 * 
 * @author Vishwas
 * creating a class Test
 * and in the test class i'll call all the threads
 *
 */
public class Test {
	// main method
	public static void main(String[]args){
		// creating object of cup
		Cup c= new Cup();
		// creating two thread 
		Producer producer1=new Producer(c, 1);
		Consumer consumer1 =new Consumer(c,1);
		Consumer consumer2 =new Consumer(c,2);
		// In here calling start thread to run this threads 
		producer1.start();
		consumer1.start();
		consumer2.start();
	}

}
