package isb.hackathon.safrisahoolat;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.RadioButton;

/**
 * Created by LAFARGE on 2/21/2015.
 */
public class OptionsActivity extends Activity implements View.OnClickListener{

    private Button myTaxi,myHostel,myPlace,myMart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.options);

        myTaxi = (Button) findViewById(R.id.taxi);
        myHostel = (Button) findViewById(R.id.hostel);
        myPlace = (Button) findViewById(R.id.places);
        myMart = (Button) findViewById(R.id.marts);

        myTaxi.setOnClickListener(this);
        myHostel.setOnClickListener(this);
        myPlace.setOnClickListener(this);
        myMart.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){

        try
        {
            if(v.getId()==R.id.taxi)
            {
                Intent intent = new Intent(getApplicationContext(), HireTaxi.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
            else if(v.getId()==R.id.hostel)
            {
                Intent intent = new Intent(getApplicationContext(), GirlsHostels.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
            else if(v.getId()==R.id.places)
            {
                Intent intent = new Intent(getApplicationContext(), AwesomePlaces.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
            else if(v.getId()==R.id.marts)
            {
                Intent intent = new Intent(getApplicationContext(), Marts.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        }catch(Exception ex) {

        }
    }
}
