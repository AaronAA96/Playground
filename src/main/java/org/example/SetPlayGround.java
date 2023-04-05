package org.example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetPlayGround {

    private Set<String> hashSetOfString = new HashSet<>();
    private Set<String> linkedSetOfString = new LinkedHashSet<>();

    public Set<String> getLinkedSetOfString() {
        return linkedSetOfString;
    }
    public void setHashSetOfString(Set<String> hashSetOfString) {
        this.hashSetOfString = hashSetOfString;
    }

    public Set<String> getHashSetOfString() {
        return hashSetOfString;
    }

    public void setLinkedSetOfString(Set<String> linkedSetOfString) {
        this.linkedSetOfString = linkedSetOfString;
    }

    public void provedThatHashSetDoNotKeepObjectsInOrder() {

       System.out.println("This is a hash Set Printed out.");

       hashSetOfString.add("hello");
       hashSetOfString.add("there");
       hashSetOfString.add("how");
       hashSetOfString.add("are");
       hashSetOfString.add("you");

       System.out.println(hashSetOfString);
       System.out.println("This should not be in order. And cannot add same objects to set. \n");
    }

    public void doTheLinkedSetOfStringThing() {

        System.out.println("This is a Linked Set Printed out.");
        linkedSetOfString.add("Here");
        linkedSetOfString.add("there");
        linkedSetOfString.add("how");
        linkedSetOfString.add("are");
        linkedSetOfString.add("you");

        System.out.println(linkedSetOfString);
        System.out.println("This should be in order. \n");
    }


}
