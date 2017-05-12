package helpers;

public class Greeter2 implements Runnable{
	public String country;
	public Greeter2(String country) {
		this.country = country;
		// TODO Auto-generated constructor stub
	}
	public void run(){
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.country + " for id " + Thread.currentThread().getId());
	}
}
