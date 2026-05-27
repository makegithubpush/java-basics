//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CWH_24_break_and_continue {
    public static void main(String[] args) {
     // break and continue using loops!
        //BREAK LOOP

    /*    for(int i=0; i<5;i++){
        //    System.out.println(i);
        //    System.out.println("Java is great");
            if(i==2){
                System.out.println("ending the loop");
                break;
            }
            System.out.println(i);
            System.out.println("Java is great");
        }

     */

/*
         int i = 0;
        while(i<5){
            System.out.println(i);
            System.out.println("java is great");
            if (i == 2) {
                System.out.println("ending he loop");
                break;
            }
            i++;
        }

 */


//        int i=0;
//        do{
//            System.out.println(i);
//            System.out.println("java is great");
//            if(i==2){
//                System.out.println("loop ends here");
//                break;
//            }
//            i++;
//        }while(i<5);

        //CONTINUE LOOP
//        for(int i=0 ; i<50 ; i++){
//            if(i==2){
//                System.out.println("Ending the loop");
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("java is great");
//        }

//       int i=0;
//       do{
//           i++;
//           if(i==2){
//               System.out.println("Ending the loop");
//               continue;
//           }
//           System.out.println(i);
//           System.out.println("java is great");
//       }while(i<5);
//

        int i=0;
        while(i<5){
            i++;
            if(i==2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("java is great");
        }


    }
}