package accessModifiers;



public class ClassB {
    public static void main(String[] args) {
        ClassA obj = new ClassA();
        System.out.println(obj.name);

        obj.sayHi();
        //  obj.sayBye();

        obj.sayHello();
        System.out.println(obj.city);
    }


}
