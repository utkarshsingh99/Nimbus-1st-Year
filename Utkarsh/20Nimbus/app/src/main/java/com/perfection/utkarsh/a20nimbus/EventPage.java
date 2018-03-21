package com.perfection.utkarsh.a20nimbus;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.LinearLayout;

public class EventPage extends AppCompatActivity {
    int click1=0,click2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_page);

        CardView cardview1 = (CardView)findViewById(R.id.cardTimings);
        CardView cardview2 = (CardView)findViewById(R.id.desc_event);
        final LinearLayout time = (LinearLayout) findViewById(R.id.time_detail);
        final LinearLayout about = (LinearLayout) findViewById(R.id.event_description);
        cardview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click1++;
                if(click1==1){
                    time.setVisibility(View.VISIBLE);
                }else{
                    time.setVisibility(View.GONE);
                    click1=0;
                }
            }
        });
        cardview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click2++;
                if(click2==1){
                    about.setVisibility(View.VISIBLE);
                }else{
                    about.setVisibility(View.GONE);
                    click2=0;
                }
            }
        });
    }

}
