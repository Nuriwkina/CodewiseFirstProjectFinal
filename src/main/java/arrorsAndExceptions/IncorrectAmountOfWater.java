package arrorsAndExceptions;

public class IncorrectAmountOfWater extends Exception{

    public IncorrectAmountOfWater(String message){
        super(message);

    }
    public IncorrectAmountOfWater(){
        super();
    }
    //=====> this is howe create your own exception!

}
