package oop.inheritance;

public class Box {
    //declaring variables
    double l;
    double h;
    double w;

    //constructor
    Box() {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    //if i want to create a cube  ie make that box a cube , all the sides will be equal
    Box(double side){      // one parameter because all the sides are same.
        this.w = side;
        this.l = side;
        this.h = side;
    }

    //normal box with three arguments
    Box(double l , double w, double h){
        this.l = l;
        this.w = w;
        this.h = h;
    }

    // box using another box as a parameter
    Box(Box oldBox){
        this.l = oldBox.l;
        this.w = oldBox.w;
        this.h = oldBox.h;
    }

    //function
    public void information(){
        System.out.println("Running the box");
    }


}
