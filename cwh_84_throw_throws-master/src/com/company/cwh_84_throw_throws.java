package com.company;
class NegativeRadiusException extends Exception{
    @Override
    public String toString(){
        return "Radius cannot be Negative";
    }
    @Override
    public String getMessage(){
        return "Radius cannot be negative";
    }
}



public class cwh_84_throw_throws {
    public static double area(int r) throws NegativeRadiusException{
    if(r<0){
        throw new NegativeRadiusException();
    }
        double a = Math.PI * r * r;
        return a;
    }

    public static int divide(int a, int b) throws ArithmeticException{
        //Made by Harry
        int c = a/b;
        return c;
    }

    public static void main(String[] args) {
       //Shivam- uses divide function created by Harry
        try {
        //  int c = divide(6, 0);
        //    System.out.println(c);
            double a= area(-2);
            System.out.println(a);
        }
         catch (Exception e) {
            System.out.println("Exception");
        }



    }
}