import java.util.Scanner;
public class cwh_79_errorsdemo {
    public static void main(String[] args) {
        //SYNTAX ERROR DEMO
        // int a = 0 //ERROR: no Semicolon
        // b = 8; //ERROR : not declared

       //LOGICAL ERROR DEMO
       // Write a program to write all the prime numbers between 1 to 10
        System.out.println(2);
        for(int a=1; a<5; a++){
            System.out.println(2*a+1);
        }

        //RUNTIME ERROR
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is "+ 1000/k);
    }
}