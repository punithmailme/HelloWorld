package com.bezirk.examples;

import com.bezirk.middleware.Bezirk;
import com.bezirk.middleware.addressing.Address;
import com.bezirk.middleware.addressing.Location;
import com.bezirk.middleware.addressing.ZirkId;
import com.bezirk.middleware.messages.Event;
import com.bezirk.middleware.messages.Message.Flag;
import com.bezirk.middleware.proxy.Factory;

import javax.swing.JOptionPane;

public class HelloWorld {
    private final Bezirk bezirk;
    private final ZirkId myId;

    public HelloWorld() {
        // set up sending messages over bezirk
        bezirk = Factory.getInstance();
        myId = bezirk.registerZirk(HelloWorld.class.getSimpleName());
    }

    public void sayHello() {
        // Steps to publish an event over bezirk
        // 1. set the targeted address
        Address target = new Address(new Location(null));        // local only (no pipes) with no constraints on location: will reach all services in the spheres HelloWorld is a member of

        // 2. set the event to be published
        Event hello = new Event(Flag.NOTICE, "Hello World");

        // 3. publish "hello world" to all in the target address
        bezirk.sendEvent(myId, target, hello);

        // display the event that was just published
        JOptionPane.showMessageDialog(null, "HelloWorld successful!!!\nPublished Message: " + hello.toJson());
    }

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.sayHello();
    }
}
