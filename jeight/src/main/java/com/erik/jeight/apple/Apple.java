package com.erik.jeight.apple;

import java.util.List;

public class Apple {

    public enum Color {
        RED, GREEN
    }

    private Color color;

    private int weight;

    public Apple(Color color, int weight) {
        this.color = color;
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }  

    public static void prettyPrintApple(List<Apple> inventory, PrettyPrinter printer) {
        for (Apple apple : inventory) {
            String output = printer.prettyPrint(apple);
            System.out.println(output);
        }
    }

}