package com.parkingswap;

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
        import com.parkingswap.R;

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
        //North Campus Lot Coordinates
        LatLng Arena = new LatLng(43.000857, -78.779418);
        LatLng AlumniA = new LatLng(43.000716, -78.780223);
        LatLng AlumniB = new LatLng(43.001901, -78.77871);
        LatLng AlumniC = new LatLng(43.000857, -78.779418);
        LatLng BairdA = new LatLng(42.999374, -78.784461);
        LatLng CookeA = new LatLng(42.999437, -78.793216);
        LatLng CookeB = new LatLng(42.998715, -78.793237);
        LatLng Crofts = new LatLng(42.994807, -78.797078);
        LatLng Fargo = new LatLng(43.006405, -78.787122);
        LatLng GovernorsB = new LatLng(43.002356, -78.792486);
        LatLng GovernorsC = new LatLng(43.003768, -78.790362);
        LatLng GovernorsD = new LatLng(43.003863, -78.791993);
        LatLng GovernorsE = new LatLng(43.003737, -78.794096);
        LatLng HochstetterB = new LatLng(42.99859, -78.790212);
        LatLng JacobsB = new LatLng(42.998401, -78.7871);
        LatLng JacobsC = new LatLng(42.998574, -78.786113);
        LatLng JarvisA = new LatLng(43.003721, -78.788517);
        LatLng JarvisB = new LatLng(43.003972, -78.786929);
        LatLng Ketter = new LatLng(43.002466, -78.788838);
        LatLng LakeLaSalle = new LatLng(43.001328, -78.781049);
        LatLng RedJacket = new LatLng(43.008586, -78.787572);
        LatLng RichmondA = new LatLng(43.010359, -78.78695);
        LatLng RichmondB = new LatLng(43.009935, -78.788002);
        LatLng SpecialEventParking = new LatLng(42.997648, -78.784418);
        LatLng Stadium = new LatLng(42.997821, -78.779655);
        LatLng SleeA = new LatLng(42.99848, -78.783517);
        LatLng SleeB = new LatLng(42.999374, -78.783474);
        LatLng Spaulding = new LatLng(43.010594, -78.783259);



        //South Campus Lot Coordinates
        LatLng Abbot = new LatLng(42.955415,-78.819475);
        LatLng Clark = new LatLng(42.950364,-78.816095);
        LatLng Main_Bailey = new LatLng(42.95775,-78.816411);
        LatLng Parker = new LatLng(42.950376,-78.821787);
        LatLng Sherman = new LatLng(42.951874,-78.814746);
        LatLng Townsend = new LatLng(42.952361,-78.822779);

        if (LotActivity.ID.equals("Abbot_A")){
            //move map camera
            mMap.moveCamera(CameraUpdateFactory.newLatLng(Abbot));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(18));

        }
        else if(LotActivity.ID.equals("Clark")){
            mMap.moveCamera(CameraUpdateFactory.newLatLng(Clark));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(18));

        }
        else if(LotActivity.ID.equals("Main_Bailey")){
            mMap.moveCamera(CameraUpdateFactory.newLatLng(Main_Bailey));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(18));

        }
        else if(LotActivity.ID.equals("Parker")){
            mMap.moveCamera(CameraUpdateFactory.newLatLng(Parker));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(18));

        }
        else if(LotActivity.ID.equals("Sherman")){
            mMap.moveCamera(CameraUpdateFactory.newLatLng(Sherman));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(18));

        }
        else if(LotActivity.ID.equals("Townsend")){
            mMap.moveCamera(CameraUpdateFactory.newLatLng(Townsend));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(18));

        }else if(LotActivity.ID.equals("Arena")){
            mMap.moveCamera(CameraUpdateFactory.newLatLng(Arena));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(18));

        }else if(LotActivity.ID.equals("AlumniA")){
            mMap.moveCamera(CameraUpdateFactory.newLatLng(AlumniA));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(18));

        }else if(LotActivity.ID.equals("AlumniB")){
            mMap.moveCamera(CameraUpdateFactory.newLatLng(AlumniB));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(18));

        }else if(LotActivity.ID.equals("AlumniC")){
            mMap.moveCamera(CameraUpdateFactory.newLatLng(AlumniC));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(18));

        }else if(LotActivity.ID.equals("BairdA")){
            mMap.moveCamera(CameraUpdateFactory.newLatLng(BairdA));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(18));

        }else if(LotActivity.ID.equals("CookeA")){
            mMap.moveCamera(CameraUpdateFactory.newLatLng(CookeA));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(18));

        }else if(LotActivity.ID.equals("CookeB")){
            mMap.moveCamera(CameraUpdateFactory.newLatLng(CookeB));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(18));

        }else if(LotActivity.ID.equals("Crofts")){
            mMap.moveCamera(CameraUpdateFactory.newLatLng(Crofts));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(18));

        }else if(LotActivity.ID.equals("Fargo")){
            mMap.moveCamera(CameraUpdateFactory.newLatLng(Fargo));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(18));

        }else if(LotActivity.ID.equals("GovernorsB")){
            mMap.moveCamera(CameraUpdateFactory.newLatLng(GovernorsB));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(18));

        }else if(LotActivity.ID.equals("GovernorsC")){
            mMap.moveCamera(CameraUpdateFactory.newLatLng(GovernorsC));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(18));

        }else if(LotActivity.ID.equals("GovernorsD")){
            mMap.moveCamera(CameraUpdateFactory.newLatLng(GovernorsD));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(18));

        }else if(LotActivity.ID.equals("GovernorsE")) {
            mMap.moveCamera(CameraUpdateFactory.newLatLng(GovernorsE));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(18));

        }else if(LotActivity.ID.equals("HochstetterB")){
            mMap.moveCamera(CameraUpdateFactory.newLatLng(HochstetterB));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(18));

        }else if(LotActivity.ID.equals("JacobsB")){
            mMap.moveCamera(CameraUpdateFactory.newLatLng(JacobsB));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(18));

        }else if(LotActivity.ID.equals("JacobsC")){
            mMap.moveCamera(CameraUpdateFactory.newLatLng(JacobsC));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(18));

        }else if(LotActivity.ID.equals("JarvisA")){
            mMap.moveCamera(CameraUpdateFactory.newLatLng(JarvisA));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(18));

        }else if(LotActivity.ID.equals("JarvisB")){
            mMap.moveCamera(CameraUpdateFactory.newLatLng(JarvisB));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(18));

        }else if(LotActivity.ID.equals("Ketter")){
            mMap.moveCamera(CameraUpdateFactory.newLatLng(Ketter));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(18));

        }else if(LotActivity.ID.equals("LakeLaSalle")){
            mMap.moveCamera(CameraUpdateFactory.newLatLng(LakeLaSalle));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(18));

        }else if(LotActivity.ID.equals("RedJacket")){
            mMap.moveCamera(CameraUpdateFactory.newLatLng(RedJacket));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(18));

        }else if(LotActivity.ID.equals("RichmondA")){
            mMap.moveCamera(CameraUpdateFactory.newLatLng(RichmondA));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(18));

        }else if(LotActivity.ID.equals("RichmondB")){
            mMap.moveCamera(CameraUpdateFactory.newLatLng(RichmondB));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(18));

        }else if(LotActivity.ID.equals("SpecialEventParking")){
            mMap.moveCamera(CameraUpdateFactory.newLatLng(SpecialEventParking));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(18));

        }else if(LotActivity.ID.equals("Stadium")){
            mMap.moveCamera(CameraUpdateFactory.newLatLng(Stadium));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(18));

        }else if(LotActivity.ID.equals("SleeA")){
            mMap.moveCamera(CameraUpdateFactory.newLatLng(SleeA));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(18));

        }else if(LotActivity.ID.equals("SleeB")){
            mMap.moveCamera(CameraUpdateFactory.newLatLng(SleeB));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(18));

        }else if(LotActivity.ID.equals("Spaulding")){
            mMap.moveCamera(CameraUpdateFactory.newLatLng(Spaulding));
            mMap.animateCamera(CameraUpdateFactory.zoomTo(18));

        }


        //stop location updates
        if (mGoogleApiClient != null) {
            LocationServices.FusedLocationApi.removeLocationUpdates(mGoogleApiClient, this);
        }

    }

    @Override
    public void onConnected(@Nullable Bundle bundle) {
    }

    @Override
    public void onConnectionSuspended(int i) {

    }

    @Override
    public void onLocationChanged(Location location) {

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