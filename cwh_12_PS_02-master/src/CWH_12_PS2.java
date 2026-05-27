import java.util.Scanner;

public class CWH_12_PS2 {
    public static void main(String[] args) {
        // question 1
    //    float a = 7/4.0f * 9/2.0f;
    //    System.out.println(a);

        //question 2
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);
        //Decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);

        //question 3
      Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a>8);   //Comparison(>) operators return boolean value

        //question 4
    //    int v = 16;
    //    int u = 4;
    //    int a = 2;
    //    int S = 1;
    //    System.out.println((v*v - u*u)/(2*a*S));

        //question 5
        int b = 7*49/7 + 35/7;
        System.out.println(b);






    }
}