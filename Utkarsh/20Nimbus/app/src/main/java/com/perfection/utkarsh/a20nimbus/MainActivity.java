package com.perfection.utkarsh.a20nimbus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        departmentalTeamsDeclare();
        coreTeamsDeclare();
    }
    int click1=0,click2=0,flag=0;
    public void teamPage(CardView card){
        card.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent intent = new Intent(MainActivity.this, team_page.class);
                                        startActivity(intent);
                                    }
                                });
    }
               // setContentView(R.layout.team_page);
                 /*Code For Team Page
                CardView cardview1 = (CardView)findViewById(R.id.card_event1);
                CardView cardview2 = (CardView)findViewById(R.id.card_event2);
                final LinearLayout event1 =(LinearLayout)findViewById(R.id.event1description);
                final LinearLayout event2 =(LinearLayout)findViewById(R.id.event2description);

                cardview1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        click1++;
                        if(click1==1){
                            event1.setVisibility(View.VISIBLE);
                        }else{
                            event1.setVisibility(View.GONE);
                            click1=0;
                        }
                    }
                });
                cardview2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        click2++;
                        if(click2==1){
                            event2.setVisibility(View.VISIBLE);
                        }else{
                            event2.setVisibility(View.GONE);
                            click2=0;
                        }
                    }
                });
            }
        });*/
    public void departmentalTeamsDeclare(){
        CardView team1,team2,team3,team4,team5,team6,team7;
        team1 = (CardView)findViewById(R.id.team1);teamPage(team1);
        team2 = (CardView)findViewById(R.id.team2);teamPage(team2);
        team3 = (CardView)findViewById(R.id.team3);teamPage(team3);
        team4 = (CardView)findViewById(R.id.team4);teamPage(team4);
        team5 = (CardView)findViewById(R.id.team5);teamPage(team5);
        team6 = (CardView)findViewById(R.id.team6);teamPage(team6);
        team7 = (CardView)findViewById(R.id.team7);teamPage(team7);
    }
    public void coreTeamsDeclare(){
        CardView team1,team2,team3,team4,team5,team6,team7,team8,team9,team10,team11,team12,team13,team14;
        team1  = (CardView)findViewById(R.id.coreteam1);teamPage(team1);
        team2  = (CardView)findViewById(R.id.coreteam2);teamPage(team2);
        team3  = (CardView)findViewById(R.id.coreteam3);teamPage(team3);
        team4  = (CardView)findViewById(R.id.coreteam4);teamPage(team4);
        team5  = (CardView)findViewById(R.id.coreteam5);teamPage(team5);
        team6  = (CardView)findViewById(R.id.coreteam6);teamPage(team6);
        team7  = (CardView)findViewById(R.id.coreteam7);teamPage(team7);
        team8  = (CardView)findViewById(R.id.coreteam8);teamPage(team8);
        team9  = (CardView)findViewById(R.id.coreteam9);teamPage(team9);
        team10 = (CardView)findViewById(R.id.coreteam10);teamPage(team10);
        team11 = (CardView)findViewById(R.id.coreteam11);teamPage(team11);
        team12 = (CardView)findViewById(R.id.coreteam12);teamPage(team12);
        team13 = (CardView)findViewById(R.id.coreteam13);teamPage(team13);
        team14 = (CardView)findViewById(R.id.coreteam14);teamPage(team14);
    }
}
