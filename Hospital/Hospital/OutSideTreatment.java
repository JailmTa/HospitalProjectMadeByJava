package Hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OutSideTreatment extends Treatment {
    Scanner in = new Scanner(System.in);
    private int NumOfClince;
    private String NameOfDoctore;

    OutSideTreatment() {
    }

    OutSideTreatment(String DateOfTreatment, float CostOfTreatment, String NameOfDoctore) {
        super(DateOfTreatment, CostOfTreatment);
        Clinic c=new Clinic();
        this.NumOfClince=c.setTypeOfGroup();
        char w;
        for (ContractedDoctor doctor : HospetailStutions.ListDoctorAreGrude) {
            if ((doctor.getNameOfDoctore()).equals(NameOfDoctore)) {
                this.NameOfDoctore = NameOfDoctore;
                doctor.AddTreatment(CostOfTreatment);
            } else {
                System.out.println("This Doctore Hasn't At Hospital Do You Want To Add A New Intered Doctore (Y/N) ? ");
                w = in.next().charAt(0);
                if (w == 'Y' || w == 'y') {
                    System.out.println("Enter Your Addreass : ");
                    String New_DoctoreIntered_Addreass = in.nextLine();
                    System.out.println("Enter You Birth Date :");
                    String New_DoctoreIntered_BirthDate = in.next();
                    System.out.println("Enter Joined Date :");
                    String New_DoctoreIntered_JoinedDate = in.next();
                    System.out.println("Enter Your Intered Date :");
                    String New_DoctoreIntered_InteredDate = in.next();
                    doctor = new ContractedDoctor(NameOfDoctore, New_DoctoreIntered_Addreass,
                            New_DoctoreIntered_BirthDate, New_DoctoreIntered_JoinedDate,
                            New_DoctoreIntered_InteredDate);
                    doctor.AddTreatment(CostOfTreatment);
                    HospetailStutions h = new HospetailStutions();
                    h.addDoctorIsContracted(doctor);
                }
            }
        }
    }

    public String getNameOfDoctore() {
        return NameOfDoctore;
    }

    public int getNumOfClince() {
        return NumOfClince;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\t|" + setSpace("Name Of Doctore : ", 25) + ": " + getNameOfDoctore() + "\n\t|"
                + setSpace("Number Of Cilince : ", 25) + ": " + getNumOfClince()
                + "\n\t----------------------------------------------------------------";
    }
}
