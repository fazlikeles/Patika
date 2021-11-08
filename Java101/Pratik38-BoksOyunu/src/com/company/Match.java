package com.company;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    int sira;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight, int sira) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.sira = sira;
    }

    boolean isCheck() {
        if ((this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight)) {
            return true;
        } else {
            return false;
        }
    }

    void run() {
        if (isCheck()) {
            if (sira == 0) {
                while (this.f1.health > 0 && this.f2.health > 0) {
                    System.out.println("========== Yeni Round ============");
                    this.f2.health = f1.hit(this.f2);
                    if (isWin()){
                        break;
                    }
                    this.f1.health = f2.hit(this.f1);
                    if (isWin()){
                        break;
                    }
                }
            }
            if (sira == 1) {
                while (this.f1.health > 0 && this.f2.health > 0) {
                    System.out.println("========== Yeni Round ============");
                    this.f1.health = f2.hit(this.f1);
                    if (isWin()){
                        break;
                    }
                    this.f2.health = f1.hit(this.f2);
                    if (isWin()){
                        break;
                    }
                }

            } else {
                if (this.f1.weight < minWeight) {
                    System.out.println(this.f1.name + " Boksorünün " + (this.minWeight - this.f1.weight) + " kg eksiği var maç yapılamaz !");
                } else if (this.f1.weight > maxWeight) {
                    System.out.println(this.f1.name + " Boksorünün " + (this.f1.weight - this.maxWeight) + " kg fazlası var maç yapılamaz !");
                } else if (this.f2.weight > maxWeight) {
                    System.out.println(this.f2.name + " Boksorünün " + (this.f2.weight - this.maxWeight) + " kg fazlası var maç yapılamaz !");
                } else if (this.f2.weight > maxWeight) {
                    System.out.println(this.f2.name + " Boksorünün " + (this.f2.weight - this.maxWeight) + " kg fazlası var maç yapılamaz !");
                }
            }
        }
    }

    boolean isWin(){
        if (this.f2.health<=0){
            System.out.println(f1.name+" Kazandı!");
            return true;
        }
        if (this.f1.health<=0){
            System.out.println(f2.name+" Kazandı !");
            return true;
        }else{
            return false;
        }
    }
}