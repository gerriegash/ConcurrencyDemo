package helpers;

public class Greeter extends Thread{
	public String country;
	public Greeter(String country) {
		super(country + " thread!");
		this.country = country;
		// TODO Auto-generated constructor stub
	}
	public void run(){
		System.out.println(this.country + " for id " + Thread.currentThread().getId());
	}
}
