package com.example.jaskiratsingh.parkingswap;

        import android.Manifest;
        import android.content.pm.PackageManager;
        import android.location.Location;
        import android.os.Build;
        import android.support.annotation.NonNull;
        import android.support.annotation.Nullable;
        import android.support.v4.app.ActivityCompat;
        import android.os.Bundle;
        import android.support.v4.content.ContextCompat;
        import android.support.v7.app.AppCompatActivity;
        import android.widget.Toast;

        import com.google.android.gms.common.ConnectionResult;
        import com.google.android.gms.common.api.GoogleApiClient;
        import com.google.android.gms.location.LocationListener;
        import com.google.android.gms.location.LocationRequest;
        import com.google.android.gms.location.LocationServices;
        import com.google.android.gms.maps.CameraUpdateFactory;
        import com.google.android.gms.maps.GoogleMap;
        import com.google.android.gms.maps.OnMapReadyCallback;
        import com.google.android.gms.maps.SupportMapFragment;
        import com.google.android.gms.maps.model.LatLng;

public class CampusMapActivity extends AppCompatActivity
        implements OnMapReadyCallback,
        GoogleApiClient.ConnectionCallbacks,
        GoogleApiClient.OnConnectionFailedListener,
        LocationListener{

    private static final int Permission_request = 1 ;
    private GoogleMap mMap;
    SupportMapFragment mapFrag;
    LocationRequest mLocReq;
    GoogleApiClient mGoogleApiClient;
    Location mLastLoc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_campus);
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            checkLocationPermission();
        }
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onPause() {
        super.onPause();
        if (mGoogleApiClient != null) {
            LocationServices.FusedLocationApi.removeLocationUpdates(mGoogleApiClient, this);
        }
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
        if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (ContextCompat.checkSelfPermission(this,
                    Manifest.permission.ACCESS_FINE_LOCATION)
                    == PackageManager.PERMISSION_GRANTED) {
                mMap.setMyLocationEnabled(true);
            }
        }
        else {
            mMap.setMyLocationEnabled(true);
        }
        LatLng UB = new LatLng(42.999,-78.791585);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(UB));
    }

    @Override
    public void onConnected(@Nullable Bundle bundle) {
    }

    @Override
    public void onConnectionSuspended(int i) {

    }

    @Override
    public void onLocationChanged(Location location) {
        LatLng Abbot = new LatLng(42.955415,-78.819475);
        LatLng Clark = new LatLng(42.950364,-78.816095);
        LatLng Main_Bailey = new LatLng(42.95775,-78.816411);
        LatLng Parker = new LatLng(42.950376,-78.821787);
        LatLng Sherman = new LatLng(42.951874,-78.814746);
        LatLng Townsend = new LatLng(42.952361,-78.822779);
        String ID = ((findButton)this.getApplication()).getButtonID();

        if (ID.equals("Abbot_A")){
            //move map camera
            mMap.moveCamera(CameraUpdateFactory.newLatLng(Abbot));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(18));

        }
        else if(ID.equals("Clark")){
            mMap.moveCamera(CameraUpdateFactory.newLatLng(Clark));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(18));

        }
        else if(ID.equals("Main_Bailey")){
            mMap.moveCamera(CameraUpdateFactory.newLatLng(Main_Bailey));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(18));

        }
        else if(ID.equals("Parker")){
            mMap.moveCamera(CameraUpdateFactory.newLatLng(Parker));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(18));

        }
        else if(ID.equals("Sherman")){
            mMap.moveCamera(CameraUpdateFactory.newLatLng(Sherman));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(18));

        }
        else if(ID.equals("Townsend")){
            mMap.moveCamera(CameraUpdateFactory.newLatLng(Townsend));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(18));

        }


        //stop location updates
        if (mGoogleApiClient != null) {
            LocationServices.FusedLocationApi.removeLocationUpdates(mGoogleApiClient, this);
        }

    }

    @Override
    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {

    }

    public boolean checkLocationPermission(){
        if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED) {

            if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                    Manifest.permission.ACCESS_FINE_LOCATION)) {
                ActivityCompat.requestPermissions(this,
                        new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                        Permission_request);


            } else {
                ActivityCompat.requestPermissions(this,
                        new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                        Permission_request);
            }
            return false;
        } else {
            return true;
        }
    }



    @Override
    public void onRequestPermissionsResult(
            int requestCode, String permissions[], int[] grantResults) {
        switch (requestCode) {
            case Permission_request: {
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    if (ContextCompat.checkSelfPermission(this,
                            Manifest.permission.ACCESS_FINE_LOCATION)
                            == PackageManager.PERMISSION_GRANTED) {
                        mMap.setMyLocationEnabled(true);
                    }

                } else {

                    Toast.makeText(this, "Permission Denied", Toast.LENGTH_LONG).show();
                }
                return;
            }

        }
    }

}