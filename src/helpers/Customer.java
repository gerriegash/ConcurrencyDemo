package helpers;

import java.util.concurrent.TimeUnit;

public class Customer extends Thread {
	
	private int waitingTime;
	private Bartender bartenderThread;
	
	public Customer(String name, Bartender bartenderThread,int waitingTime) {
		super("Customer:" + name);
		this.bartenderThread = bartenderThread;
		this.waitingTime = waitingTime;
	}
	
	public void run(){
		try {
			System.out.println("I am" + this.getName() + ", No one is around, I`ll wait probably");
			TimeUnit.SECONDS.sleep(waitingTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hey " + bartenderThread.getName()  +  " Wake Up!");
		bartenderThread.interrupt();
	}
	
}
