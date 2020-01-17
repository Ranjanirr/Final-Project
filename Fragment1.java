package com.example.finalproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import java.util.LinkedList;
import android.util.Log;
import android.os.Bundle;


public  class Fragment1 extends Fragment {
        private int answer1;
        private int answer2;
        private int answer3;

        private Button firstAnswer;
        private Button secondAnswer;
        private Button thirdAnswer;
        private TextView question;

        public Fragment1() {

        }


        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
                // Inflate the layout for this fragment

                View dee = inflater.inflate(R.layout.fragment1, container, false);
                return dee;

        }


        @Override
        public void onActivityCreated(Bundle savedInstanceState) {
                super.onActivityCreated(savedInstanceState);
                setAnswers();
                Log.d("GGOOOPPP", "It has gotten to the first part");
                firstAnswer.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                                // Do something in response to button click
                                LinkedList<Question> questions = new LinkedList<>();
                                Question one = new Question("What do you wish while driving?", "Get there FAST",
                                        "Sleep", "Wish you had a furry friend");
                                Question two = new Question("How concious are you about the environment?", "Climate change is " +
                                        "a hoax", "I keep it in mind", "The world will end in 50 years");
                                Question three = new Question("How much do you trust?", "I have a skeptical side, but it fades", "" +
                                        "Always jump in", "Can't stop worrying");
                                Question four = new Question("Where would you go in time?", "3000 AD", "2100", "1500");
                                Question five = new Question("What do others think of you?", "brave", "smart",
                                        "charming");
                                questions.add(one);
                                questions.add(two);
                                questions.add(three);
                                questions.add(four);
                                questions.add(five);
                                Log.d("GGOOOPPP", "It has gotten to this part");
                                Log.d("GGOOOPPP", "The seecond question is "+ questions.get(2).getQuestion());
                                Fragment childFragment = new Fragment2(questions, 1);
                                FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
                                transaction.replace(R.id.your_placeholder2, childFragment).commit();
                                //Unable to create child fragment
                                // Begin the transaction


                        }
                });
                secondAnswer.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                                LinkedList<Question> questions = new LinkedList<>();
                                Question one = new Question("What do you like to watch?", "Ninja Warrior", "" +
                                        "American Idol", "Planet Earth");
                                Question two = new Question("Pick an activity:", "Soccer", "Dance", "Hiking");
                                Question three = new Question( "Who do you want to be?", "Elizabeth Warren", "Ariana Grande","" +
                                        "Larry Page");
                                Question four = new Question("What project task do you like the best?", "Organizing tasks", "Presentation"
                                        , "Research");
                                Question five = new Question("What is the worst insult?","Lazy", "Ugly", "Stupid");
                                questions.add(one);
                                questions.add(two);
                                questions.add(three);
                                questions.add(four);
                                questions.add(five);
                                Fragment childFragment = new Fragment2(questions, 2);
                                FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
                                transaction.replace(R.id.your_placeholder2, childFragment).commit();

                        }
                });
                thirdAnswer.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                                LinkedList<Question> questions = new LinkedList<>();
                                Question one = new Question("What do you think when you wake up?", "Why am I here?", "What " +
                                        "will I wear?", "What protests are going on today?");
                                Question two = new Question("What bugs you the most?", "Ghostly occurances", "Repulsive outfits", "" +
                                        "Being the odd one out");
                                Question three = new Question("You like Professors who", "Make you think hard", "Let your own " +
                                        "ideas flow", "Encourage you to stand up for yourself");
                                Question four = new Question("Why are you going to college?", "Question common sense", "" +
                                        "Decorate my bland life", " To change how people view me");
                                Question five = new Question("Why is he/she/they your best friend?", "Interesting", "" +
                                        "Artistic", "Bold");
                                questions.add(one);
                                questions.add(two);
                                questions.add(three);
                                questions.add(four);
                                questions.add(five);
                                Fragment childFragment = new Fragment2(questions, 3);
                                FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
                                transaction.replace(R.id.your_placeholder2, childFragment).commit();

                        }
                });
        }




        public void setAnswers(){
                firstAnswer = (Button) getView().findViewById(R.id.button6);
                secondAnswer = (Button) getView().findViewById(R.id.button5);
                thirdAnswer = (Button) getView().findViewById(R.id.button4);
                question = (TextView) getView().findViewById(R.id.textView2);

                question.setText("What game do you want to play?");
                firstAnswer.setText("What is your dream transportation?");
                secondAnswer.setText("How will you get famous?");
                thirdAnswer.setText("What is your dream major?");
        }

}