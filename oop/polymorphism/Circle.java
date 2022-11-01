package oop.polymorphism;

public class Circle extends Shapes{
    @Override
    void area() {
        System.out.println("Area is 0.5 * pi * side * side ");
    }
}
