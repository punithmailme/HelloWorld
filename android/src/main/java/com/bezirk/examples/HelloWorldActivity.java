package com.bezirk.examples;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.bezirk.middleware.Bezirk;
import com.bezirk.middleware.addressing.Address;
import com.bezirk.middleware.addressing.ServiceId;
import com.bezirk.middleware.messages.Event;
import com.bezirk.middleware.messages.Message;
import com.bezirk.proxy.android.Factory;

public class HelloWorldActivity extends AppCompatActivity {

    private Bezirk bezirk;
    private ServiceId myId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        bezirk = Factory.getInstance(this);
        myId = bezirk.registerService("HelloWorldAndroidService");
        sayHello();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hello_world, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void sayHello() {
        // Steps to publish an even over UhU:
        // 1. set the targeted address
        Address target = new Address(null);        // local only (no pipes) with no constraints on location: will reach all services in the spheres HelloWorld is a member of

        // 2. set the event to be published
        Event hello = new Event(Message.Stripe.NOTICE, "Hello World");

        // 3. publish "hello world" to all in the target address
        bezirk.sendEvent(myId, target, hello);

        // display the event that was just published
        //System.out.println("Published: " + hello.serialize());
        successAlert("HelloWorld successful!!!\nPublished Message: " + hello.serialize());
    }

    private void successAlert(String message) {
        AlertDialog alertDialog = new AlertDialog.Builder(HelloWorldActivity.this).create();
        alertDialog.setTitle("Bezirk HelloWorld");
        alertDialog.setMessage(message);
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        alertDialog.show();
    }
}
