package com.company;


public class Student {
    String name;
    String stuNo;
    Course c1;
    Course c2;
    Course c3;

    double avarage;
    boolean isPass;

    public Student(String name, String stuNo, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int note1, int note2, int note3){
        if (note1 >=0 && note1<=100){
            this.c2.note = note1;
        }
        if (note2>=0 && note2<=100){
            this.c3.note = note2;
        }
        if (note3>=0 && note3<=100){
            this.c1.note = note3;
        }

    }

    void prinNot(){
        System.out.println(c2.name+ " notu:"+c2.note);
        System.out.print(c2.name+" ortalaması:"+((this.c2.note*0.8)+(this.c2.verbalGrade*0.2)));
        System.out.println(c3.name+" notu:"+c3.note);
        System.out.println(c1.name+" notu:"+c1.note);
    }

    void isPass(){
        this.avarage = (((this.c2.note*0.8) +(this.c2.verbalGrade*0.2))+
                ((this.c3.note*0.7)+(this.c3.verbalGrade*0.3)+
                        ((this.c1.note*0.7)+(this.c1.verbalGrade*0.3))))/3;
        if (avarage>=55){
            System.out.println("Sınıfı geçtiniz");
        }else{
            System.out.println("Sınıfta kaldınız");
        }
    }

    void editVerbalGrade(int x,int y, int z){
        this.c1.verbalGrade = x;
        this.c2.verbalGrade=y;
        this.c3.verbalGrade=z;
    }
}
