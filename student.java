package com.company;

public class student {
    protected double midterm;
    protected double assssment1;
    protected double Final;
    protected double project;
    private String name;
    private int id;
    static int count=21100800;
    protected double mathgrade;
protected double oopgrade;
    protected double probgrade;


    student(String name,int id,double mathgrade , double oopgrade,double probgrade){
        this.probgrade=probgrade;
        this.oopgrade=oopgrade;
        this.name=name;
        this.id=count;
        this.mathgrade=mathgrade;
        count+=10;
    }

    public student() {
    }

    public void printInfo() {
        System.out.println("Math = " + mathgrade);
        System.out.println("oop = " + oopgrade);
        System.out.println("prob. = " + probgrade);
        System.out.println( "Average = " + average());
    }
    public double average () {
        return ((mathgrade + oopgrade + probgrade) / 3);
    }
    public void printCompleteInformation() {
        System.out.println("Name = " + name);
        System.out.println("ID = " + id);
        System.out.println("Math = " + mathgrade);
        System.out.println("oop = " + oopgrade);
        System.out.println("prob = " + probgrade);
        System.out.println( "Average = " + average());
    }
    public void printNeed () {
        System.out.println("Name = " + name);
        System.out.println( "Average = " + average());
    }

        public void cheakbestcourse() {
            if (mathgrade > oopgrade || mathgrade > probgrade) {
                System.out.println("best course is " + mathgrade);

            } else if (mathgrade < probgrade || probgrade > oopgrade) {
                System.out.println("best course is " + probgrade);
            } else if (oopgrade > mathgrade) {
                System.out.println("best course is " + oopgrade);

            } else if (oopgrade > probgrade || oopgrade > mathgrade) {
                System.out.println("best course is " + oopgrade);


            }


        }

    public double getMathgrade() {
        return mathgrade;
    }

    public void setMathgrade(double mathgrade) {
        this.mathgrade = mathgrade;
    }

    public double getProbgrade() {
        return probgrade;
    }

    public void setProbgrade(double probgrade) {
        this.probgrade = probgrade;
    }

    public double getOopgrade() {
        return oopgrade;
    }

    public void setOopgrade(double oopgrade) {
        this.oopgrade = oopgrade;
    }
    public double probgrades(double mid,double fi , double pro) {
        this.probgrade=mid+fi+pro;
        this.midterm = mid;
        this.Final = fi;
        this.project = pro;
        return probgrade;
    }

    public double oopgrades(double mid, double fi , double pro) {
        this.oopgrade=mid+fi+pro;this.midterm = mid;
        this.Final = fi;
        this.project = pro;

        return oopgrade;
    }
    public double mathgrade(double mid,double fi , double pro){

        this.midterm=mid;
        this.Final=fi;
        this.project=pro;
        this.mathgrade=mid+fi+pro;
        return mathgrade;
    }
    //overloading
    public  double totalgrades(double midterm){
        return  midterm;
    }

    public  double totalgrades(double midterm,double Final){
        return midterm+Final;
    }
    public double totalgrades(double midterm,double Final,double project) {
        return midterm + Final + project;
    }
    public double getFinal() {
        return Final;
    }
    public void prints(){
        System.out.println("congrats you have pass this semster ");
    }
}
