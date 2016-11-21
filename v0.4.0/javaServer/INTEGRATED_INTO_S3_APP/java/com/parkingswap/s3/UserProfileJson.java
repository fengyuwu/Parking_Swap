package com.parkingswap.s3;

/**
 * Created by Baldy 19 on 11/12/2016.
 */

import android.Manifest;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.support.v4.app.ActivityCompat;

import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.mobile.AWSConfiguration;
import com.amazonaws.mobile.AWSMobileClient;
import com.amazonaws.mobile.user.IdentityManager;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferObserver;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferState;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferUtility;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;

import org.json.simple.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UserProfileJson {

    // Storage Permissions
    private static final int REQUEST_EXTERNAL_STORAGE = 1;
    private static String[] PERMISSIONS_STORAGE = {
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
    };

    JSONObject obj;
    User user;
    com.parkingswap.user_info_activity user_info_activity;

    public UserProfileJson(com.parkingswap.user_info_activity user_info_activity){

        obj = new JSONObject();
        user = User.getTheUser(); //This is terrible. Like this is really bad. Supposed to use Factories...
        System.out.println(user);

        this.user_info_activity = user_info_activity;

    }

    public void buildJson(){

        obj.put("User ID", user.getID());
        obj.put("Latitude", user.getLatitude());
        obj.put("Longitude", user.getLongitude());
        obj.put("Car", user.getCar());


        verifyStoragePermissions(user_info_activity);
        FileWriter fw=null;
        File file=null;
        try {
            file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS),"testJson.txt");
            fw = new FileWriter(file);
            fw.write(obj.toJSONString());
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS));
        System.out.println("\nJSON Object: " + obj);

        //upload1(file);
        //upload2();

    }
/*

    public void upload1(File file){

        //Upload file to S3 bucket.
        //Obtain a reference to the mobile client. It is created in the Application class,
        //but in case a custom Application class is not used, we initialize it here if necessary.
        AWSMobileClient.initializeMobileClientIfNecessary(user_info_activity);

        //Obtain a reference to the mobile client. It is created in the Application class.
        final AWSMobileClient awsMobileClient = AWSMobileClient.defaultMobileClient();

        //Obtain a reference to the identity manager.
        IdentityManager identityManager = awsMobileClient.getIdentityManager();
        CognitoCachingCredentialsProvider credentialsProvider = identityManager.getCredentialsProvider();

        //Create an S3 client
        AmazonS3 s3 = new AmazonS3Client(credentialsProvider);
        TransferUtility transferUtility = new TransferUtility(s3, user_info_activity);

        TransferObserver transOb = transferUtility.upload(AWSConfiguration.AMAZON_S3_USER_FILES_BUCKET, "private/testkey.txt", file);

        while(transOb.getState() != TransferState.COMPLETED){
            System.out.println(transOb.getState());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
*/

    public void upload2(){

        /*new Thread(new Runnable() {
            @Override
            public void run() {

                final CountDownLatch userFileManagerCreatingLatch = new CountDownLatch(1);

                try {
                    userFileManagerCreatingLatch.await();
                } catch (final InterruptedException ex) {
                    // This thread should never be interrupted.
                    throw new RuntimeException(ex);
                }

                final File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS),"testJson.txt");
                UserFilesBrowserFragment.this.userFileManager = userFileManager;
                userFileManager.uploadContent(file, currentPath + file.getName(), new ContentProgressListener() {
                    @Override
                    public void onSuccess(final ContentItem contentItem) {
                        contentListItems.add(new ContentListItem(contentItem));
                        contentListItems.sort(ContentListItem.contentAlphebeticalComparator);
                        contentListItems.notifyDataSetChanged();
                        dialog.dismiss();
                    }

                    @Override
                    public void onProgressUpdate(final String fileName, final boolean isWaiting,
                                                 final long bytesCurrent, final long bytesTotal) {
                        dialog.setProgress((int) bytesCurrent);
                    }

                    @Override
                    public void onError(final String fileName, final Exception ex) {
                        dialog.dismiss();
                        showError(R.string.user_files_browser_error_message_upload_file,
                                ex.getMessage());
                    }
                });
            }
        }).start();*/

    }
    /**
     * Checks if the app has permission to write to device storage
     *
     * If the app does not has permission then the user will be prompted to grant permissions
     *
     * @param activity
     */
    public static void verifyStoragePermissions(Activity activity) {
        // Check if we have write permission
        int permission = ActivityCompat.checkSelfPermission(activity, Manifest.permission.WRITE_EXTERNAL_STORAGE);

        if (permission != PackageManager.PERMISSION_GRANTED) {
            // We don't have permission so prompt the user
            ActivityCompat.requestPermissions(
                    activity,
                    PERMISSIONS_STORAGE,
                    REQUEST_EXTERNAL_STORAGE
            );
        }
    }

}
