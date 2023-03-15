public class User {

    String email;
    String userName;
    String password;
    int age;
    double height;
    boolean isPrivate;

    public User(String userName, int age, double height, boolean isPrivate){
        this.userName = userName;
        this.age = age;
        this.height = height;
        this.isPrivate = isPrivate;

    }

    public User(String email, String password){
        this.email = email;
        this.password = password;
    }

    public User(String email, String userName, String password, int age, double height, boolean isPrivate){
        this(userName, age, height, isPrivate);
        this.password = password;
        this.email = email;
    }

    public User(String email, String userName, int age, String password, double height, boolean isPrivate){
        this(userName, age, height, isPrivate);
        this.password = password;
        this.email = email;
    }

    public User(boolean isPrivate, String userName, int age, String password, double height, String email){
        this(email, userName, age, password, height, isPrivate);
    }
    public User(String email){
        this.email = email;
    }






    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", isPrivate=" + isPrivate +
                '}';
    }

}
