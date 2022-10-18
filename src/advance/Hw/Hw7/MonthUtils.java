package advance.Hw.Hw7;

public class MonthUtils {

    private static Month[] MOUTH_ARRAY = {
            new Month("jan", 31, 7 ), new Month("feb", 28, 9 ),
            new Month("mar", 31, 5 ), new Month("apr", 31, 7 ),
            new Month("may", 31, 5 ), new Month("jun", 30, 3 ),
            new Month("jul", 31, 5 ), new Month("aug", 31, 8 ),
            new Month("sep", 30, 5 ), new Month("oct", 31, 12 ),
            new Month("nov", 30, 5 ), new Month("dec", 31, 11 )
    };

    public static Month[] getMouthArray() {
        return MOUTH_ARRAY;
    }






}
