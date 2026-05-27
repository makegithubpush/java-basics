interface Bicycle{
    int a = 45;
    void applyBrake(int decrement); //Public add ker bhi sakte hain aur nahi bhi
    void speedUp(int increment);  //Same here also
}
interface HornBicycle{
    int a = 45;
    void blowHornk3g();
    void blowHornk2g();
}
class AvonCycle implements Bicycle, HornBicycle{
    void blowHorn(){
        System.out.println("PEE PEE");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUp");
    }
    public void blowHornk3g(){
        System.out.println("Kabhi kabhi khushi kabhi gum pee pee pee pee");
    }
    public void blowHornk2g(){
        System.out.println("Main hoon na poo poo poo");
    }


}
public class cwh_54_interfaces {
    public static void main(String[] args) {
        AvonCycle cycleHarry = new AvonCycle();
        cycleHarry.applyBrake(1);
        //You can create properties in interface
        //System.out.println(cycleHarry.a); //Allowed gives ans. 45
        //You cannot modify the properties in interface ad they are final
        //cycleHarry.a = 454; //not Allowed reason above
        //System.out.println(cycleHarry.a); //Thats why we can't print it
        cycleHarry.blowHornk3g();
        cycleHarry.blowHornk2g();
    }
}