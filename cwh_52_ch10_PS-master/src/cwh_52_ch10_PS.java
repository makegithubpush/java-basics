class Circle{
    public int radius;
    Circle(){
        System.out.println("I am non param of constructor");
    }
    Circle(int r){
        System.out.println("I am circle perimeterised constructor");
        this.radius = r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r, int h){
        super(r);
        System.out.println("I am cylinder parameterised constructor");
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class cwh_52_ch10_PS {
    public static void main(String[] args) {
        Circle objc = new Circle(12);
        System.out.println(objc.area());
        Cylinder1 obj = new Cylinder1(12,4);
        System.out.println(obj.volume());
    }
}