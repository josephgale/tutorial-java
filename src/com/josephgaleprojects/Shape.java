package com.josephgaleprojects;

//whenever we create a superclass/inheritance, we need to make sure super() params are satisfied
//**these super() params are satisfied through the input of the instance constructor
public class Shape {
    private int x;
    private int y;

    public Shape(int x, int y){
        //shape requires some arguments when created
        this.x=x;
        this.y=y;
    }
}

class Rectangle extends Shape{
   private int width;
   private int height;

   //1st constructor requires x and y values to satisfy super()
    //This is the shortcut option which makes use of long option at bottom
   public Rectangle(int x, int y){
       //assign values of 0,0 and pass to next constructor
       //the values from Rectangle(int x, int y) are passed to then(x,y)
      this(x,y,0,0); //this(x,y) values are then passed to next constructor
   }
   //2nd constructor - 1.) either manual or 2.) receives values from previous constructor through "this()"
   public Rectangle(int x, int y, int width, int height){
       //values from Rectangle() are then passed to super()
       super(x,y);
       //The values of (0,0) from previous constructor are assigned to width/height
       //OR the values manually entered in through the long manual method are assigned
       this.width = width;
       this.height = height;

   }
}
