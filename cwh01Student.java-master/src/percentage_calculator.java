import java.util.Scanner;
public class percentage_calculator {
    public static void main(String[] args) {
        System.out.println("Taking Input From the User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Marks in English");
        float English = sc.nextFloat();
        System.out.println("Marks in Physics");
        float Physics = sc.nextFloat();
        System.out.println("Marks in Chemistry");
        float Chemistry = sc.nextFloat();
        System.out.println("Marks in Maths");
        float Maths = sc.nextFloat();
        System.out.println("Marks in Hindi");
        float Hindi = sc.nextFloat();
        float percentage = ((English + Physics + Chemistry + Maths + Hindi)/500.0f)*100;
        System.out.println("percentage got");
        System.out.println(percentage);

    }
}


