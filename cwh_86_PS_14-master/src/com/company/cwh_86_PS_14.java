package com.company;

import java.util.Scanner;
class MaxRetriesException extends Exception{
    public String toString(){
        return "Max retries reached Exception";
    }
    public String getMessage(){
        return "Max retries reached Exception";
    }

}
public class cwh_86_PS_14 {
    public static void main(String[] args) throws MaxRetriesException {
        //Practice 1
        //Syntax Error : int a = 7
        int age = 78; // Logical Error
        int year_born = 2000-78;
    //    System.out.println(6/0);

        //Practice 2
        try{
            int a = 666/0;
        }
        catch(IllegalArgumentException e){
            System.out.println("HeHe");
        }
        catch(ArithmeticException e){
            System.out.println("HaHa");
        }

        //Practice 3
        boolean flag = true;
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);

        int i = 0;
        while(flag && i<5){
            try{
                System.out.println("Enter the value of Index");
                int index = sc.nextInt();
                System.out.println("The value of marks index is " + marks[index]);
                break;
            }
            catch(Exception e){
                System.out.println("Invalid Index");
                i++;
            }

        }
        if(i>=5){
            System.out.println("Error");
            throw new MaxRetriesException();
        }
    }
}