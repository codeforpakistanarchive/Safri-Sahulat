package isb.hackathon.safrisahoolat;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.hardware.SensorManager;
import android.os.Vibrator;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Main extends Activity {

    private Shaker mShaker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        startActivity(new Intent(Main.this, OptionsActivity.class));

        /*final Vibrator vibe = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
        mShaker = new Shaker(this);
        mShaker.setOnShakeListener(new Shaker.OnShakeListener() {
            public void onShake() {

                vibe.vibrate(100);
                startActivity(new Intent(Main.this, OptionsActivity.class));
            }
        });*/
    }

    //@Override
    /*public void onResume()
    {
        mShaker.resume();
        super.onResume();
    }
    @Override
    public void onPause()
    {
        mShaker.pause();
        super.onPause();
    }*/
}