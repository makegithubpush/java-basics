interface MyCamera{
    void takesnap();
    void recordvideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4KVideo() {
        greet();
        System.out.println("recording in 4K...");
    }
}
interface MyWifi{
    String[] getNetworks();
    void connectNetwork(String Network);
}
class MyCellphone{
    void callNumber(int phoneNumber){
        System.out.println("Calling"+phoneNumber);
    }
    void pickCall(String sonali){
        System.out.println("Connecting" + sonali);
    }
}
class MySmartPhone extends MyCellphone implements MyWifi, MyCamera {
    public void takesnap() {
        System.out.println("Taking snap");
    }

    public void recordvideo() {
        System.out.println("Taking snap");
    }
    //  public void record4KVideo(){
    //      System.out.println("Taking snap and recording in 4K");
    //  }

    public String[] getNetworks() {
        System.out.println("Getting list of networks");
        String[] networkList = {"Harry", "Prashant", "Anjali"};
        return networkList;
    }
    public void connectNetwork(String Network) {
        System.out.println("Connect to"+ Network);
    }
    public void sampleMeth(){
        System.out.println("meth");
    }
}
public class cwh_59_polymorphism {
    public static void main(String[] args) {
        MyCamera cam = new MySmartPhone();//This is a smartphone but use it as a camera
                                          //kyuki reference humne use kia hai MyCamera ka
    //    cam.getNetworks()-->Not Allowed
    //    cam.sampleMeth();-->Not Allowed
        cam.record4KVideo();
        cam.takesnap();

        MySmartPhone s = new MySmartPhone();
        s.sampleMeth();
        s.getNetworks();
        s.recordvideo();
        s.callNumber(4566);
        s.pickCall("sona");
    }
}