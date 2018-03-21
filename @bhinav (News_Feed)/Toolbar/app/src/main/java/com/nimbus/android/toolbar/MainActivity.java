package com.nimbus.android.toolbar;

import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow(); // in Activity's onCreate() for instance
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
        setContentView(R.layout.activity_main);
    }
    public void upload(View view)
    {
        View uploaddetails = (View) findViewById(R.id.uploaddetails);
        uploaddetails.setVisibility(View.VISIBLE);
        View news = (View) findViewById(R.id.newsfeedshow);
        news.setVisibility(View.GONE);
        Button uploadbutton = (Button) findViewById(R.id.uploadbutton);
        Button newsfeedbutton = (Button) findViewById(R.id.newsfeedbutton);
        uploadbutton.setBackground(ContextCompat.getDrawable(this , R.drawable.b4));
        newsfeedbutton.setBackground(ContextCompat.getDrawable(this,R.drawable.b5));
        newsfeedbutton.setTextColor(getResources().getColor(R.color.white));
        uploadbutton.setTextColor(getResources().getColor(R.color.reddishpink));
    }

    public void newsfeed(View view)
    {
        View uploaddetails = (View) findViewById(R.id.uploaddetails);
        uploaddetails.setVisibility(View.GONE);
        View news = (View) findViewById(R.id.newsfeedshow);
        news.setVisibility(View.VISIBLE);
        Button uploadbutton = (Button) findViewById(R.id.uploadbutton);
        Button newsfeedbutton = (Button) findViewById(R.id.newsfeedbutton);
        uploadbutton.setBackground(ContextCompat.getDrawable(this , R.drawable.b3));
        uploadbutton.setTextColor(getResources().getColor(R.color.white));
        newsfeedbutton.setTextColor(getResources().getColor(R.color.reddishpink));
        newsfeedbutton.setBackground(ContextCompat.getDrawable(this,R.drawable.b2));
    }
}
