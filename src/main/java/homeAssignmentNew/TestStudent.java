package homeAssignmentNew;

public class TestStudent {
    public static void main(String[] args) {

        Student st = new Student("Jazzy", 18, 5.5);
     st.displayStudentInfo();

     double newGrade = 7.5;
     st.setGrade(newGrade);
     st.displayStudentInfo();
     
    }

}
