package com.josephgaleprojects;

/*
Constructor Chaining:
Purpose:
1. YOu want many construction options
2. Some construction options have auto numbers built in

Definition:
1. Constructor chaining means that a constructor uses other constructors to build object
2. The first constructor uses the "this()" keyword which references the next constructor
3. Each subsequent constructor must be written as such:
    a. The constructor must accept the arguments from the previous "this()" statement
    b. if the subsequent constructor uses a "this()" to pass on, then that "this()" must contain the parameters in current constructor
        i. This must happen so the value gets passed to final constructor
 */
public class ConstructorChain {
    //add random member variables for chaining
    private int myNum;
    private String myString;
    private double myDouble;

    /* Constructor #1
        1. If someone instantiates an object without adding arguments, constructor #1 is called
        2. Constructor #1 will use "this()" to create the object, which passes the work to the next constructor
        3. However, myNum is set to 5 and this is passed to the next constructor
     */
    public ConstructorChain(){
        this(5);
    }

    /* Constructor #2
        1. must have a param to match this(5) from Constructor #1
        2. Constructor #2 can also be manually filled out in Main()
        3. the "this()" passes the process of object instantiation to constructor #3 with the arguments
     */
    public ConstructorChain(int myNum){
        this("yay", 30.0, myNum); //uses the next constructor down
    }

    /* Constructor #3
        1. must have a param to match this("yay", 30.0, myNum) from Constructor #2
        2. Constructor #3 can also be manually filled out in Main()
     */
    public ConstructorChain(String myString, double myDouble, int myNum){
        System.out.println("Something was created");

    }

    public int getMyNum() {
        return myNum;
    }

    public String getMyString() {
        return myString;
    }

    public double getMyDouble() {
        return myDouble;
    }
}
