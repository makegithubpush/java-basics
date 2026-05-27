class Cylinder{
    int radius;
    int height;
    public int getRadius(){
        return radius;
    }
    public void setRadius(int r){
        radius = r;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int h){
        height = h;
    }
    public double surfacearea(){
        return 2* Math.PI* radius* radius + 2*Math.PI*radius*height;
    }
}
//Question 2`s Class
class Rectangle{
    private int length;
    private int breadth;
    public Rectangle(){
        length = 3;
        breadth = 4;
    }
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
}
public class cwh_44_ch9_PS {
    public static void main(String[] args) {
        //Question 1
        Cylinder indane = new Cylinder();
        indane.setRadius(3);
        indane.setHeight(6);
        System.out.println(indane.getHeight());
        System.out.println(indane.getRadius());
        System.out.println(indane.surfacearea());

        //Question 2
        Rectangle shape = new Rectangle();
        System.out.println(shape.getLength());
        System.out.println(shape.getBreadth());

    }
}