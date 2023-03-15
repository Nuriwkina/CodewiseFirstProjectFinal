package homeAssignmentNew;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private HashMap<String, String> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }


    public void addContact(String name, String phoneNumber) {
// 1. Create a method to add a new contact to the phonebook
        phoneBook.put(name, phoneNumber);
        System.out.println("adding new contact: " + name + " " + phoneNumber);
    }


    public void removeContact(String name) {
// 2. create a method to remove a contact from the phonebook
       phoneBook.remove(name);
        System.out.println("removing the contact: " + name);


    }


    public void updateContact(String name, String newPhoneNumber) {
// 3. create a method to update a contact's phone number
        phoneBook.replace(name, newPhoneNumber);
        System.out.println("updating  the contact: " + name + " " + newPhoneNumber);
    }

    public String searchContact(String name) {

// 4. Method to search for a contact's phone number

        for (Map.Entry<String, String> element : phoneBook.entrySet()) {
            if (element.getKey().equals(name)) {
                System.out.println("Searching contact: " + name);
                return element.getValue();
            }
        }return null;


    }


    public static void main(String[] args) {


        PhoneBook ph = new PhoneBook();
        ph.addContact("Jane","3126759873");
        ph.addContact("Oscar","4486759873");
        ph.addContact("Alex","3566759873");
        ph.addContact("Kate","8676759873");
        ph.addContact("Omar","4856759873");
        ph.addContact("Kai","7866759873");



        ph.removeContact("Jane");
        ph.removeContact("Kate");
        ph.removeContact("Omar");



        ph.updateContact("Jane", "5643762588");
        ph.updateContact("Alex", "12355765635");
        ph.updateContact("Oscar", "13265656566");


        System.out.println(ph.searchContact("Oscar"));
        System.out.println(ph.searchContact("Alex"));
        System.out.println(ph.searchContact("Kai"));



    }

}
