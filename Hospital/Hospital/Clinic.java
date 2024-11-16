package Hospital;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Clinic {
    Scanner in = new Scanner(System.in);
    private String[] Cilince = { "Outpatient Cilinc", "Eye Cilinc", "Digestive Cilinc" };
    private String UserCilencEntered;
    public static List<OutSidePatient> ListOfOutSidePerson=new ArrayList<>();
    public static List<TreningDoctor> ListDoctorTreaning = new ArrayList<>();
    public static List<ProvenDoctor> ListDoctorAreDone = new ArrayList<>();
    public static List<ContractedDoctor> ListDoctorAreGrude = new ArrayList<>();
    public static List<OutSidePatient> Cilince1=new ArrayList<>();
    public static List<OutSidePatient> Cilince2=new ArrayList<>();
    public static List<OutSidePatient> Cilince3=new ArrayList<>();

    public void setUserGroupEntered(String userGroupEntered) {
        UserCilencEntered = userGroupEntered;
    }

    public String getUserGroupEntered() {
        return UserCilencEntered;
    }

    public void getListPersonOut() {
        for (OutSidePatient Person : ListOfOutSidePerson) {
            Person.printOut();
        }
    }

    public void addDoctorToCilinic(TreningDoctor doctor) {
        ListDoctorTreaning.add(doctor);
    }

    public void addDoctorToCilinic(ProvenDoctor doctor) {
        ListDoctorAreDone.add(doctor);
    }

    public void deletDoctorFromCilinic(TreningDoctor doctor) {
        ListDoctorTreaning.remove(doctor);
    }

    public void deletDoctorFromCilinic(ProvenDoctor doctor) {
        ListDoctorAreDone.remove(doctor);
    }
    public void deletDoctorFromCilinic(ContractedDoctor doctor) {
        ListDoctorAreGrude.remove(doctor);
    }

    public void addDoctorIsContracted(ContractedDoctor doctor) {
        ListDoctorAreGrude.add(doctor);
    }

    public void getNumOfDoctrIsContracted() {
        System.out.println("The Number Of Contracted Doctors At Cilines Is : " + ListDoctorAreGrude.size());
    }


    public int setTypeOfGroup() {
        int UserGroup ;
        boolean flag = false;
        do {
            System.out.println("Clince Menu :\n[1] => Outpatient Cilinc\n[2] => Eye Cilinc\n[3] => Digestive Cilinc");
            System.out.println("Pleas Enter [1] or [2] or [3] ");
            UserGroup=in.nextInt();
            if (UserGroup == 1) {
                UserCilencEntered = Cilince[0];
                flag = true;
            } else if (UserGroup == 2) {
                UserCilencEntered = Cilince[1];
                flag = true;
            } else if (UserGroup == 3) {
                UserCilencEntered = Cilince[2];
                flag = true;
            } else {
                System.out.println("Wrong Number Check From The List ");
            }
        } while (!flag);
        return UserGroup;
    }

    public void addSickPersonToCilenc(OutSidePatient Person) {
        UserCilencEntered=Cilince[setTypeOfGroup()-1];
        ListOfOutSidePerson.add(Person);
        switch (UserCilencEntered) {
            case "Outpatient Cilinc":
                Cilince1.add(Person);
                break;
            case "Eye Cilinc":
                Cilince2.add(Person);
                break;
            case "Digestive Cilinc":
                Cilince3.add(Person);
                break;
            default:
                break;
        }
    }

    public void removeSickPersonFromoCilenc(OutSidePatient Person) {
        UserCilencEntered=Cilince[setTypeOfGroup()-1];
        ListOfOutSidePerson.remove(Person);
        switch (UserCilencEntered) {
            case "Outpatient Cilinc":
                Cilince1.remove(Person);
                break;
            case "Eye Cilinc":
                Cilince2.remove(Person);
                break;
            case "Digestive Cilinc":
                Cilince3.remove(Person);
                break;
            default:
                break;
        }
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
        if (!ListOfOutSidePerson.isEmpty()) {
            for (OutSidePatient d : ListOfOutSidePerson) {
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
        z=0;
    }

    public void getNumberOfPatent(int section) {
        System.out.print("The Number Of Person In Section " + Cilince[section-1] + " Is = ");
        switch (section) {
            case 1:
                System.out.println(Cilince1.size());
                break;
            case 2:
                System.out.println(Cilince2.size());
                break;
            case 3:
                System.out.println(Cilince3.size());
                break;
            default:
                break;
        }
    }
    public void grudtuted(OutSidePatient Person) {
        UserCilencEntered=Cilince[setTypeOfGroup()-1];
        ListOfOutSidePerson.remove(Person);
        switch (UserCilencEntered) {
            case "Outpatient Cilinc":
                Cilince1.remove(Person);
                break;
            case "Eye Cilinc":
                Cilince2.remove(Person);
                break;
            case "Digestive Cilinc":
                Cilince3.remove(Person);
                break;
            default:
                break;
        }
    }
}
