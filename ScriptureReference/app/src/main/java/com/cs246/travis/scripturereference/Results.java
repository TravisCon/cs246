package com.cs246.travis.scripturereference;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.RelativeLayout;
import android.widget.TextView;

/*************************************
 * Created by Travis on 5/20/2016.
 ************************************/
public class Results extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        displayText();
    }

    public void displayText(){
        Intent intent = getIntent();
        String message = intent.getStringExtra("message");
        TextView textView = new TextView(this);
        textView.setText(message);
        textView.setTextSize(40);
        textView.setPadding(10,10,10,10);
        textView.setGravity(Gravity.CENTER);

        RelativeLayout layout = (RelativeLayout) findViewById(R.id.content);
        layout.addView(textView);
    }
}
