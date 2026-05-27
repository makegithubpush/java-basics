package com.company;

import java.util.Scanner;
class MyException extends Exception{
    @Override
    public String toString() {
        return "I am toString()";
    }
    @Override
    public String getMessage(){
        return "I am getMessage()";
    }

    class MaxAgeException extends Exception{
        @Override
        public String toString() {
            return "Age Cannot be greater than 125";
        }

        @Override
        public String getMessage(){
            return "Make sure that the value of age entered is correct";
        }

    }
public class cwh_83_Exception_class {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a < 9) {
            try {
                //        throw new MyException();
                throw new ArithmeticException("This is an exception");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);  // print "I am toString()"
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yet Finished");
        }
    }
}}