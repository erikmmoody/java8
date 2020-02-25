package com.erik.jeight.apple;

import java.util.ArrayList;
import java.util.List;

import com.erik.jeight.apple.Apple.Color;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Apple aone = new Apple(Color.GREEN, 10);
        Apple atwo = new Apple(Color.RED, 20);
        Apple athree = new Apple(Color.GREEN, 40);

        List<Apple> appList = new ArrayList<>();
        appList.add(aone);
        appList.add(atwo);
        appList.add(athree);

        Apple.prettyPrintApple(appList, new PrettyPrinter() {
            public String prettyPrint(Apple apple) {
                return "I am a " + apple.getColor().toString() + " apple";
            }
        });
    }
}
