package com.example.oladapo.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //testing git commit

    //I'm done

    public void ButtonTapped(View view){

        int id =view.getId();
        String ourId;

        ourId = view.getResources().getResourceEntryName(id);

        int resourceId = getResources().getIdentifier(ourId, "raw", "com.example.oladapo.basicphrases");

        MediaPlayer mplayer = MediaPlayer.create(this, resourceId);
        mplayer.start();

        Log.i("button tapped", ourId);

    }
}
