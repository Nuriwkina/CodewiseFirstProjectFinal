package groceryStore;

public class  Buyer {

    String fullName;
    String phoneNumber;
    boolean isResident;
    int age;

    public void enterInfo(String name, int age1, boolean resident, String address1){

        fullName = name;
        age = age1;
        isResident = resident;
        phoneNumber = phoneNumber;
    }

    // display
    public void display() {
        // block of code belongs for display method
        System.out.println("Buyer's display");
        System.out.println("Full name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Resident: " + isResident);
        System.out.println("Phone number is: " + phoneNumber);


        // create a method that update the residency of the user
        // Pseudo code
        // list of instructions we want to follow when coding
        // updateResidency
        //

    }

    public void updateResidency(boolean newResidency){
        isResident =  newResidency;

    }
}
