//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class cwh_34_recursion {
        // factorial 0 = 1
        // factorial(n) = n * n-1 *.....1
        // factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
        // factorial(n) = n * factorial(n-1)
        static int factorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            }
            else{
                return n * (n-1) * (n-2) * (n-3);
            }
        }
            public static void main(String[] args) {
            int x = 5;
                System.out.println("The value of factorial n is: " + factorial(x));
            }
        }


