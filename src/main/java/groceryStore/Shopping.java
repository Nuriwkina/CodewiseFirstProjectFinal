package groceryStore;

public class Shopping {
    public static void main(String[] args) {


        Buyer buyer = new Buyer();
        buyer.fullName = "Nuriia";
        buyer.age = 23;
        buyer.phoneNumber = "1234156";
        buyer.isResident = true;

        buyer.display();
        buyer.updateResidency(true);
        buyer.display();
        }
    }

