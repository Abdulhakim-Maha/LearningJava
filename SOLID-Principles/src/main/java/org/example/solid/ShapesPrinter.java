package org.example.solid;

import java.util.List;

public class ShapesPrinter {

    private AreaCalculator areaCalculator = new AreaCalculator();
    public String json(List<Shape> shapes){
        return "{shapesSum: %s}".formatted(areaCalculator.sum(shapes));
    }

    public String csv(List<Shape> shapes){
        return "shapesSum,%s".formatted(areaCalculator.sum(shapes));
    }
}
