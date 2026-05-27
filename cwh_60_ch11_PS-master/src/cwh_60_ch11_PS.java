abstract class Pen{
    abstract void write();
    abstract void refill();
}
class Fountainpen extends Pen{
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("Refill");
    }
    void ChangeNib(){
        System.out.println("Changing the Nib");
    }
}

interface Basicanimal{
    void eat();
    void sleep();
}
class Monkey{
    public void jump(){
        System.out.println("Monkey is Jumping");
    }
    public void bite(){
        System.out.println("Monkey bites her");
    }
}
class Human extends Monkey implements Basicanimal{
    public void speak(){
        System.out.println("Hello sir");
    }
    @Override
   public void eat(){
       System.out.println("Monkey Eats banana");
   }
   @Override
   public void sleep(){
       System.out.println("Monkey sleeps");
   }
}
public class cwh_60_ch11_PS {
    public static void main(String[] args) {
        //Question1,2
    //    Fountainpen pen = new Fountainpen();
    //    pen.ChangeNib();

        //Question3
        Human h = new Human();
        h.eat();
        h.bite();

        //Question5
        Monkey m1 = new Human();//Jiska reference diya hai usi ke methods run honge
        m1.jump();
        m1.bite();
    //  m1.speak();-->Cannot use speak method because the reference is monkey which does not
    //                have the speak method
        Basicanimal lavish = new Human();//Same here also (Polymorphism)
    //  lavish.speak(); Not Allowed
        lavish.eat();
        lavish.sleep();

    }
}