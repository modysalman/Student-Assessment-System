package com.company;

public class Main {

static void updatedegrees(quiz q){
    q.quiz+=10;
}
//we create object type without decalre refrence we have make the over ride
static void totalassessment(quiz s ){
    System.out.println(" total assessment : "+s.totalgrades(20,12,22,9));
}

    public static void main(String[] args) {
        student stud1 = new student("amrmontaser",21100804,70,80,90);
        stud1.average();
        student stud2 = new student("mohamed salman",21100807,72,82,92);
        stud2.average();
        student stud3 = new student("ahmed abdelazem",211,60,70,80);
        stud2.average();
        stud1.printCompleteInformation();
        stud1.cheakbestcourse();
        stud2.printCompleteInformation();
        stud2.cheakbestcourse();
        stud3.printCompleteInformation();
        stud3.cheakbestcourse();
        System.out.println("prob total grade out 100 :"+ stud1.probgrades(15,32,20));
        System.out.println("math total grade out 100 :"+ stud1.mathgrade(20,12,12));
        System.out.println("oop total grade out 100 :"+ stud1.oopgrades(15,32,20));
stud1.totalgrades(15,26,12);
stud2.printInfo();
stud3.printNeed();
quiz q=new quiz();
//passed object to method to update any degree
q.quiz=4;
updatedegrees(q);
System.out.println("quiz degree after update:  "+q.quiz);

        totalassessment(new quiz());
//polymorphism generic
        student [] s=new student[3];

        s[0]=new student();
        s[1]=new assessment();
        s[2]=new quiz();
        for (int i=0;i< s.length;i++){
            s[i].prints();
        }
    }

}