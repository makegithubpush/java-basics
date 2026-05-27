package com.company;

class C1{
    public int x = 5;
    protected int y = 45;
    int z = 6;              //No Modifier (Default Modifier)
    private int a = 78;  //so we can't called it as it is a private access modifier
                           //in same package
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
public class cwh_66_access_modifiers {
    public static void main(String[] args) {
       C1 c= new C1();
    //   c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
    //    System.out.println(c.a);

    }
}