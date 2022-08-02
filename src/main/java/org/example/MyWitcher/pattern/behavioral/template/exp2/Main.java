package org.example.MyWitcher.pattern.behavioral.template.exp2;

public class Main {
    public static void main(String[] args) {
        Network facebook = new Facebook("Max", "pass");
        facebook.post("message");

        System.out.println("");

        Network twitter = new Twitter("Max", "pass");
        twitter.post("message");
    }
}
