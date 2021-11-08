package com.company;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int verbalGrade=0;

    public Course(Teacher teacher, String name, String code, String prefix) {
        this.teacher = teacher;
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
    }

    void printTeacher(){
        this.teacher.print();
    }

    void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
            System.out.println("Öğretmen başarı ile eklendi");
        }else{
            System.out.println("Öğretmen ve bölüm uyuşmuyor");
        }
    }
}
