package one;

public class ClassY extends ClassX{

    private static String var1;
    private static String var2;

    private void privateMethod() {

    }

    String defaultVar1;
    String defaultVar2;

    void defaultMethod() {

    }

    protected String protectedVar1;
    protected String protectedVar2;

    protected void protectedMethod() {
    }

    public static String str1;
    public static String str2;

    public void publicMethod() {

    }

    public static void main(String[] args) {
        System.out.println(new ClassX().defaultVar1);
        System.out.println(new ClassX().defaultVar2);
    }


}
