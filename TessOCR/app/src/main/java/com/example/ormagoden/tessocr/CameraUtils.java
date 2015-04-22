/**
 * Created by Ormagoden on 15/3/2558.
 */
package com.example.ormagoden.tessocr;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.util.Log;


public class CameraUtils {
    //Check if the device has a camera
    public static boolean deviceHasCamera(Context context) {
        return context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA);
    }

    //Get available camera
    public static Camera getCamera() {
        String TAG = "elf";
        try {
            return Camera.open();
        } catch (Exception e) {
            Log.e(TAG, "Cannot getCamera()");
            return null;
        }
    }
}
