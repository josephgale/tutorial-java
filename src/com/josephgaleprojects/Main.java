package com.josephgaleprojects;

public class Main {

    public static void main(String[] args) {

        ConstructorChain myChain = new ConstructorChain(5);
        System.out.println(myChain.getMyNum());

        //testing a static method - with class and object
         //handy for quick methods that don't require instantiated objects
        ConstructorChain.staticMethod();
        myChain.staticMethod();

        //static variable - all instances have the same
        System.out.println(myChain.myStaticDouble);
    }
}
