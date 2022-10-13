package org.example;

import org.example.solid.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        Circle circle = new Circle(10);
        Square square = new Square(10);
        Rectangle rectangle = new Rectangle(70, 50);
        Cube cube = new Cube();
        ShapesPrinter shapesPrinter = new ShapesPrinter();
        Shape noShape = new NoShape();
        List<Shape> shapes = List.of(circle, square, cube, rectangle);
        int sum = areaCalculator.sum(shapes);
        System.out.println("sum = " + sum);

        // test Single Responsibility violation!!!
        System.out.println(shapesPrinter.json(sum));
        System.out.println(shapesPrinter.csv(sum));

    }

}