package org.example;



public class Main {
    public static void main(String[] args) {

        // Do you really have to declare what type of object that the Generics method is using?? Yes
        GenericsPlayGround<Integer> genericsPlayGround = new GenericsPlayGround<>();
        genericsPlayGround.demonstrateGenericsByPrintingOut(235);


        SetPlayGround setPlayGround = new SetPlayGround();
        setPlayGround.provedThatHashSetDoNotKeepObjectsInOrder();
        setPlayGround.doTheLinkedSetOfStringThing();


    }
}