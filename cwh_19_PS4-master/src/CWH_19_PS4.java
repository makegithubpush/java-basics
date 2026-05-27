//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import java.util.Scanner;
public class CWH_19_PS4 {
    public static void main(String[] args) {
    //    Question 1
        int a = 10;
        if (a ==11){
            System.out.println("I am 11");
        }
        else{
            System.out.println("I am not 11");
        }

        //Question 2
    //    Scanner sc= new Scanner(System.in);
    //    System.out.println("Enter you marks in physics");
    //    float S1 = sc.nextFloat();
    //    System.out.println("Enter your marks in mathematics");
    //    float S2 = sc.nextFloat();
    //    System.out.println("Enter your marks in chemistry");
    //    float S3 = sc.nextFloat();
    //    float percentage = ((S1 + S2 + S3)/3.0f*100);
    //    if (percentage>=40 && S1>=33 && S2>=33 && S3>=33){
    //        System.out.println("Congratulations you have been promoted");
    //    }
    //    else{
    //        System.out.println("Sorry you have not ben promoted,Try again");
    //    }

        //Question 3
    //    Scanner sc =  new Scanner(System.in);
    //    System.out.println("Enter your income in lakhs per annum");
    //    float tax = 0;
    //    float income = sc.nextFloat();
    //    if (income<=2.5){
    //        tax = tax + 0;
    //    }
    //    else if(income>=2.5f && income <=5f){
    //        tax = tax + 0.05f * (income -2.5f);
    //    }
    //    else if (income>5f && income<=10.0f){
    //        tax = tax + 0.05f * (5.0f - 2.5f);
    //        tax = tax + 0.2f * (income - 5f);
    //    }
    //    else if (income>10.0f){
    //        tax = tax + 0.05f * (5.0f - 2.5f);
    //        tax = tax + 0.2f * (10.0f - 5f);
    //        tax = tax + 0.3f * (income - 10.0f);
    //    }
    //    System.out.println("The total tax paid by the employee is:" + tax);

        //Quesion 4
    //    System.out.println("Enter the integer");
    //    Scanner sc = new Scanner(System.in);
    //    int day = sc.nextInt();

    //    switch(day){
    //        case 1:
    //            System.out.println("The day is monday");
    //            break;
    //        case 2:
    //            System.out.println("The day is tuesday");
    //            break;
    //        case 3:
    //            System.out.println("The day is wednesday");
    //            break;
    //        case 4:
    //            System.out.println("The day is thursday");
    //            break;
    //        case 5:
    //            System.out.println("The day is Friday");
    //            break;
    //        case 6:
    //            System.out.println("The day is saturday");
    //            break;
    //        default:
    //            System.out.println("The day is sunday");
    //    }

        //Question 6
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the website");
        String website = sc.next();
        if (website.endsWith(".org")){
            System.out.println("This website is organisational website");
        }
        else if (website.endsWith(".com")){
            System.out.println("This website is commercial website");
        }
        else if (website.endsWith(".in")){
            System.out.println("This website is indian website");
        }






    }
}