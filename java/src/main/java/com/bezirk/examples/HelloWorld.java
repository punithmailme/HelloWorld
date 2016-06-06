package com.bezirk.examples;

import com.bezirk.middleware.Bezirk;
import com.bezirk.middleware.messages.Event;
import com.bezirk.middleware.messages.Message.Flag;
import com.bezirk.middleware.proxy.Factory;

import javax.swing.JOptionPane;

public class HelloWorld {
    private final Bezirk bezirk;

    public HelloWorld() {
        // set up sending messages over bezirk
        bezirk = Factory.registerZirk(HelloWorld.class.getSimpleName());
    }

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.sayHello();
    }

    public void sayHello() {
        // Steps to publish an event over bezirk
        // 1. set the event to be published
        Event hello = new Event(Flag.NOTICE, "Hello World");

        // 2. publish "hello world" to all in the target address
        bezirk.sendEvent(hello);

        // display the event that was just published
        JOptionPane.showMessageDialog(null, "HelloWorld successful!!!\nPublished Message: " + hello.toJson());
    }
}
