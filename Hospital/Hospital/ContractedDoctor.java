package Hospital;

import java.util.ArrayList;
import java.util.List;

public class ContractedDoctor extends Doctor {
    private List<Float> ListOfTreatment = new ArrayList<>();
    private float Salary ;
    private String YearOfContracted;

    ContractedDoctor() {
    }

    ContractedDoctor(String Name, String Addreas, String Date, String JoinedDate, String YearOfContracted) {
        super(Name, Addreas, Date, JoinedDate);
        this.YearOfContracted = YearOfContracted;
    }

    public void AddTreatment(float Cost) {
        ListOfTreatment.add(Cost);
    }

    public float getSalary() {
        Salary=0;
        for (float i : ListOfTreatment) {
            Salary += (float)(i/2);
        }
        return Salary;
    }

    public void setYearOfContracted(String yearOfIntered) {
        YearOfContracted = yearOfIntered;
    }

    public String getYearOfContracted() {
        return YearOfContracted;
    }

    public void getInfo() {
        super.getInfo();
        System.out.println("\n\t|"+setSpace("The Salary For His Termennt",25)+": " + getSalary() + "\n\t|"+setSpace("The Year Of Contracted",25)+": " + getYearOfContracted()+"\n\t-----------------------------------------------------------------");
    }
    public String setSpace(String n,int Spaces){
        for(int i=n.length();i<Spaces;i++){
            n+=" ";
        }
        return n;
    }
}
