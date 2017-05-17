package com.muddzdev.viewshot;

import android.Manifest;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.muddzdev.viewshotlibrary.Viewshot;


/**
 * Demo usage of the Viewshot library!
 * Take a viewshot (like screenshot) of any View, ViewGroup or SurfaceView.
 */
public class MainActivity extends AppCompatActivity implements Viewshot.OnSaveResultListener {

    private FrameLayout frameLayout;
    private Vibrator vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frameLayout = (FrameLayout) findViewById(R.id.framelayout);
        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        PermissionRequester permissionRequester = new PermissionRequester(this, this, Manifest.permission.WRITE_EXTERNAL_STORAGE);
        permissionRequester.request();
    }


    public void save(View view) {
        vibrator.vibrate(60);
        switch (view.getId()) {
            case R.id.jpg:
                Viewshot.of(frameLayout).setOnSaveResultListener(this).toJPG().save();
                break;
            case R.id.png:
                Viewshot.of(frameLayout).setOnSaveResultListener(this).toPNG().save();
                break;
            case R.id.nomedia:
                Viewshot.of(frameLayout).setOnSaveResultListener(this).toNomedia().save();
                break;
        }

    }

    @Override
    public void onSaveResult(boolean isSaved, String path) {
        if (isSaved) {
            Toast.makeText(this, "Saved to: " + path, Toast.LENGTH_LONG).show();
        }
    }
}
