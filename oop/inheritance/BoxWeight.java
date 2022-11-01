package oop.inheritance;

public class BoxWeight extends Box {
    // box weight class that has all the properties of box class
    // feature :
    double weight;


    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double l, double w, double h, double weight){
        super(l,w,h);
        this.weight = weight;
    }

    //creating a constructor - same name as class
}
