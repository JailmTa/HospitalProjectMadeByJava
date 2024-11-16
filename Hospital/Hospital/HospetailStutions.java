package Hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HospetailStutions {
    Scanner in = new Scanner(System.in);
    public String[] Section = { "Ambulance Section", "Eyes Section", "Thoracic Section", "General Surgery Section" };
    private String UserSectionEntered;
    public static List<InSidePatient> ListPersonIn = new ArrayList<>();
    public static List<OutSidePatient> ListPersonOut = new ArrayList<>();
    public static List<TreningDoctor> ListDoctorTreaning = new ArrayList<>();
    public static List<ProvenDoctor> ListDoctorAreDone = new ArrayList<>();
    public static List<ContractedDoctor> ListDoctorAreGrude = new ArrayList<>();
    public static List<Patient> Section1 = new ArrayList<>();
    public static List<Patient> Section2 = new ArrayList<>();
    public static List<Patient> Section3 = new ArrayList<>();
    public static List<Patient> Section4 = new ArrayList<>();

    HospetailStutions() {
    }

    static{
        InSidePatient DefaultInSidePationt=new InSidePatient("Hasan","Tartous", "9/7/2005","8/5/2024");
        ListPersonIn.add(DefaultInSidePationt);
        ProvenDoctor DefaultContractedDoctor=new ProvenDoctor("Jailm","Swdei","6/1/2006","5/5/2022",3,5000);
        ListDoctorAreDone.add(DefaultContractedDoctor);
    }
    public void setUserSectionEntered(String userSectionEntered) {
        UserSectionEntered = userSectionEntered;
    }

    public String getUserSectionEntered() {
        return UserSectionEntered;
    }

    public int setTypeOfSection() {
        boolean flag = false;
        int UserGroup;
        do {
            System.out.println(
                    "Section Menu :\n[1] => Ambulance Section\n[2] => Eyes Section\n[3] => Thoracic Section\n[4] => General Surgery Section");
            System.out.println("Pleas Enter Number [1] or [2] or [3] or [4]");
            UserGroup = in.nextInt();
            if (UserGroup == 1) {
                UserSectionEntered = Section[0];
                flag = true;
            } else if (UserGroup == 2) {
                UserSectionEntered = Section[1];
                flag = true;
            } else if (UserGroup == 3) {
                UserSectionEntered = Section[2];
                flag = true;
            } else if (UserGroup == 4) {
                UserSectionEntered = Section[3];
                flag = true;
            } else {
                System.out.println("Wrong Number Check From The List ");
            }
        } while (!flag);
        return UserGroup;
    }

    public void addSickPersonToHospetal(InSidePatient Person) {
        UserSectionEntered = Section[setTypeOfSection() - 1];
        ListPersonIn.add(Person);
        switch (UserSectionEntered) {
            case "Ambulance Section":
                Section1.add(Person);
                break;
            case "Eyes Section":
                Section2.add(Person);
                break;
            case "Thoracic Section":
                Section3.add(Person);
                break;
            case "General Surgery Section":
                Section4.add(Person);
                break;
            default:
                break;
        }
    }

    public void addSickPersonToHospetal(OutSidePatient Person) {
        ListPersonOut.add(Person);
        switch (UserSectionEntered) {
            case "Ambulance Section":
                Section1.add(Person);
                break;
            case "Eyes Section":
                Section2.add(Person);
                break;
            case "Thoracic Section":
                Section3.add(Person);
                break;
            case "General Surgery Section":
                Section4.add(Person);
                break;
            default:
                break;
        }
    }

    public void removeSickPersonFromoHospetal(InSidePatient Person) {
        ListPersonIn.remove(Person);
        switch (UserSectionEntered) {
            case "Ambulance Section":
                Section1.remove(Person);
                break;
            case "Eyes Section":
                Section2.remove(Person);
                break;
            case "Thoracic Section":
                Section3.remove(Person);
                break;
            case "General Surgery Section":
                Section4.remove(Person);
                break;
            default:
                break;
        }
    }

    public void removeSickPersonFromoHospetal(OutSidePatient Person) {
        ListPersonOut.remove(Person);
        switch (UserSectionEntered) {
            case "Ambulance Section":
                Section1.remove(Person);
                break;
            case "Eyes Section":
                Section2.remove(Person);
                break;
            case "Thoracic Section":
                Section3.remove(Person);
                break;
            case "General Surgery Section":
                Section4.remove(Person);
                break;
            default:
                break;
        }
    }

    public void grudtuted(InSidePatient Person) {
        ListPersonIn.remove(Person);
        switch (getUserSectionEntered()) {
            case "Ambulance Section":
                Section1.remove(Person);
                break;
            case "Eyes Section":
                Section2.remove(Person);
                break;
            case "Thoracic Section":
                Section3.remove(Person);
                break;
            case "General Surgery Section":
                Section4.remove(Person);
                break;
            default:
                break;
        }
    }

    public void getListPersonIn() {
        for (InSidePatient Person : ListPersonIn) {
            Person.getFullInfo();
        }
    }

    public void addDoctorToHospetil(TreningDoctor doctor) {
        ListDoctorTreaning.add(doctor);
    }

    public void addDoctorToHospetil(ProvenDoctor doctor) {
        ListDoctorAreDone.add(doctor);
    }

    public void deletDoctorFromHospetil(TreningDoctor doctor) {
        ListDoctorTreaning.remove(doctor);
    }

    public void deletDoctorFromHospetil(ProvenDoctor doctor) {
        ListDoctorAreDone.remove(doctor);
    }

    public void deletDoctorFromHospetil(ContractedDoctor doctor) {
        ListDoctorAreGrude.remove(doctor);
    }

    public void vericted(TreningDoctor doctor) {
        HospetailStutions h = new HospetailStutions();
        if (ListDoctorTreaning.contains(doctor)) {
            deletDoctorFromHospetil(doctor);
        }
        ProvenDoctor doctorIn = new ProvenDoctor(doctor.getNameOfDoctore(), doctor.getAddreasOfDoctore(),
                doctor.getBirthDateOfDoctor(), doctor.getJoinedDate(), h.setTypeOfSection(), 1500);
        addDoctorToHospetil(doctorIn);
    }

    public void addDoctorIsContracted(ContractedDoctor doctor) {
        ListDoctorAreGrude.add(doctor);
    }

    public void getNumOfDoctrIsContracted() {
        System.out.println("The Number Of Contracted Doctors At Hospital Sections Is : " + ListDoctorAreGrude.size());
    }

    public void getFullInformationAtBeroedForrDoctors(String Begin, String End) {
        Time t = new Time();
        int z = 0;
        if (!ListDoctorAreGrude.isEmpty()) {
            for (ContractedDoctor d : ListDoctorAreGrude) {
                String Date = d.getYearOfContracted();
                if (t.CulFromString(Begin, End, Date)) {
                    if (z == 0) {
                        System.out.println("For Contracted Doctore : ");
                        z++;
                    }
                    d.getInfo();
                }
            }
            z = 0;
        }
        if (!ListDoctorTreaning.isEmpty()) {
            for (TreningDoctor d : ListDoctorTreaning) {
                String Date = d.getDateBeginTraing();
                if (t.CulFromString(Begin, End, Date)) {
                    if (z == 0) {
                        System.out.println("Treaning Begin");
                        z++;
                    }
                    d.getInfo();
                }
            }
            z = 0;
        }
        if (!ListDoctorTreaning.isEmpty()) {
            for (TreningDoctor d : ListDoctorTreaning) {
                String Date = d.getDateEndingTraing();
                if (t.CulFromString(Begin, End, Date)) {
                    if (z == 0) {
                        System.out.println("Treaning End");
                        z++;
                    }
                    d.getInfo();
                }
            }
            z = 0;
        }
        if (!ListDoctorAreDone.isEmpty()) {
            for (ProvenDoctor d : ListDoctorAreDone) {
                String Date = d.getJoinedDate();
                if (t.CulFromString(Begin, End, Date)) {
                    if (z == 0) {
                        System.out.println("For Proven Doctore : ");
                        z++;
                    }
                    d.getInfo();
                }
            }
        }
        z = 0;
    }

    public void getFullInformationAtBeroedForrPisents(String Begin, String End) {
        Time t = new Time();
        int z = 0;
        if (!ListPersonIn.isEmpty()) {
            for (InSidePatient d : ListPersonIn) {
                String Date = d.getJoinedDate();
                if (t.CulFromString(Begin, End, Date)) {
                    if (z == 0) {
                        System.out.println("For InSide Patient Persone : ");
                        z++;
                    }
                    d.getFullInfo();
                }
            }
            z = 0;
        }
        if (!ListPersonOut.isEmpty()) {
            for (OutSidePatient d : ListPersonOut) {
                String Date = d.getBirthDateOfPerson();
                if (t.CulFromString(Begin, End, Date)) {
                    if (z == 0) {
                        System.out.println("For OutSide Patient Pesone : ");
                        z++;
                    }
                    d.printOut();
                }
            }
        }
        z = 0;
    }

    public void getNumberOfPatent(int section, String BeginDate, String EndDate) {
        Time t = new Time();
        System.out.print("The Number Of Person In Section " + Section[section - 1] + " At The Perode [" + BeginDate
                + "] --> [" + EndDate + "] = ");
        int Counter = 0;
        switch (section) {
            case 1:
                for (InSidePatient p : ListPersonIn) {
                    if (t.CulFromString(BeginDate, EndDate, p.getJoinedDate())) {
                        for (int i = 0; i < Section1.size(); i++) {
                            if (Section1.get(i).getNameOfPerson().equals(p.getNameOfPerson())) {
                                Counter++;
                            }
                        }
                    }
                }
                System.out.println(Counter);
                break;
            case 2:
                for (InSidePatient p : ListPersonIn) {
                    if (t.CulFromString(BeginDate, EndDate, p.getJoinedDate())) {
                        for (int i = 0; i < Section2.size(); i++) {
                            if (Section2.get(i).getNameOfPerson().equals(p.getNameOfPerson())) {
                                Counter++;
                            }
                        }
                    }
                }
                System.out.println(Counter);
                break;
            case 3:
                for (InSidePatient p : ListPersonIn) {
                    if (t.CulFromString(BeginDate, EndDate, p.getJoinedDate())) {
                        for (int i = 0; i < Section3.size(); i++) {
                            if (Section3.get(i).getNameOfPerson().equals(p.getNameOfPerson())) {
                                Counter++;
                            }
                        }
                    }
                }
                System.out.println(Counter);
                break;
            case 4:
                for (InSidePatient p : ListPersonIn) {
                    if (t.CulFromString(BeginDate, EndDate, p.getJoinedDate())) {
                        for (int i = 0; i < Section4.size(); i++) {
                            if (Section4.get(i).getNameOfPerson().equals(p.getNameOfPerson())) {
                                Counter++;
                            }
                        }
                    }
                }
                System.out.println(Counter);
                break;
            default:
                break;
        }
    }
}