/*
 * @author: Joao de Sousa (CR/RTC3-NA)
 */
package examples;

import com.bosch.upa.uhu.api.UhuAPI;
import com.bosch.upa.uhu.api.addressing.Address;
import com.bosch.upa.uhu.api.addressing.ServiceId;
import com.bosch.upa.uhu.api.messages.Event;
import com.bosch.upa.uhu.api.messages.UhuMessage.Stripe;
import com.bosch.upa.uhu.UhuFactory;

/**
 * Written for the UhU basics training
 */
public class HelloWorld {

	private UhuAPI uhu; 
	private ServiceId myId;
	
	public HelloWorld() {
		// set up sending messages over UhU
		uhu = UhuFactory.getInstance();
		myId = uhu.registerService(HelloWorld.class.getSimpleName());
	}

	/**
	 * 
	 */
	public void sayHello() {
		// Note: the usual way to say "hello world" in Java
		System.out.println("Hello World");

		// Steps to publish an even over UhU:
		// 1. set the targeted address
		Address target = new Address(null);		// local only (no pipes) with no constraints on location: will reach all services in the spheres HelloWorld is a member of
		
		// 2. set the event to be published
		Event hello = new Event(Stripe.NOTICE, "Hello World");
		
		// 3. publish "hello world" to all in the target address
		uhu.sendEvent(myId, target, hello);
		
		// sanity check: display the event that was just published
		System.out.println("Published: " + hello.serialize());
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.sayHello();
	}
}
