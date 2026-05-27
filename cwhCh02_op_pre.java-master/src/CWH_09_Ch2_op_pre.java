//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CWH_09_Ch2_op_pre {
    public static void main(String[] args) {
        // Precedence and Associativity
        //int a = 6*5-34/2;
        /*
        Highest Precedence goes to * & /.They are then evaluated on the basis of Left to
        Right Associativity.
           = 30-34/2
           = 30-17
           = 13
         System.out.println(a);
         */

        //    int b = 60/5-34*2;
        /*
            = 12-34*2
            = 12-68
            = -56
         */
    //    System.out.println(b);

        //Quick Quiz
    //    int x = 6;
    //    int y = 1;
    //    int k = x * y/2;
    //    System.out.println(k);

    //      int b = 1;
    //      int c = 4;
    //      int a = 5;
    //      int k = b*b - (4*a*c)/(2*a);  [parenthesis has highest precedence.So they will
    //                                     evaluate first]
    //    System.out.println(k);

        int v = 4;
        int u = 2;
        int k = v*v - u*u;
        System.out.println(k);





    }
}