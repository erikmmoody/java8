package com.erik.jeight.apple;

public class PrintColor implements PrettyPrinter {

        public String prettyPrint(Apple apple) {
            return apple.getColor().toString();
        }
    }