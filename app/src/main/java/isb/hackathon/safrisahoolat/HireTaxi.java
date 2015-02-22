package isb.hackathon.safrisahoolat;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by LAFARGE on 2/21/2015.
 */
public class HireTaxi extends Activity {

    private ImageView taxiImage;
    private Shaker mShaker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hire_taxi);

        taxiImage = (ImageView) findViewById(R.id.taxiImage);
        final Vibrator vibe = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
        mShaker = new Shaker(this);
        mShaker.setOnShakeListener(new Shaker.OnShakeListener() {
            public void onShake() {

                Drawable res = getResources().getDrawable(R.drawable.places);
                taxiImage.setImageDrawable(res);
            }
        });

        taxiImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Drawable res = getResources().getDrawable(R.drawable.taixii);
                taxiImage.setImageDrawable(res);
            }
        });
    }
}

