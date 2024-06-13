package com.company;

public class assessment extends student{
    protected double midterm;
    protected double assignment ;
    protected double Final;
    protected double project;
protected double totalgrades;
protected double bonus;

    assessment(double a,double m,double F,double p){
        this.project=p;
        this.assignment=a;
        this.Final=F;
        this.midterm=m;
    }
    public assessment() {
    }

  @Override
    public double getFinal() {
        return Final*bonus;
    }

    public double getAssignment() {
        return assignment;
    }
    public void prints(){
        System.out.println("congrats you have good grades ");
    }
}
