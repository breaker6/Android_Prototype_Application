package com.fbeltran.prototipo_aplicacion_completa;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.fbeltran.prototipo_aplicacion_completa.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMapClickListener, GoogleMap.OnMapLongClickListener, GoogleMap.OnMarkerClickListener, GoogleMap.OnMarkerDragListener {
    //mMap será la variable que nos permitirá hacer cosas en el mapa
    private GoogleMap mMap;
    private ActivityMapsBinding binding;
    private Marker marker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Busca en el layout el fragmento que tiene el id map y lo introduce en mapFragment
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        //getMapAsync espera a que el mapa se haya cargado completamente. Al hacerlo,
        //pasará al metodo onMapReady
        mapFragment.getMapAsync(this);
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
    //Este metodo se carga cuando el mapa ya está cargado. googleMap es el mapa
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        
        //Creamos la posición donde esta sydney
        LatLng sydney = new LatLng(-34, 151);
        //Ponemos el marcador en la posición creada y le ponemos un título
        marker = mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        //Movemos la cámara a donde esta el marcador
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        //El metodo setMapType permite elegir el tipo de mapa que queremos usar
        mMap.setMapType(googleMap.MAP_TYPE_HYBRID);
        //mMap.setMapType(googleMap.MAP_TYPE_NORMAL);
        //mMap.setMapType(googleMap.MAP_TYPE_SATELLITE);
        //mMap.setMapType(googleMap.MAP_TYPE_TERRAIN);

        //El evento setOnMapClickListener nos permite crear eventos cuando tocamos el mapa
        mMap.setOnMapClickListener(this);
        //Este evento nos permite crear eventos cuando dejamos pulsado en el mapa
        mMap.setOnMapLongClickListener(this);
        //Este evento se ejecuta cuando pulsamos en un marcador
        mMap.setOnMarkerClickListener(this);
        //Evento que se ejecuta cuando arrastramos un marcador
        //De el dependen los eventos onMarkerDragStart, onMarkerDrag y onMarkerDragEnd
        mMap.setOnMarkerDragListener(this);
    }

    //El evento onMapClick se ejecuta cuando tocamos el mapa y recibe un objeto con la posición de la
    //pulsación hecha
    @Override
    public void onMapClick(LatLng latLng) {
        //Movemos el marcador a donde se ha pulsado
        marker.setPosition(latLng);
        //Nos permite mover la camara instantaneamente a la posición pulsada
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
        //animateCamera nos permite mover la cámara de manera fluida a la posicion pulsada
        //El primer factor es la posición. El segundo es opcional y nos permite añadir un nivel de zoom
        mMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng,5));
    }
    //Este evento se ejecuta cuando hacemos una pulsacion larga en el mapa
    @Override
    public void onMapLongClick(LatLng latLng) {
        Toast.makeText(this, "Has pulsado en " + latLng, Toast.LENGTH_SHORT).show();
    }
    //Este evento se ejecuta cuando pulsamos en un marcador
    @Override
    public boolean onMarkerClick(Marker marker) {
        return false;
    }
    //Se ejecuta cuando empezamos a arrastrar un marcador
    @Override
    public void onMarkerDragStart(Marker marker) {

    }
    //Se ejecuta mientras arrastramos el marcador
    @Override
    public void onMarkerDrag(Marker marker) {

    }
    //Se ejecuta cuando soltamos el marcador que estabamos arrastrando
    @Override
    public void onMarkerDragEnd(Marker marker) {

    }
}