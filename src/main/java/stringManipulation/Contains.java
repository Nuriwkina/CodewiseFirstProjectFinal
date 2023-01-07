package stringManipulation;

public class Contains {
    public static void main(String[] args) {
       /*
       contains () method comes from String class, and can only be used by btring
       is checks if one string contains
        */
       String slogan = "Chicago is a windy city" ;
       String city = "Chicago";

       boolean doesItContain = slogan.contains(city);
        System.out.println(doesItContain);

        doesItContain = slogan.contains("windy");
        System.out.println(doesItContain);

        doesItContain = slogan.contains("win");
        System.out.println(doesItContain);

        doesItContain = slogan.contains("s a");
        System.out.println(doesItContain);



        String company = "GOOGLe";
        String website = "google";

        boolean b = company.contains(website); //false
        System.out.println("boolean b: " + b);

        b = company.contains(website.toUpperCase());
        System.out.println(b); //GOOGLe === GOOOGLE ==> False

        b = company.toLowerCase().contains(website);
        System.out.println(b);

       // =========









    }
}
