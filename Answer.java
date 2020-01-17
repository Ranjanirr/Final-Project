
package com.example.finalproject;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import java.util.Iterator;
import java.util.LinkedList;

public class Answer {
    private String answer;
    private String description;
    //include a picture?

    public Answer(String answer, String description) {
        this.answer = answer;
        this.description = description;
    }

    public String getAnswer() {
        return this.answer;
    }

    public String getDescription() {
        return this.description;
    }

}