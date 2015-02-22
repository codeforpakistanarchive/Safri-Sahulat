package isb.hackathon.safrisahoolat;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by LAFARGE on 2/21/2015.
 */
public class AwesomePlaces  extends Activity {

    private ImageView placesImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.awesome_places);

        placesImage = (ImageView) findViewById(R.id.placesImage);
        placesImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Drawable res = getResources().getDrawable(R.drawable.monument);
                placesImage.setImageDrawable(res);
            }
        });
    }
}

