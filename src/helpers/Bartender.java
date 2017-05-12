package helpers;

import java.util.concurrent.TimeUnit;

public class Bartender extends Thread {
	public Bartender(String name) {
		super("Bartender: " + name);
		// TODO Auto-generated constructor stub
	}
	
		public void run() {
			while(true){
			if(Thread.currentThread().interrupted()){
				System.out.println("At your service, I am servicing you!");
			}
			
			try {
				System.out.println("Work done, I`ll take a nap probably");
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
			}
		}
}
