package org.example.solid;

public class Cube implements Shape, ThreeDimensionalShape{

    @Override
    public double area() {
        return 100;
    }

    @Override
    public double volume() {
        return 100*100;
    }
}
