package com.company;


public class Fighter {
     String name;
     int damage;
     int health;
     double weight;
     int dodge;

    public Fighter(String name, int damage, int health, double weight, int dodge) {
        this.name = name;
        this.health = health;
        this.weight = weight;
        this.damage = damage;
        if (dodge>=0 && dodge<=100){
            this.dodge = dodge;
        }else{
            this.dodge=0;
        }
    }

    int hit(Fighter foe){
        System.out.println(this.name + " => "+foe.name+" 'e "+damage+" hasar vurdu");
        System.out.println("");
        if (foe.isDodge()){
            System.out.println(foe.name+" gelen hasarı blokladı!");
            System.out.println("-------------");
            return foe.health;
        }
        if (foe.health-damage<0){
            return 0;
        }
        return foe.health-this.damage;
    }

    boolean isDodge(){
        double randdomNumber = Math.random()*100;
        return randdomNumber<=this.dodge;
    }

}
