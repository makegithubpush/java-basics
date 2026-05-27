abstract class Parent2{
    public Parent2(){
        System.out.println("Mai Base2 KA Constructor hoon");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();

    abstract public void greet2();
}
class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
    @Override
    public void greet2(){
        System.out.println("Good afternoon");
    }
}
abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }
}
public class cwh_53_abstract {
    public static void main(String[] args) {
    //    Parent2 p = new Parent2();  //Not Allowed (abstract class ka object)
        Child2 c = new Child2();     //allowed as abstract class ke method ko implement
                                     //karne wali class hai yeh
    //    Child3 cc = new Child3(); //not Allowed as it's also a abstract class
        c.greet();
        c.greet2();
    }
}