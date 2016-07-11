package com.example.michaeljeffress.fridayfragmentpractice;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements OnSendStringListener {

    private String textInMain = "I'm the text in the Main Activity";
    private Button button;
    private EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.main_button);
        editText = (EditText) findViewById(R.id.main_edit_text);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = editText.getText().toString();
                passDataToFragment(text);

                editText.setText("");
            }
        });
            // do the 5 lines of code to add your first fragment here
    }

    @Override
    public  void onStringSent (String textToSend) {
        editText.setText(textToSend);
        passDataToFragment(textToSend + "did text change?"); //changes fragment text

        //if using dynamic fragments
        //pass data to your other fragment
        //swap fragment A for fragment B

    }

    private void passDataToFragment(String text){
        FragmentManager fragmentManager = getSupportFragmentManager();
        DetailFragment detailFragment = (DetailFragment) fragmentManager.findFragmentById(R.id.fragment);
        detailFragment.setText(text);
    }

}
