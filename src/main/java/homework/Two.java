package homework;

public class Two {

    /**
     *
     *  Let's implement demerit point calculator in traffic
     *
     *      - if a driver speed is equal or smaller than speed limit,
     *      demerit point will be 0
     *
     *      - if a driver speed is greater than speed limit,
     *          demerit points will be calculated by this rule :
     *                 * demerit point will increase 1 point per 5 km
     *
     *      - speed limit is 65
     */

    public static int print(int speed) {
        int limit = 65;

        if (speed > limit) {
            return (speed-limit) / 5;
        } else {
            return 0;
        }

    }
}

