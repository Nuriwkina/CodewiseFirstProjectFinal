package homeAssignmentNew;

public class AccessModifiersHW {
    public String name = "John";
    public int age = 22;



    public void isDancing(){
        System.out.println(name + " is " + age);
    }
    public void  isPlaying(){
        System.out.println(name + " is playing");
    }



    private String fullName = "John Doe";
    private double height = 5.6;

    private void hasFullName(){
        System.out.println(fullName);
    }
    private void isHigh(){
        System.out.println(fullName + " and his height is " + height);
    }



    String name1 = "Jane";
    String hobby = "soccer";


    void hasName(){
        System.out.println(name1);

    }
    void hasHobby(){
        System.out.println(hobby);
    }



    protected String hair = "long";
    protected  String color = "blond";



    protected void hasHairLength(){
        System.out.println(hair);
    }
    protected void hasColor(){
        System.out.println(color);
    }


































}
