package com.stingrey.mymapa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private String ubicado;
    private androidx.appcompat.widget.Toolbar actionBar;
    AppCompatActivity barra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.fragment_map);
        mapFragment.getMapAsync(this);

        //Se obtiene el dato guardado en el Intent
        Bundle extra = getIntent().getExtras();
        ubicado = extra.getString("seleccionado");
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng catedral = new LatLng(6.254053129633825, -75.56389510631561);
        LatLng explora = new LatLng(6.270658247088856, -75.56572973728181);
        LatLng museo = new LatLng(6.2523573942954505, -75.56914150714874);
        LatLng arvi = new LatLng(6.281344112481881, -75.50287485122682);

        //Se compara la variable para identificar cuales coordenadas usar
        switch (ubicado) {

            case "catedral":
                mMap.addMarker(new MarkerOptions().position(catedral).title("Marker in Catedral Metropolitana"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(catedral));
            break;

            case "explora":
                mMap.addMarker(new MarkerOptions().position(explora).title("Marker in Parque Explora"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(explora));
                break;

            case "museo":
                mMap.addMarker(new MarkerOptions().position(museo).title("Marker in Museo de Antioquia"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(museo));
                break;

            case "arvi":
                mMap.addMarker(new MarkerOptions().position(arvi).title("Marker in Parque Arvi"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(arvi));
                break;

        }

    }
}