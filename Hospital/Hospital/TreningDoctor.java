package Hospital;

public class TreningDoctor extends Doctor {
    private float Salary=1500;
    private String DateBeginTraing = "";
    private String DateEndingTraing = "";
    Time t = new Time();
    public void setDateBeginTraing(String dateBeginTraing) {
        DateBeginTraing = dateBeginTraing;
    }

    public void setDateEndingTraing(String dateEndingTraing) {
        DateEndingTraing = dateEndingTraing;
    }

    public String getDateBeginTraing() {
        return DateBeginTraing;
    }

    public String getDateEndingTraing() {
        return DateEndingTraing;
    }

    int YearDefrent ;

    public float getFinalSalary() {
        YearDefrent= t.getNumFromString(getDateBeginTraing(), getDateEndingTraing());
        if (YearDefrent < 1) {
            Salary *= 0.5;
        } else if (YearDefrent < 2) {
            Salary *= 0.75;
        } else {
            Salary *= 1;
        }
        return Salary;
    }

    TreningDoctor(String Name, String Addreas, String Date, String JoinedDate,
            String DateEndingTraing) {
        super(Name, Addreas, Date, JoinedDate);
        setDateEndingTraing(DateEndingTraing);
    }

    public void printInfo() {
        super.getInfo();
        System.out.println("\n\t|" + setSpace("The Salary Is", 25) + ": " + getFinalSalary() + "\n\t|"
                + setSpace("The Date Of Beging", 25) + ": " + getDateBeginTraing() + "\n\t|"
                + setSpace("The Date Of End", 25) + ": " + getDateEndingTraing() + "\n\t|"
                + setSpace("How Many Years Have He Been Here", 25) + ": " + YearDefrent
                + "\n\t-----------------------------------------------------------------");
    }
}
