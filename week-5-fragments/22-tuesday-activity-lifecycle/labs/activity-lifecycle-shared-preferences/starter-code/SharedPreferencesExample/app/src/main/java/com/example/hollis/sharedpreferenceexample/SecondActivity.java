package com.example.hollis.sharedpreferenceexample;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by michaeljeffress on 7/5/16.
 */
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        TextView textView = (TextView)findViewById(R.id.textView);

        SharedPreferences sharedPreferences = getSharedPreferences("key", ???);
        String message = sharedPreferences.getString("submit", "Default");

        textView.setText("Message from first Activity: " + message);

    }


}
