class MyMainEmployee {
    private int id;
    private String name;

    public MyMainEmployee(){
        id =45;
        name = "Harry Singh";
    }
    public MyMainEmployee(String myname, int myid ){
        name = myname;               //this.myname = myname;
        id = myid;                   //this.myid = myid;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }
}
public class cwh_42_constructors {
    public static void main(String[] args){
        MyMainEmployee harry = new MyMainEmployee("Harry Singh",6);
    //    harry.setName("Harry Singh");
    //    harry.setId(4);
        System.out.println(harry.getName());
        System.out.println(harry.getId());

    }
}