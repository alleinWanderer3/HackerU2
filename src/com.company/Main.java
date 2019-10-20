package com.company;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;

public class Main {


            public static void main (String[]args){
            Run run1 = new Run(1, "zenit", 25);
            Run run2 = new Run(5, "spartak");
            System.out.println("numberOrRunners-" + run1.NumberOfRunners);
            System.out.println("Погода-" + run1.weather);

            House house1 = new House();
            house1.setColor("blue");
               house1.setHeight(12);

                House house2 = new House();
                house2.setColor("green");
house2.setHeight(52);
                System.out.println("Цвет-"+house1.getColor();
                "высота-"+ house2.getHeight())
        }
    }
