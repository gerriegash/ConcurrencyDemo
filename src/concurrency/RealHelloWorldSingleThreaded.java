package concurrency;

import java.util.Arrays;

import helpers.Greeter2;

public class RealHelloWorldSingleThreaded {

	public static void main(String[] args) {
		String countries[] = {"India","America","Australia","Canada"};
//		for(String country : countries){
//			new Greeter(country).start();
//		}
		
		Arrays.stream(countries).forEach(country -> new Thread(new Greeter2(country)).start());
		//Arrays.stream(countries).forEach(country -> new Greeter(country).start());
	}
	
}
