package org.example;


import static org.example.ListPlayGround.doTheListJob;

public class Main {
    public static void main(String[] args) {

        // Do you really have to declare what type of object that the Generics method is using??
        GenericsPlayGround<Integer> genericsPlayGround = new GenericsPlayGround<>();
        genericsPlayGround.demonstrateGenericsByPrintingOut(235);


        doTheListJob();




    }
}