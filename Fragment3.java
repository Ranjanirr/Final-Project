package com.example.finalproject;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;


public class Fragment3 extends Fragment{
    private String answer;
    private String description;
    public Fragment3(String answer, String description) {
        this.answer = answer;
        this.description = description;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment3, container, false);

    }
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        TextView answerView  = (TextView) getView().findViewById (R.id.textView3);
        answerView.setText(answer);
        TextView descriptionView  = (TextView) getView().findViewById (R.id.textView4);
        descriptionView.setText(description);
    }

}
