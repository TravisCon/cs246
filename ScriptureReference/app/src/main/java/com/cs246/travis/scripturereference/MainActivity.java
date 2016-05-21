package com.cs246.travis.scripturereference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button share = (Button) findViewById(R.id.button);
        if (share != null)
            share.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, Results.class);
                    String message = "Your favorite scripture is:\n" +
                            ((EditText) findViewById(R.id.editBook)).getText().toString()
                            + " " +
                            ((EditText) findViewById(R.id.editChapter)).getText().toString()
                            + ":" +
                            ((EditText) findViewById(R.id.editVerse)).getText().toString();
                    intent.putExtra("message", message);
                    startActivity(intent);
                }
            });
    }
}
