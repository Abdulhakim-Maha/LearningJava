package com.solid.lsp;


public class Main {

    private static final int width = 6;
    private static final int height = 7;

    public static void main(String[] args) {
        Shape reg1 = new Rectangle(width, height);
        System.out.println("==== Rectangle ====");
        System.out.println("Width = " + ((Rectangle)reg1).getWidth());
        System.out.println("Height = " + ((Rectangle)reg1).getHeight());
        System.out.println("Area = " + reg1.getArea());

        Shape reg2 = new Square(6);
        System.out.println("====   Square  ====");
        System.out.println("Side = "+((Square)reg2).getSide());
        System.out.println("Width = " + reg2.getArea());
//        System.out.println("Height = " + height);
//        System.out.println("Area = " + reg2.getArea());
    }
}
