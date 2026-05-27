interface MyCamera{
    void takesnap();
    void recordvideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4KVideo() {
        greet();
        System.out.println("recording in 4K...la la la");
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
    void pickCall(){
        System.out.println("Connecting");
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
}
public class cwh_57_default_methods {
    public static void main(String[] args) {
MySmartPhone ms = new MySmartPhone();
ms.record4KVideo();
//ms.greet();  Throws an error as it's a private method
String[] ar = ms.getNetworks();
for(String item: ar){
    System.out.println(item);
}
    }
}