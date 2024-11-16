package Hospital;

public class ProvenDoctor extends Doctor {
    private int NumOfSection;
    private float Salary;

    ProvenDoctor() {
    }

    ProvenDoctor(String Name, String Addreas, String Date,String JoinedDate ,int NumOfSection, float Salary) {
        
        super(Name, Addreas, Date,JoinedDate);
        this.NumOfSection = NumOfSection;
        this.Salary = Salary;
    }

    public float getSalary() {
        return Salary;
    }

    public int getNumOfSection() {
        return NumOfSection;
    }

    public void getInfo(){
        super.getInfo();
        System.out.println("\n\t|" + setSpace("The Number Of The Section",25)+": "+getNumOfSection()+"\n\t|" + setSpace("The Salary is",25)+": "+getSalary()+ "\n\t-----------------------------------------------------------------");
    }
}
