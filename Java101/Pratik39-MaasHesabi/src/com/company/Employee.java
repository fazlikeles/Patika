package com.company;

public class Employee {
    String name;
    double salary;
    double workHours;
    int hireYear;

    public Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() { // vergi hesabı
        double tax = 0;
        if (this.salary >= 1000) {
            tax += this.salary * 0.03;
            return tax;
        } else {
            System.out.println("Maaş 1000 tlnin altında olduğu için herhangi bir vergi yoktur.");
            return 0;
        }
    }
    double bonus(){ // bonus hesabı
        double bonus=0;
        if (this.workHours>40){
            bonus+=(this.workHours-40)*30;
            return bonus;
        }else{
            System.out.println("Normal mesai ücreti.");
            return 0;
        }
    }

    double raiseSalary(){ // Zam miktarı hesaplama
        double newSalary=0;
        if (2021-this.hireYear<10){
            newSalary+=this.salary*0.05;
            return newSalary;
        }
        if (2021-this.hireYear>9 && 2021-this.hireYear<20){
            newSalary+=this.salary*0.10;
            return newSalary;
        }
        if (2021-this.hireYear>19 ){
            newSalary+=this.salary*0.15;
            return newSalary;
        }
        else{
            System.out.println("Hatalı çalışma yılı girdiniz !");
            return 0;
        }
    }
    void getInfo(){
        System.out.println("Adı:"+this.name);
        System.out.println("Maaşı:"+this.salary);
        System.out.println("Çalışma saati:"+this.workHours);
        System.out.println("Başlangıç yılı:"+this.hireYear);
        System.out.println("Vergi:"+this.tax());
        System.out.println("Bonus:"+this.bonus());
        System.out.println("Maaş Artışı:"+this.raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş:"+(salary-tax()+bonus()));
        System.out.println("Toplam maaş:"+(this.salary+raiseSalary()));
    }

}
