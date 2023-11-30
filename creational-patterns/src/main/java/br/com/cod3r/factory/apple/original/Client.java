package br.com.cod3r.factory.apple.original;


import br.com.cod3r.factory.apple.original.factory.IPhone11Factory;
import br.com.cod3r.factory.apple.original.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.original.factory.IPhoneXFactory;
import br.com.cod3r.factory.apple.original.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		IPhoneFactory iPhoneXFactory = new IPhoneXFactory();
		IPhoneFactory iPhone11Factory = new IPhone11Factory();

		System.out.println("### Ordering an iPhone X");
		IPhone iPhone = iPhoneXFactory.orderIPhone();
		System.out.println(iPhone);

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iPhone2 = iPhone11Factory.orderIPhone();
		System.out.println(iPhone2);

	}
}
