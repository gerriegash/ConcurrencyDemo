package helpers;

public class Greeter2 implements Runnable{
	public String country;
	public Greeter2(String country) {
		this.country = country;
		// TODO Auto-generated constructor stub
	}
	public void run(){
		System.out.println(this.country + " for id " + Thread.currentThread().getId());
	}
}
