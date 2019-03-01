package com.ismailhakkiaydin.fragmentler;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.ProgressDialog;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsoluteLayout;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity{



    private ImageView img ;
    private EditText txtSure;
    private MediaPlayer mp;
    private static int i =0;
    private Timer tmr;

    private void init(){
        tmr = new Timer();
        img = findViewById(R.id.imageView);
        txtSure = findViewById(R.id.editText);
        mp = MediaPlayer.create(this.raw.ses);
    }

    @Override
    public void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        Start();

    }

}
