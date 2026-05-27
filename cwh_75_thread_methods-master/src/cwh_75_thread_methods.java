class MyNewThr1 extends Thread{

    public void run(){

        while(true){
            System.out.println("Thank You ");
            //        System.out.println("I am a thread");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class MyNewThr2 extends Thread{

    public void run(){
        int i = 34;
        //    System.out.println("Thank You " + this.getName());
        while(true){
            System.out.println("My Thank You ");
            //        System.out.println("I am a thread");
        }
    }
}
public class cwh_75_thread_methods {
    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr2 t2 = new MyNewThr2();
        t1.start();
    //    try{
    //        t1.join();
    //    }
    //    catch(Exception e){
    //        System.out.println(e);
    //    }
        t2.start();
    }
}