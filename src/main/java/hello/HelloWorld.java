package hello;

import time.TimeTeller;

public class HelloWorld {
	public static void main(String[] args) {

		TimeTeller timeTeller = new TimeTeller();

		System.out.println(timeTeller.tellTime());

		Greeter greeter = new Greeter();
		System.out.println(greeter.sayHello());
	}
}
