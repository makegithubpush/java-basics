class MyEmployee{
     private int id;
     private String name;

     public String getName(){
         return name;
     }
     public void setName(String n){
         name = n;
     }
     public void setId(int i){
         id = i;
     }
     public int getId(){
         return id;
     }
}
public class cwh_40_ch9 {
    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();
    //    harry.id = 45;
    //    harry.name = "CodeWithHarry";  --> throws an Error due to Private access modifier
        harry.setName("CodeWithHarry" );
        System.out.println(harry.getName());
        harry.setId(3);
        System.out.println(harry.getId());

    }
}