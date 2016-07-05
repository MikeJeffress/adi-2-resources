package com.example.jeanweatherwax.screen_rotation_lab;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static final String MY_ADDRESS = "address";
    static final String MY_NAME = "name";

    static String address;
    static String name;

    TextView addressView;
    TextView nameView;
    EditText addressEdit;
    EditText nameEdit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize views
         addressView = (TextView) findViewById(R.id.my_address);
         nameView = (TextView) findViewById(R.id.my_name);

         addressEdit = (EditText) findViewById(R.id.address_edit);m
         nameEdit = (EditText) findViewById(R.id.name_edit);

        final Button button = (Button) findViewById(R.id.save_button);

        //Retrieve name and address from savedInstanceState with getString() method.
//        if (address != null && name != null) {
//            name = savedInstanceState.getString("name");
//            address = savedInstanceState.getString("address");
//            addressView.setText("Your Address: " + address);
//            nameView.setText("Your Name: " + name);
//        }

        //Set the two TextViews with EditText inputs on button click.
        assert button != null;
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set TextViews with EditText inputs here.
                name = nameEdit.getText().toString();
                address = addressEdit.getText().toString();
                if ((name.length() > 0) && (address.length() > 0)) {
                    addressView.setText(address);
                    nameView.setText(name);
                }

                //Clear the EditTexts for new inputs.
                addressEdit.getText().clear();
                nameEdit.getText().clear();
            }
        });
    }

    //in onSaveInstanceState, use putString method to save address and name.
    //Also, make a Toast to display the saved state.
    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        // Save custom values into the bundle
        savedInstanceState.putString("name", name);
        savedInstanceState.putString("address", address);

        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }

    //In onRestoreInstanceState, use getString to retrieve the address and name.
    //Also show a Toast to display the restored state.
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        // Always call the superclass so it can restore the view hierarchy
        super.onRestoreInstanceState(savedInstanceState);
        // Restore state members from saved instance
        if (savedInstanceState != null) {
            name = savedInstanceState.getString("name", name);
            address = savedInstanceState.getString("address", address);
            addressView.setText("Your Address: " + address);
            nameView.setText("Your Name: " + name);
        }

    }

}
