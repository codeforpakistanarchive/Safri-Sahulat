package isb.hackathon.safrisahoolat;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by LAFARGE on 2/21/2015.
 */
public class Marts extends Activity {

    private ImageView martsImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.marts);

        martsImage = (ImageView) findViewById(R.id.martsImage);
        martsImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Drawable res = getResources().getDrawable(R.drawable.martview);
                martsImage.setImageDrawable(res);
            }
        });
    }
}

