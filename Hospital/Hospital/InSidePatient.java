package Hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.print.Doc;

public class InSidePatient extends Patient {
    Scanner in = new Scanner(System.in);
    public List<String> NameOfDoctpre=new ArrayList<>();
    public List<ProvenDoctor> DoctorProvenName = new ArrayList<>();
    public List<ContractedDoctor> DoctorContractedName = new ArrayList<>();
    public List<TreningDoctor> TreaningDoctorName = new ArrayList<>();
    private List<InSideTreatment> ListTrementInSide = new ArrayList<>();
    private List<OutSideTreatment> ListTermentOutSide = new ArrayList<>();
    private String DateOfGrudctet;

    public String getDateOfGrudctet() {
        return DateOfGrudctet;
    }

    public void setDateOfGrudctet() {
        System.out.println("Enter The Grudetuted Date:");
        String dateOfGrudctet = in.next();
        DateOfGrudctet = dateOfGrudctet;
    }

    InSidePatient() {
    }

    InSidePatient(String NameOfPerson, String AddreasOfPerson, String DateOfPerson, String JoinedDate) {
        super(NameOfPerson, AddreasOfPerson, DateOfPerson, JoinedDate);
    }

    public void addTretermentToPerson(ProvenDoctor doctor) {
        System.out.println("--------------------------------");
        System.out.println("Please Enter An Informations :");
        System.out.println("Enter The Date Of Treatment");
        String Date = in.next();
        System.out.println("Enter The Coust Of Treatment ");
        float Cost = in.nextFloat();
        InSideTreatment t = new InSideTreatment(Date, Cost, 0);
        NameOfDoctpre.add(doctor.getNameOfDoctore());
        DoctorProvenName.add(doctor);
        ListTrementInSide.add(t);
    }
    public void addTretermentToPerson(TreningDoctor doctor) {
        System.out.println("--------------------------------");
        System.out.println("Please Enter An Informations :");
        System.out.println("Enter The Date Of Treatment");
        String Date = in.next();
        System.out.println("Enter The Coust Of Treatment ");
        float Cost = in.nextFloat();
        InSideTreatment t = new InSideTreatment(Date, Cost, 0);
        NameOfDoctpre.add(doctor.getNameOfDoctore());
        TreaningDoctorName.add(doctor);
        ListTrementInSide.add(t);
    }

    public void addTretermentToPerson(ContractedDoctor doctor) {
        System.out.println("--------------------------------");
        System.out.println("Please Enter An Informations :");
        System.out.println("Enter The Date Of Treatment");
        String Date = in.next();
        System.out.println("Enter The Coust Of Treatment ");
        float Cost = in.nextFloat();
        InSideTreatment t = new InSideTreatment(Date, Cost, 0);
        NameOfDoctpre.add(doctor.getNameOfDoctore());
        DoctorContractedName.add(doctor);
        doctor.AddTreatment(Cost);
        ListTrementInSide.add(t);
    }


    public void getAllTerment(String Begin, String End) {
        Time t = new Time();
        int z = 0;
        if (!ListTrementInSide.isEmpty()) {
            System.out.println("\t--------------------{{ For InSid Terment }}---------------------");
            for (int i = 0; i < ListTrementInSide.size(); i++) {
                String Date = ListTrementInSide.get(i).getDateOfTreatment();
                    if (t.CulFromString(Begin, End, Date)) {
                        System.out.print("\t|The " + (i + 1) + " Tement Inside :)");
                        System.out.println((ListTrementInSide.get(i)).getInfo() + setSpace("Name Of Doctore", 25)
                                + ": " + (NameOfDoctpre.get(i))
                                + "\n\t----------------------------------------------------------------");
                    }
                z++;
            }
        }
        if (!ListTermentOutSide.isEmpty()) {
            System.out.println("\t--------------------{{ For OutSid Terment }}---------------------");
            for (int i = 0; i < ListTermentOutSide.size(); i++) {
                String Date = ListTermentOutSide.get(i).getDateOfTreatment();
                if (t.CulFromString(Begin, End, Date)) {
                    System.out.print("\t|The " + (i + 1) + " Tement Outside :)");
                    ListTermentOutSide.get(i);
                }
            }
        }
    }

    public void getAllTerment() {
        if (!ListTrementInSide.isEmpty()) {
            System.out.println("\t--------------------{{ For InSid Terment }}---------------------");
            for (int i = 0; i < ListTrementInSide.size(); i++) {
                System.out.print("\t|The " + (i + 1) + " Terment Inside :)");
                System.out.println((ListTrementInSide.get(i)).getInfo() + setSpace("Name Of First Doctore", 25)
                        + ": " + (NameOfDoctpre.get(i))
                        + "\n\t----------------------------------------------------------------");
            }
        }
        if (!ListTermentOutSide.isEmpty()) {
            System.out.println("\t--------------------{{ For OutSid Terment }}---------------------");
            System.out.println("\t|For OutSid Terment :)");
            for (int i = 0; i < ListTermentOutSide.size(); i++) {
                System.out.print("\t|The " + (i + 1) + " Terment Outside :)");
                ListTermentOutSide.get(i);
            }
        }
    }

    public void getFullInfo() {
        System.out.println(super.toString() + "\n\t|" + setSpace("Exit Date", 25) + ": " + getDateOfGrudctet()
                + "\n\t----------------------------------------------------------------");
        getAllTerment();
    }

    public String setSpace(String n, int Spaces) {
        for (int i = n.length(); i < Spaces; i++) {
            n += " ";
        }
        return n;
    }
}
