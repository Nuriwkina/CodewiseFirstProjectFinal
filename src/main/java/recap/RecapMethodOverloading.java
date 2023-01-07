package recap;

public class RecapMethodOverloading {

    //body of the class

    /*
    class can have:
    - variables
    - method
    = constructors
    =blocks

    all logical operations can only be created inside the methods, not the class
     */

    String str = "hello";

    public RecapMethodOverloading() {
        if (str.equals("hello")) {
            System.out.println("Say hi");
        }
        String str2 = "hi";
    }
}
