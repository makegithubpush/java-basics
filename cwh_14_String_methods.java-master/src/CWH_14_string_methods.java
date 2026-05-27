
public class CWH_14_string_methods {
    public static void main(String[] args) {
        String name = "Harry";
        System.out.println(name);
        //1.
    //    int value = name.length();
    //    System.out.println(value);
        System.out.println(name.length());
        //2.
    //    String lstring = name.toLowerCase();
    //    System.out.println(lstring);
        System.out.println(name.toLowerCase());
        //3.
    //    String ustring = name.toUpperCase();
    //    System.out.println(ustring);
        System.out.println(name.toUpperCase());
        //4.
        String nontrimmedstring = "   Harry    ";
        System.out.println(nontrimmedstring);

    //    String trimmedstring = nontrimmedstring.trim();
    //    System.out.println(trimmedstring);
        System.out.println(nontrimmedstring.trim());
        //5.
        System.out.println(name.substring(4));
        //6.
    //    System.out.println(name.substring(0,3));
        //7.
        System.out.println(name.replace("r" , "p"));
    //    System.out.println(name.replace("r" , "ier"));
        //8.
    //    System.out.println(name.startsWith("Har"));
        //9.
    //    System.out.println(name.endsWith("dd"));
        //10.
    //    System.out.println(name.charAt(2));
        //11.
        System.out.println(name.indexOf("ry"));
        //12.
        String modifiedName = "Harryrryrry";
        System.out.println(modifiedName.indexOf("yrry"));
        System.out.println(modifiedName.indexOf("yrry" , 5));
        //13.
        System.out.println(modifiedName.lastIndexOf("rry"));
        //14.
        System.out.println(modifiedName.lastIndexOf("rry" , 7));
        //15.
        System.out.println(name.equals("Harry"));    //if "harry" then ans. is false
        //16.
        System.out.println(name.equalsIgnoreCase("haRRy"));











    }
}