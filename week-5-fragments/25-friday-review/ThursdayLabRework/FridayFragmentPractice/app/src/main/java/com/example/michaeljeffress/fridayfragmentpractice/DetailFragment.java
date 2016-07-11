package com.example.michaeljeffress.fridayfragmentpractice;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by michaeljeffress on 7/8/16.
 */
public class DetailFragment extends Fragment {
    private TextView textView;
    private Button button;
    private String textFromMainActivity;

    //2)declare interface variable inside fragment
    private OnSendStringListener onSendStringListener;

    //3)Cmd N to get Override onAttach
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);


        try {
            //4)set value of interface from activity and wrap with try/catch
            onSendStringListener = (OnSendStringListener) getActivity();
        } catch (ClassCastException e){
            throw new ClassCastException("Activity must implement OnSendStringListener");
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail, container, false);

        return view;
    }

    //5)create onViewCreated to setup button and listener and move textview
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView = (TextView) getView().findViewById(R.id.detail_text);
        button = (Button) getView().findViewById(R.id.detail_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //reverse the string (goal of sending back differently)
                StringBuilder sb = new StringBuilder(textFromMainActivity);
                String reversed = sb.reverse().toString();


                //7) use interface variable to send reversed string to send it back activity
                onSendStringListener.onStringSent(reversed);

            }
        });

    }

    //6 fixed text
    public void setText(String fromMain){
        textFromMainActivity = fromMain;
        textView.setText(fromMain);
    }



}
