package Jun14.Enums;

public class Main {
//    public static final String FLAGS_ESTONIA = "ESTONIA";
//    public static final String FLAGS_FINLAND = "FINLAND";
//    public static final String FLAGS_RUSSIA = "RUSSIA";

    public static void main(String[] args) {

        String color = Flags.FINLAND.getColor();

        //for loop example to iterate through, also tell me if there are stars in the flag
        for (Flags flags : Flags.values()) {
            System.out.println(flags.getColor() + " ");
            System.out.println(flags.getHasStar());
        }




/*
        String desiredFlag ="ESTONIA";

        Flags flags = null;

        if (FLAGS_ESTONIA.equals(desiredFlag)) {
            System.out.println("Estonia");
        } else {
            System.out.println("Was not Estonia");
        }
*/
    }

/*    void checkTheFlag(Flags flags) {

        switch (flags) {
            case ESTONIA:
                System.out.println("Estonia");
                break;
            case RUSSIA: System.out.println("Russia");
        }
    }
*/

}
