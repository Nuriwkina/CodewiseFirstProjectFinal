package switchStatement;

public class TshirtSize {
    public static String getSize(int size) {
        switch (size) {

            case 0:
            case 1:
            case 2:
            case 3:
                return "Extra small";
            case 4:
            case 5:
            case 6:
                return "small";
            case 7:
            case 8:
            case 9:
                return "Medium";
            case 10:
            case 11:
            case 12:
            case 13:
                return "Large";
            default:
                return "Wrong size";
        }

        }
    }

