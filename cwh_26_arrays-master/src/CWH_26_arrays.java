//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CWH_26_arrays {
    public static void main(String[] args) {
    /*    Classroom of 500 students - you have to store marks of these 500 students
        You have 2 options:
        1. Create 500 variables
        2.Use arrays (recommended)
     */
    //    There are three main to create an array in java :-

        int [] marks = new int[5];     //method 1 - declaration and memory allocation
    //    int [] marks;                   //method 2- declaration and then memory allocation
    //    marks = new int[5];
        //initialization
        marks[0] = 100;
        marks[1] = 60;
        marks[2] = 70;
        marks[3] = 90;
        marks[4] = 96;
        System.out.println(marks[4]);

        //method 3- declaration,memory allocation and initialization together.
    //    int [] marks = {98,45,79,99,88};
    //    System.out.println(marks[4]);
    }
}