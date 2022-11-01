package oop.inheritance;

public class Main {
    public static void main(String[] args) {


        System.out.println("No parameter");
        Box box1 = new Box(); //-1
        System.out.println(box1.l + " " + box1.h + " " + box1.w);

        //cube
        System.out.println("Cube");
        Box box2 = new Box(4);
        System.out.println(box2.l +" " + box2.h + " " + box2.w);

        //normal box
        System.out.println("Normal Box");
        Box box3 = new Box(12, 4, 2);
        System.out.println(box3.l +" " + box3.h + " " + box3.w);

        //parameters that are not defined erlier ERROR
//        System.out.println("Wromg Input");
//        Box box4 = new Box(3.4, 7.9);
//        System.out.println(box4.l +" " + box4.h + " " + box4.w);


        //passing another box
        System.out.println("Box under Box-");
        Box box4 = new Box(box3);
        System.out.println(box4.l +" " + box4.h + " " + box4.w);

        //EXTENDED CLASS

        System.out.println("Extended class - ");
        BoxWeight box5 = new BoxWeight();
        System.out.println(box5.weight +" " +  box5.h);

        BoxWeight box6 = new BoxWeight(2,3,4,8);
        System.out.println(box6.weight +" " +  box6.h);
    }




    BoxPrice box11 = new BoxPrice();

}
