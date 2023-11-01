package com.oops;

abstract class Galimc
{

  abstract void display();
   
}
class Galibc extends Galimc
{
    public void display()
    {
        System.out.println("MC");
    }
   
}
public class Galibsdk extends Galimc
{
   public void display()
    {
        System.out.println("BC");
       
    }
    public static void main(String []mhj){
    Galibsdk mc=new Galibsdk();
    mc.display();
    Galibc bc=new Galibc();
    bc.display();
}
}

