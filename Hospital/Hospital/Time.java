package Hospital;
import java.util.Scanner;

public class Time {

    public boolean CulFromString(String Begin, String End, String DateUser) {
        Scanner ReaderBegin = new Scanner(Begin);
        Scanner ReaderEnd = new Scanner(End);
        Scanner ReaderDate = new Scanner(DateUser);
        ReaderBegin.useDelimiter("/");
        ReaderEnd.useDelimiter("/");
        ReaderDate.useDelimiter("/");
        
        int BY, BM, BD, EY, EM, ED, UY, UM, UD;

        BD = Integer.parseInt(ReaderBegin.next());
        BM = Integer.parseInt(ReaderBegin.next());
        BY = Integer.parseInt(ReaderBegin.next());

        ED = Integer.parseInt(ReaderEnd.next());
        EM = Integer.parseInt(ReaderEnd.next());
        EY = Integer.parseInt(ReaderEnd.next());

        UD = Integer.parseInt(ReaderDate.next());
        UM = Integer.parseInt(ReaderDate.next());
        UY = Integer.parseInt(ReaderDate.next());

        if (UY >= BY && UY <= EY) {
            if (EY == BY) {
                if (UM >= BM && UM <= EM) {
                    if (EM == BM) {
                        if (UD >= BD && UD <= ED) {
                            return true;
                        } else {
                            return false;
                        }
                    } else {
                        return true;
                    }
                } else {
                    return true;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public int getNumFromString(String Begin, String End) {

        Scanner ReaderrBegin = new Scanner(Begin);
        Scanner ReaderrEnd = new Scanner(End);

        ReaderrBegin.useDelimiter("/");
        ReaderrEnd.useDelimiter("/");

        int BY, BM, BD, EY, EM, ED;

        BD = Integer.parseInt(ReaderrBegin.next());
        BM = Integer.parseInt(ReaderrBegin.next());
        BY = Integer.parseInt(ReaderrBegin.next());

        ED = Integer.parseInt(ReaderrEnd.next());
        EM = Integer.parseInt(ReaderrEnd.next());
        EY = Integer.parseInt(ReaderrEnd.next());

        int defDayDate = ED - BD, defMonthDate = EM - BM, defYearDate = EY - BY;
        if (defDayDate < 0) {
            defDayDate += 31;
            defMonthDate -= 1;
        }
        if (defMonthDate < 0) {
            defMonthDate += 12;
            defYearDate -= 1;
        }
        return defYearDate;
    }
}
