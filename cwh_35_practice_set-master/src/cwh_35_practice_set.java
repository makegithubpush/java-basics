//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class cwh_35_practice_set {
        static void multipication(int n){
            for(int i=0; i<=10; i++){
                System.out.format("%d X %d = %d\n",n, i, n*i);
            }
        }
        static void pattern1(int n){
            for(int i=0; i<n; i++){
                for(int j=0; j<i+1; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        // sum(n) = 1 + 2 + 3.... + n
        // sum(n) = 1 + 2 + 3.... + n-1 + n
        // sum(n) = sum(n-1) + n
        // sum(3) = 3 + sum(2)
        // sum(3) = 3 + 2 + sum(1)
        // sum(3) = 3 + 2 + 1
        static int sumRec(int n){
            //Base Condition
            if(n==1){
                return 1;
            }
            return n + sumRec(n-1);
        }

        static void pattern2(int n){
            for(int i=0; i<n; i++){
                for(int j=0; j<n-i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        static int fib(int n){
            if(n==1){
                return 0;
            }
            else if(n==2){
                return 1;
            }
            else{
                return fib(n-1) + fib(n-2);
            }
        }
        public static void main(String[] args) {
         //Question 1
        //    int n;
        //    multipication(n=7);

        //Question 2
            pattern1(4);

        //Question 3
        // int c = sumRec(3);
        //    System.out.println(c);

        //Question 4
        //    pattern2(4);
            
        //Question 5    
        // fibonacci series - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
            int result = fib(3);
            System.out.println(result);
        }
    }
