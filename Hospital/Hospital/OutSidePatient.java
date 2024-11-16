package Hospital;

import java.util.ArrayList;
import java.util.List;

public class OutSidePatient extends Patient {
    private List<OutSideTreatment> ListOutSideTT = new ArrayList<>();
    private String AcceeptedDate;

    OutSidePatient() {
    }

    OutSidePatient(String NameOfPerson, String AddreasOfPerson, String DateOfPerson, String JoinedDate) {
        super(NameOfPerson, AddreasOfPerson, DateOfPerson, JoinedDate);
    }

    public String getAcceeptedDate() {
        return AcceeptedDate;
    }

    public void setAcceeptedDate(String acceeptedDate) {
        AcceeptedDate = acceeptedDate;
    }

    public void addIfAccepted(Doctor doctor) {
        System.out.println("Enter The Date Of Accepted :");
        String S_Date = in.next();
        setAcceeptedDate(S_Date);
        String Doctore_Name = doctor.getNameOfDoctore();
        HospetailStutions h = new HospetailStutions();
        Clinic c = new Clinic();
        System.out.println("Do You Want To Add The Petion To Hospetil(H/h) Or Cilent(C/c) ?");
        char z;
        int Clince_Num;
        do {
            z = in.next().charAt(0);
            if (z != 'H' || z != 'h' || z != 'C' || z != 'c') {
                System.out.print("Wrong Carachre Retray, ");
            }
        } while (z != 'H' || z != 'h' || z != 'C' || z != 'c');
        if (z == 'H' || z == 'h') {
            Clince_Num = h.setTypeOfSection();
            switch (Clince_Num) {
                case 1:
                    h.Section1.add(new InSidePatient(getNameOfPerson(), getAddreasOfPerson(), getBirthDateOfPerson(),
                            getJoinedDate()));
                    break;
                case 2:
                    h.Section2.add(new OutSidePatient(getNameOfPerson(), getAddreasOfPerson(),
                            getBirthDateOfPerson(), getJoinedDate()));
                    break;
                case 3:
                    h.Section3.add(new OutSidePatient(getNameOfPerson(), getAddreasOfPerson(),
                            getBirthDateOfPerson(), getJoinedDate()));
                    break;
                case 4:
                    h.Section4.add(new OutSidePatient(getNameOfPerson(), getAddreasOfPerson(),
                            getBirthDateOfPerson(), getJoinedDate()));
                    break;
                default:
                    break;
            }
        } else {
            Clince_Num = c.setTypeOfGroup();
            switch (Clince_Num) {
                case 1:
                    h.Section1.add(new InSidePatient(getNameOfPerson(), getAddreasOfPerson(), getBirthDateOfPerson(),
                            getJoinedDate()));
                    break;
                case 2:
                    h.Section2.add(new OutSidePatient(getNameOfPerson(), getAddreasOfPerson(),
                            getBirthDateOfPerson(), getJoinedDate()));
                    break;
                case 3:
                    h.Section3.add(new OutSidePatient(getNameOfPerson(), getAddreasOfPerson(),
                            getBirthDateOfPerson(), getJoinedDate()));
                    break;
                default:
                    break;
            }
        }
    }

    public void printOut() {
        System.out.println(super.toString());
        for (OutSideTreatment t : ListOutSideTT) {
            System.out.println(t);
        }
    }
}
