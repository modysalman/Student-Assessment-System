package com.company;

public class quiz extends assessment {
    protected double quiz;

public quiz(){}
    public quiz(double a,double m,double F,double p,double quiz) {
        super(a, m, F, p);
        this.quiz = quiz;
    }
    public double getQuiz() {return quiz;}
    public void setQuiz(double quiz) {
        this.quiz = quiz;
    }

    public double totalgrades(double midterm,double Final,double project,double quiz){
        return midterm+Final+project+quiz;}

    @Override
    public double getAssignment() {
        return assignment+quiz;
    }
    public void prints(){
        System.out.println("congrats you have good mark ");
    }

}
