package accesModifiersNew;

import accessModifiers.ClassA;

public class ClassC extends ClassA {
    public static void main(String[] args) {
        ClassA obj = new ClassA();
      //  obj.name; don't work because name default
      //  obj.sayHi();

       ClassC objC = new ClassC();
        System.out.println( objC.city);
    }
}
