package com.example.currentplacedetailsonmap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.os.Bundle;
import android.widget.ImageButton;
import android.content.Intent;

public class HomeActivity extends AppCompatActivity {
    private ImageButton button;
    private ImageButton bttn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        button = (ImageButton) findViewById(R.id.faqButton);
        bttn = (ImageButton) findViewById(R.id.mapButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFaqActivity();
            }
        });

        bttn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openMapsActivity();
            }
        });
    }
    public void openFaqActivity(){
        Intent intent = new Intent(this, FaqActivity.class);
        startActivity(intent);

    }

    public void openMapsActivity(){
        Intent intent = new Intent(this, MapsActivityCurrentPlace.class);
        startActivity(intent);
    }

}
