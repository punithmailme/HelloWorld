package bezirk.android.examples;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.bosch.upa.uhu.api.UhuAPI;
import com.bosch.upa.uhu.api.addressing.Address;
import com.bosch.upa.uhu.api.addressing.ServiceId;
import com.bosch.upa.uhu.api.messages.Event;
import com.bosch.upa.uhu.api.messages.UhuMessage;
import com.bosch.upa.uhu.proxy.android.UhuFactory;

public class HelloWorldActivity extends AppCompatActivity {

    private UhuAPI uhu;
    private ServiceId myId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        uhu = UhuFactory.getInstance(this);
        myId = uhu.registerService("HelloWorldAndroidService");
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
        Event hello = new Event(UhuMessage.Stripe.NOTICE, "Hello World");

        // 3. publish "hello world" to all in the target address
        uhu.sendEvent(myId, target, hello);

        // display the event that was just published
        System.out.println("Published: " + hello.serialize());
    }
}
