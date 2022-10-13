package org.example.solid;

import java.util.List;

public class AreaCalculator {

    public int sum(List<Shape> shapes){
        int sum = 0;
        for ( int i = 0; i < shapes.size(); i++){
            sum += shapes.get(i).area();

//            if (shape instanceof  Square){
//            }
//
//            if (shape instanceof  Circle){
//            }
//
//            // Open Closed Violation
//            if (shape instanceof  Cube){
//            }
        }

        return  sum;
    }

    // Single Responsibility Violation!!
    // because we add one more method. so this method should have own class
//    public String json(List<Object> shapes){
//        return "{sum: %s}".formatted(sum(shapes));
//    }
//
//    public String csv(List<Object> shapes){
//        return "sum,%s".formatted(sum(shapes));
//    }

}
