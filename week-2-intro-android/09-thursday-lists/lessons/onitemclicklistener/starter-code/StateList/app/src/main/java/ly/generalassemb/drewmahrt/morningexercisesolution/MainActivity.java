package ly.generalassemb.drewmahrt.morningexercisesolution;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    ListView mListView;
    ArrayAdapter<String> mArrayAdapter;
    String currentString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView)findViewById(R.id.list);

        //Button abbrevButton = (Button)findViewById(R.id.abbreviation_button);
        //Button fullButton = (Button)findViewById(R.id.fullname_button);

        //ListView abbrevText = (ListView)findViewById(R.id.list);
        //ListView fullText = (ListView)findViewById(R.id.list);



        final ArrayList<String> abbreviationsList = new ArrayList<>(Arrays.asList("AL","AK","AZ","AR","CA","CO","CT","DE","FL","GA","HI","ID","IL","IN","IA","KS","KY","LA","ME","MD"));
        final ArrayList<String> fullNamesList = new ArrayList<>(Arrays.asList("Alabama","Alaska","Arizona","Arkansas","California","Colorado","Connecticut","Delaware","Florida","Georgia","Hawaii","Idaho","Illinois","Indiana","Iowa","Kansas","Kentucky","Louisiana","Main","Maryland"));
        final ArrayList<String> stateList = new ArrayList<>(abbreviationsList);

        mArrayAdapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,stateList);
        mListView.setAdapter(mArrayAdapter);

        /**
         * Given the button click listeners below, you want to use an OnItemClickListener on your listview
         * INSTEAD of these two button click listeners.
         *
         * Each item I click in the list should toggle between abbreviation and full name
         *
         * Hint: How can you make sure your values are changing without modifying the original two lists?
         */

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String currentString = mArrayAdapter.getItem(position);
                    if (currentString.equals(abbreviationsList.get(position))){
                        currentString = fullNamesList.get(position);
                    }
                    else if (currentString.equals(fullNamesList.get(position))){
                        currentString = abbreviationsList.get(position);
                    }

                stateList.set(position, currentString);

                mArrayAdapter.notifyDataSetChanged();
            }
        });

//        });mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onClick(View v) {
//                mArrayAdapter.clear();
//                mArrayAdapter.addAll(abbreviationsList);
//                mArrayAdapter.notifyDataSetChanged();
//            }
//        });
//
//        mListView.setOnItemClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mArrayAdapter.clear();
//                mArrayAdapter.addAll(fullNamesList);
//                mArrayAdapter.notifyDataSetChanged();
//            }
//        });


    }
}
