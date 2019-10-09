package com.company;

public class Main {


            public static void main (String[]args){
            Run run1 = new Run(1, "zenit", 25);
            Run run2 = new Run(5, "spartak");
            System.out.println("numberOrRunners-" + run1.NumberOfRunners);
            System.out.println("Погода-" + run1.weather);
        }
    }
