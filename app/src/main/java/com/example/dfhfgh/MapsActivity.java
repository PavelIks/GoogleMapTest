package com.example.dfhfgh;
import androidx.fragment.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback
{
    private GoogleMap MyGoogleMap1, MyGoogleMap2;
    EditText EditTextNumber1_ID, EditTextNumber2_ID;
    Button Button1_ID;

    double latitude = 0.0;
    double longitude = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        EditTextNumber1_ID = (EditText) findViewById(R.id.editTextNumber);
        EditTextNumber2_ID = (EditText) findViewById(R.id.editTextNumber2);
        Button1_ID = (Button) findViewById(R.id.button1);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap GoogleMap1)
    {
        MyGoogleMap1 = GoogleMap1;
        LatLng ukr1 = new LatLng(50.4536, 30.5164);
        MyGoogleMap1.addMarker(new MarkerOptions().position(ukr1).title("Kyev"));
        // MyGoogleMap1.moveCamera(CameraUpdateFactory.newLatLng(ukr1));
        // MyGoogleMap1.setMinZoomPreference(10.0f);

        MyGoogleMap2 = GoogleMap1;
        LatLng ukr2 = new LatLng(latitude, longitude);
        MyGoogleMap2.moveCamera(CameraUpdateFactory.newLatLng(ukr2));
        MyGoogleMap2.setMinZoomPreference(10.0f);
    }

    public void onClick(View view)
    {
        EditTextNumber1_ID.setText(""+latitude);
        EditTextNumber2_ID.setText(""+longitude);

        //EditTextNumber1_ID.setText("" + latitude);
        //EditTextNumber2_ID.setText("" + longitude);

        //EditTextNumber1_ID.setText(Double.toString(latitude));
        //EditTextNumber1_ID.setText(Double.toString(longitude));

        //latitude = Float.parseFloat(EditTextNumber1_ID.setText().toString());
        //longitude = Float.parseFloat(EditTextNumber2_ID.setText().toString());
    }
}