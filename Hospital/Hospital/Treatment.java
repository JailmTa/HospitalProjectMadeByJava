package Hospital;
public abstract class Treatment {
    private int NumOfTreatment=Counter;
    private String DateOfTreatment;
    private float CostOfTreatment;
    static int Counter=1;
    
    Treatment(){}

    Treatment(String DateOfTreatment,float CostOfTreatment){
        this.CostOfTreatment=CostOfTreatment;
        this.DateOfTreatment=DateOfTreatment;
        Counter++;
    }

    public float getCostOfTreatment() {
        return CostOfTreatment;
    }

    public String getDateOfTreatment() {
        return DateOfTreatment;
    }
    public int getNumOfTreatment() {
        return NumOfTreatment;
    }   
    @Override
    public String toString() {
        return "\n\t|"+setSpace("Num Of Trment",25)+": "+getNumOfTreatment()+"\n\t|"+setSpace("Date Of Terment",25)+": "+getDateOfTreatment()+"\n\t|"+setSpace("Cost",25)+": "+getCostOfTreatment();
    }

     public String setSpace(String n,int Spaces){
        for(int i=n.length();i<Spaces;i++){
            n+=" ";
        }
        return n;
    }
}
