package com.erik.jeight.apple;

public class PrintWeight implements PrettyPrinter {
        public String prettyPrint(Apple apple) {
            return Integer.toString(apple.getWeight());
        }
    }