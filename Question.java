package com.example.finalproject;

public class Question {

    private String question;
    private String answer1;
    private String answer2;
    private String answer3;
    public Question(String question, String answer1, String answer2, String answer3){
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;

    }


    public String getQuestion(){
        return this.question;
    }

    public String getAnswer1(){
        return this.answer1;
    }


    public String getAnswer2(){
        return this.answer2;
    }

    public String getAnswer3(){
        return this.answer3;
    }

}
