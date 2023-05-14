package com.anet.LogManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.anet.LogManager.MainActivity;

import com.anet.upload.LogManager;
import com.anet.uploadfiles.R;


public class MainActivity extends AppCompatActivity  {

    // One Button
    Button BSelectImage;

    //private MyLifecycleObserver mObserver;

    // One Preview Image
    ImageView IVPreviewImage;

    // constant to compare
    // the activity result code
    int SELECT_PICTURE = 200;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // register the UI widgets with their appropriate IDs
        BSelectImage = findViewById(R.id.BSelectImage);
        IVPreviewImage = findViewById(R.id.IVPreviewImage);




        // handle the Choose Image button to trigger
        // the image chooser function
        BSelectImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               LogManager.i("Activity class");
               LogManager.d("You started DEBUG");
               LogManager.d("MyTag","You started DEBUG");


            }
        });
    }



}
