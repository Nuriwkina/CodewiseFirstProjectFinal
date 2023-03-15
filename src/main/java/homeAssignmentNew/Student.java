package homeAssignmentNew;

public class Student {
    String name;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    double grade;

    public Student(String name, int age, double grade){
        this.name = name;
        this.age = age;
        this.grade = grade;


    }
    public void setNewGrade(double newGrade){
        grade = newGrade;





    }
    public void displayStudentInfo(){
        System.out.println("Student name is: " + name);
        System.out.println("Student age is: " + age);
        System.out.println("Student grade is: " + grade);

    }



}
