package com.perfection.utkarsh.a20nimbus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by utkarsh on 21/3/18.
 */

public class team_page extends MainActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.team_page);
        CardView cardview1=(CardView)findViewById(R.id.card_event1);openEvent(cardview1);
        CardView cardview2=(CardView)findViewById(R.id.card_event2);openEvent(cardview2);
        CardView cardview3=(CardView)findViewById(R.id.card_event3);openEvent(cardview3);
        CardView cardview4=(CardView)findViewById(R.id.card_event4);openEvent(cardview4);

    }
    public void openEvent(CardView card){
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(team_page.this,EventPage.class);
                startActivity(intent);
            }
        });
    }

}
