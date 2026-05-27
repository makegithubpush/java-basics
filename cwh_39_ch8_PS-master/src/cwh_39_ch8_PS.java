class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

class CellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callfriend(){
        System.out.println("Calling Friend...");
    }
}

class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class Rectangle{
    int a;
    int b;
    public int area(){
        return a*b;
    }
    public int perimeter(){
        return 2*(a+b);
    }
}

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running from the enemy");
    }
    public void fire(){
        System.out.println("Firing on the enemy");
    }
}
public class cwh_39_ch8_PS {
    public static void main(String[] args) {
        //Question 1
    /*    Employee harry = new Employee();
        harry.setName("CodeWithHarry");
        harry.salary = 445;
        System.out.println(harry.getSalary());
        System.out.println(harry.getName());
     */
        //Question 2
    /*    CellPhone asus = new CellPhone();
        asus.vibrate();
        asus.ring();
        asus.callfriend();
     */
        //Question 3
    /*    square shape = new square();
        shape.side = 3;
        System.out.println(shape.area());
        System.out.println(shape.perimeter());
     */
        //Qusetion 4
    /*    Rectangle shape = new Rectangle();
        shape.a = 3;
        shape.b = 5;
        System.out.println(shape.area());
        System.out.println(shape.perimeter());
     */
        //Question 5
        Tommy game = new Tommy();
        game.fire();
        game.run();
        game.hit();
    }
}