package com.example.finalproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import java.util.Arrays;
import java.util.Collections;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import java.util.Iterator;
import java.util.LinkedList;

import android.os.Bundle;


import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.HashMap;

public  class Fragment2 extends Fragment {
    private int answer1;
    private int answer2;
    private int answer3;
    private LinkedList questionList;
    private Iterator<Question> iterator;

    private Button firstAnswer;
    private Button secondAnswer;
    private Button thirdAnswer;
    private TextView question;
    private int quesNumber;

    public Fragment2(LinkedList<Question> questionList, int quesNumber){
        this.questionList = questionList;
        iterator = questionList.iterator();
        this.quesNumber = quesNumber;

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View dee =  inflater.inflate(R.layout.fragment2, container, false);

        return dee;

    }
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setAnswers();

        firstAnswer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                answer1 += 1;

                if (checkLast() == false) {
                    Question current = (Question) iterator.next();
                    firstAnswer.setText(current.getAnswer1());
                    secondAnswer.setText(current.getAnswer2());
                    thirdAnswer.setText(current.getAnswer3());
                    question.setText(current.getQuestion());
                }

            }
        });
        secondAnswer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                answer2 += 1;
                if (checkLast() == false) {
                    Question current = (Question) iterator.next();
                    firstAnswer.setText(current.getAnswer1());
                    secondAnswer.setText(current.getAnswer2());
                    thirdAnswer.setText(current.getAnswer3());
                    question.setText(current.getQuestion());
                }

            }
        });
        thirdAnswer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                answer3 += 1;
                if (checkLast() == false){
                    Question current = (Question) iterator.next();
                    firstAnswer.setText(current.getAnswer1());
                    secondAnswer.setText(current.getAnswer2());
                    thirdAnswer.setText(current.getAnswer3());
                    question.setText(current.getQuestion());
                }

            }
        });
    }




    public boolean checkLast() {
        Answer answer = new Answer("", "");
        //check if the next of the iterator is null and then call the third fragment

        if (!(iterator.hasNext())) {

            Integer[] maxAnswer = new Integer[3];
            maxAnswer[0] = answer1;
            maxAnswer[1] = answer2;
            maxAnswer[2] = answer3;
            int max = Collections.max(Arrays.asList(maxAnswer));
            HashMap<Integer, Integer> maxMap = new HashMap<>();
            maxMap.put(answer1, 1);
            maxMap.put(answer2, 2);
            maxMap.put(answer3, 3);
            if (maxMap.get(max) == 1) {
                if (quesNumber == 1) {
                    answer = new Answer("A personal plane", "You can do things fast and have a lot of energy. Life would be" +
                            "great if you can get anywhere without any obstacles. You are determined and take risks, however, please be cautious" +
                            "before doing something too daredevil ");

                } else if (quesNumber == 2) {
                    answer = new Answer("A general who led America to victory in a major war", "You always have a vision, " +
                            "are organized and goal oriented. A bold and determined leader like you will always be victorious when they want it");

                } else if (quesNumber == 3) {
                    answer = new Answer("Philosophy", "Everyone acts like they know everything, but you think that " +
                            "too many things are left unanswered. You think about the surreal and question the common concious and rules" +
                            "that too many people have put in place. ");

                }
            }
            else if (maxMap.get(max) == 2) {
                    if (quesNumber == 1) {
                        answer = new Answer("Self driving car", "You have a clever, scientific mind and you use your intellect" +
                                "to invent things that solve your inconveniences. A self driving car takes the toll of mannual labor away. But " +
                                "be careful before trusting it to be as smart as you. ");
                    } else if (quesNumber == 2) {
                        answer = new Answer("Winning a talent show", "You love being the star of the show, and everyone comes " +
                                "to you whenever they want to be entertained. Your best shot at being famous is to perform whatever art you think" +
                                "is meaningful. ");

                    } else if (quesNumber == 3) {
                        answer = new Answer("Fashion design", "You are not a big fan of reading and lectures, and you " +
                                "find the best way to learn is making things on your own. You also have a great visual taste. Those two " +
                                "skills can lead you to start the latest trends");
                    }
                }
            else if (maxMap.get(max) == 3) {
                    if (quesNumber == 1) {
                        answer = new Answer("Horse drawn charriot", "You are as lovely as royalty, and you miss the " +
                                "fanciness and graces that were common a couple centuries ago. You prefer nature, art and beauty more than" +
                                "convenient (but rather ugly) products");
                    } else if (quesNumber == 2) {
                        answer = new Answer("Finding $10,000 worth of gems underground", "You are curious and you would be the most" +
                                "satisfied when you discover something new. Do not let your routine, everyday life to erase your persuit to happiness.");

                    } else if (quesNumber == 3) {
                        answer = new Answer("Gender Studies", "You are not ready to submit into any role society has" +
                                "set up for you. You are always yourself, and fight for everyone's rights and are not afraid of contraversy." );

                    }

            }
            Fragment childFragment = new Fragment3(answer.getAnswer(), answer.getDescription());
            FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
            transaction.replace(R.id.fragmentji, childFragment).commit();
            return true;
        }
        else{

            return  false;
        }

    }
    public void setAnswers(){
        firstAnswer = (Button) getView().findViewById(R.id.button);
        secondAnswer = (Button) getView().findViewById(R.id.button2);
        thirdAnswer = (Button) getView().findViewById(R.id.button3);
        question = (TextView)  getView().findViewById(R.id.textView);
        Question current = (Question) iterator.next();
        firstAnswer.setText(current.getAnswer1());
        secondAnswer.setText(current.getAnswer2());
        thirdAnswer.setText(current.getAnswer3());
        question.setText(current.getQuestion());
    }
}