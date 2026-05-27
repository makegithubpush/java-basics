
public class SHK_Recursion{
    public static void printfabo(int a, int b , int n){
        if(n == 0){
            return;
        }
        int c = a + b;
        System.out.println(c);
        printfabo(b,c,n-1);
    }
 /*   public static int Calcfactorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        int fact_nm1 = Calcfactorial(n-1);
        int factorial_n = n * fact_nm1;
        return factorial_n;
    }
  */
/*    private static int sum;

    public static void printSum(int i, int n, int sum){
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i+1,n,sum);
    }
 */
    public static void main(String[] args) {
 //       printSum(1, 5, sum);

 //       int n = 5;
 //       int ans = Calcfactorial(n);
 //       System.out.println(ans);
        int a = 0, b =1;
        System.out.println(a);
        System.out.println(b);
        int n = 8;
        printfabo(a,b,n-2);
    }    
}