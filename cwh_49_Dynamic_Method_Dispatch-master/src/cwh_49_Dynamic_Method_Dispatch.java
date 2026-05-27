class Phone{
    public void showTime(){
        System.out.println("Time is 8am");
    }
    public void on(){
        System.out.println("Turning the phone");
    }
}
class SmartPhone extends Phone{
    public void music(){
        System.out.println("Playing Music...");
    }
    public void on(){
        System.out.println("Turning on the smartphone...");
    }
}
public class cwh_49_Dynamic_Method_Dispatch {
    public static void main(String[] args) {
    //    Phone obj = new Phone();    //Allowed
    //    SmartPhone Smobj = new SmartPhone();  //Allowed
    //    obj.showTime();

        Phone obj = new SmartPhone(); // Yes it is allowed
      //  SmartPhone obj2 = new Phone();  //Not ALLOWED (sub class ka refernce leke parent
                                          // class ko object nahi bna sakte hain)
        obj.on();
      //  obj.music(); //Not Allowed
        obj.showTime();
    }
}