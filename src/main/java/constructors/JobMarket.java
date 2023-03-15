package constructors;

public class JobMarket {
    public static void main(String[] args) {
        Job nurse = new Job();
        Job programmer = new Job("programmer");


        nurse.jobType = "nurse";
        nurse.salary = 8500;
        nurse.isHighlyPaid = true;

        nurse.getPaid(nurse.salary);

        //===========================================

        Job policeOfficer = new Job("police", 4000, false);
        policeOfficer.takeVacation();

        }

    }

