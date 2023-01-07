package constructors;

public class InstagramApp {

    public static void main(String[] args) {
        String name;
        InstagramUser user1  = new InstagramUser("James Bond", "jb2022", "JB2022!");
        user1.display();

        InstagramUser user2 = new InstagramUser("John Wick", "jw20", "Wick22", "I am an actor" );
        user2.display();


        InstagramUser user3 = new InstagramUser("Cristiano Ronaldo", "ronaldo", "CR7", "Football is life", "cr.com");
        user3.display();

        String name1 = "James";
        String title = "7 habit";

        title = name1;
        System.out.println(name1);
        System.out.println(title);

        // I want to print "7 habit"
        // we can NOT. We last it when we were reassigning the value for title
        // "7 habits" text has no reference anymore

        user1 = user3;
        user1.display();
        user2.display();
        user3.display();

        user2.postStory("I am coming back!");
        user2.postStory("Game is on today...");

        user3.visitProfile(user1);
        user3.visitProfile(user2);

        // JAMES bond want to make his profile private
        user1.isPrivate = true;
        System.out.println();

        user3.visitProfile(user1);
        user3.visitProfile(user2);




    }
}
