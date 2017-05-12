package concurrency;

import java.util.concurrent.TimeUnit;

import helpers.Bartender;
import helpers.Customer;

public class BartenderCustomerProblem extends Thread {
	
	public static void main(String[] args) {
		Bartender bartender = new Bartender("Bar-Joe");
		bartender.start();
		
		try {
			System.out.println("Lovely Day I am sleeping");
			bartender.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i = 0; i<5;i++){
			Customer customer =new Customer((i+1)+ "Customer", bartender, (int)(Math.random()*10));
			customer.start();
		}
	}
	
}
