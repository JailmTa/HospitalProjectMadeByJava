package Hospital;
import java.util.ArrayList;
import java.util.List;

public class InSideTreatment extends Treatment{
    private int NumOfSuction;

    InSideTreatment(){}

    InSideTreatment(String DateOfTreatment,float CostOfTreatment,int NumOfSuction){
        super( DateOfTreatment, CostOfTreatment);
        this.NumOfSuction=NumOfSuction;
    }


    public int getNumOfSuction() {
        return NumOfSuction;
    }

    @Override
    public String getDateOfTreatment() {
        return super.getDateOfTreatment();
    }

    public String getInfo() {
        return super.toString()+"\n\t|"+setSpace("Number Of Section",25)+": "+getNumOfSuction()+"\n\t|";
    }
}
