package classesAndObjects;

import javax.imageio.stream.ImageInputStream;

public class Student {


    String firstName;
    String lastName;

    byte age;

    String email;
    String major;

    short yearOfStudy;

    /*
    method is action, verb, functionality to do
     */

    public void reads() {

        System.out.println(firstName + " " + lastName + " is reading");
    }

       public void writes(){

        System.out.println(firstName + " " + " is writing");
        }

        public void visitsClass() {
            System.out.println(firstName + " " + lastName + " is visiting " + major);

            //fn ln is visiting major name
        }

         public boolean isHomeworkDone(){
                System.out.println(firstName + " " + lastName + " completed homework");
                return true;



            }






    }









