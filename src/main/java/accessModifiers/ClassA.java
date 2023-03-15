package accessModifiers;

public class ClassA {
    /*
    private
    default
    protected
    public
     */
    String name = "John Doe";
   private int age = 32;

   private boolean isOld = false;

   void sayHi(){
       System.out.println("hi");
   }
    private void sayBye(){
        System.out.println("bye");
    }
    public String city = "Washington";
   protected void sayHello(){
       System.out.println("hello");
   }
    public static void main(String [] args){
       ClassA obj = new ClassA();
       obj.sayBye();
        System.out.println(obj.age);

    }
    //=====================================
    private void goodMorning(){
        System.out.println("morning");



   }

}
