package oop.encapsulation;

public class Programmer {
    private String name;
    private int age;
    private String[] programmingLanguages;
    private boolean isEmployed;
    private int yearsOfExperience;

    //===============SETTER & GETTER==================

    public String getName() {
        return name;    //---> getter method
    }

    public void setName(String name) {
        String reverse = " ";
        name = name.toLowerCase();

        for (int i = name.length()-1; i >= 0; i--){

            if (i == name.length()-1){
               reverse += (name.charAt(i) + "").toUpperCase();
            }
            reverse += name.charAt(i);
        }
        // Daniel => leinaA => Leinad
        this.name = reverse; //--> setter method


    }
    public int getAge(){
        return age;

    }
    public void setAge(int age){
        if (age >= 21) {
            this.age = age;

        }
    }
    public String [] getProgrammingLanguages(){
        return programmingLanguages;
    }
    public void setProgrammingLanguages(String [] programmingLanguages){
      // progmLang has Java, assign all lang, or leave is empty

        boolean hasJava = false;
      for(int i = 0; i < programmingLanguages.length; i++) {
          if (programmingLanguages[i].equalsIgnoreCase("java")) {
              this.programmingLanguages = programmingLanguages;
              break;
          } else {
              hasJava = false;
              if(!hasJava)
              System.out.println("Oh, no java = no club, sorry");
          }
      }
    }

    public void setEmployed(boolean employed) {
        this.isEmployed = employed;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}