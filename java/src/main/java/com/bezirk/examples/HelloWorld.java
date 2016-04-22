package com.bezirk.examples;

import com.bezirk.middleware.Bezirk;
import com.bezirk.middleware.addressing.Address;
import com.bezirk.middleware.addressing.ServiceId;
import com.bezirk.middleware.messages.Event;
import com.bezirk.middleware.messages.Message.Stripe;
import com.bezirk.proxy.Factory;

import javax.swing.JOptionPane;

public class HelloWorld {

    private Bezirk bezirk;
    private ServiceId myId;

    public HelloWorld() {
        // set up sending messages over bezirk
        bezirk = Factory.getInstance();
        myId = bezirk.registerService(HelloWorld.class.getSimpleName());
    }

    public void sayHello() {
        // Steps to publish an event over bezirk
        // 1. set the targeted address
        Address target = new Address(null);        // local only (no pipes) with no constraints on location: will reach all services in the spheres HelloWorld is a member of

        // 2. set the event to be published
        Event hello = new Event(Stripe.NOTICE, "Hello World");

        // 3. publish "hello world" to all in the target address
        bezirk.sendEvent(myId, target, hello);

        // display the event that was just published
        JOptionPane.showMessageDialog(null, "HelloWorld successful!!!\nPublished Message: " + hello.serialize());
    }

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.sayHello();
    }
}
