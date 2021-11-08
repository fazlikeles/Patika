package com.company;

public class Main {

    public static void main(String[] args) {
        Teacher t1 = new Teacher("Didem Aydın","05523621811","FZK");
        Teacher t2 = new Teacher("Mehmet Salih Tellioğlu","5523621111","KMY");
        Teacher t3 = new Teacher("Evrim Keser","5523621321","MAT");

        Course fizik = new Course(t1,"FİZİK","101","FZK");
        Course matematik = new Course(t3,"MATEMATİK","102","MAT");
        Course kimya = new Course(t2,"KİMYA","103","KMY");
        Student s1 = new Student("Fazlı Keleş","62",matematik,fizik,kimya);
        s1.addBulkExamNote(54,54,54);
        s1.editVerbalGrade(90,90,90);
        s1.prinNot();
        s1.isPass();

    }
}
