package Hospital;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MenuMain();
    }

    public static void ConvertDoctor() {
        System.out.println("\t=====================================================================");
        System.out.println("\t                      Convert Doctor Screen                    ");
        System.out.println("\t=====================================================================");
        Scanner in = new Scanner(System.in);
        HospetailStutions h = new HospetailStutions();
        int i = 0;
        System.out.println("This Is All Treaning Doctor That Have More Thin Two Years Treaining ");
        for (TreningDoctor t : h.ListDoctorTreaning) {
            if (t.YearDefrent >= 2) {
                t.getInfo();
            }
        }
        System.out.println("Enter The Number Of The Doctore ");
        h.vericted(h.ListDoctorTreaning.get(i));
        System.out.println("\t================================================================");
        System.out.println("Enter Any Key To Move To Main Menu ....");
        char c = in.next().charAt(0);
        MenuMain();
    }

    public static void GetNumbrOfPationtAtBerod() {
        System.out.println("\t=====================================================================");
        System.out.println("\t           Get NUmber Of Pationt At Section Screen             ");
        System.out.println("\t=====================================================================");
        Scanner in = new Scanner(System.in);
        HospetailStutions h = new HospetailStutions();
        System.out.println("Enter The Begin Serch Date Like This Staile dd/mm/yyyy");
        String Begin_Serch = in.next();
        System.out.println("Enter The End Serch Date Like This Staile dd/mm/yyyy");
        String End_Serch = in.next();
        h.getNumberOfPatent(0, Begin_Serch, End_Serch);
        System.out.println("\t================================================================");
        System.out.println("Enter Any Key To Move To Main Menu ....");
        char c = in.next().charAt(0);
        MenuMain();
    }

    public static void removDoctoreToHospetal() {
        System.out.println("\t=====================================================================");
        System.out.println("\t               Remove Doctor From Hospital Screen              ");
        System.out.println("\t=====================================================================");
        Scanner in = new Scanner(System.in);
        HospetailStutions h = new HospetailStutions();
        int Num;
        do {
            System.out.println(
                    "Select The Type Of Doctore \n[1] Proven Doctor \n[2] Treaining Doctor \n[3] Contracted Doctor");
            Num = in.nextInt();
        } while (Num < 1 || Num > 3);
        int i = 1;
        switch (Num) {
            case 1:
                if (!h.ListDoctorAreDone.isEmpty()) {
                    System.out.println("For Proven Doctors :");
                    for (ProvenDoctor p : h.ListDoctorAreDone) {
                        System.out.println("The Number " + i + " For Doctore :" + p.getNameOfDoctore());
                    }
                    System.out.println("Enter The Number OF Doctore :");
                    int m = in.nextInt();
                    h.deletDoctorFromHospetil(h.ListDoctorAreDone.get(m - 1));
                }
                break;
            case 2:
                if (!h.ListDoctorTreaning.isEmpty()) {
                    System.out.println("For Treaining Doctors :");
                    for (TreningDoctor p : h.ListDoctorTreaning) {
                        System.out.println("The Number " + i + " For Doctore :" + p.getNameOfDoctore());
                    }
                    System.out.println("Enter The Number OF Doctore :");
                    int m = in.nextInt();
                    h.deletDoctorFromHospetil(h.ListDoctorTreaning.get(m - 1));
                }
                break;
            case 3:
                if (!h.ListDoctorAreGrude.isEmpty()) {
                    System.out.println("For Contracted Doctors :");
                    for (ContractedDoctor p : h.ListDoctorAreGrude) {
                        System.out.println("The Number " + i + " For Doctore :" + p.getNameOfDoctore());
                    }
                    System.out.println("Enter The Number OF Doctore :");
                    int m = in.nextInt();
                    h.deletDoctorFromHospetil(h.ListDoctorAreGrude.get(m - 1));
                }
                break;
            default:
                break;
        }
        System.out.println("\t================================================================");
        System.out.println("Enter Any Key To Move To Main Menu ....");
        char c = in.next().charAt(0);
        MenuMain();
    }

    public static void ShowAllDoctoresInfoAtPerod() {
        System.out.println("\t=====================================================================");
        System.out.println("\t          Show All Doctors Information At Perode Screen               ");
        System.out.println("\t=====================================================================");
        Scanner in = new Scanner(System.in);
        HospetailStutions h = new HospetailStutions();
        System.out.println("Enter The Begin Serch Date Like This Staile dd/mm/yyyy");
        String Begin_Serch = in.next();
        System.out.println("Enter The End Serch Date Like This Staile dd/mm/yyyy");
        String End_Serch = in.next();
        h.getFullInformationAtBeroedForrDoctors(Begin_Serch, End_Serch);
        System.out.println("\t================================================================");
        System.out.println("Enter Any Key To Move To Main Menu ....");
        char c = in.next().charAt(0);
        MenuMain();
    }

    public static void ShowAllDoctoresInfo() {
        System.out.println("\t=====================================================================");
        System.out.println("\t              Show All Doctor Information Screen              ");
        System.out.println("\t=====================================================================");
        Scanner in = new Scanner(System.in);
        HospetailStutions h = new HospetailStutions();
        if (!h.ListDoctorAreDone.isEmpty()) {
            System.out.println("For Proven Doctors :");
            for (ProvenDoctor p : h.ListDoctorAreDone) {
                p.getInfo();
            }
        }
        if (!h.ListDoctorTreaning.isEmpty()) {
            System.out.println("For Treaining Doctors :");
            for (TreningDoctor p : h.ListDoctorTreaning) {
                p.printInfo();
            }
        }
        if (!h.ListDoctorAreGrude.isEmpty()) {
            System.out.println("For Contracted Doctors :");
            for (ContractedDoctor p : h.ListDoctorAreGrude) {
                p.getInfo();
            }
        }
        System.out.println("\t================================================================");
        System.out.println("Enter Any Key To Move To Main Menu ....");
        char c = in.next().charAt(0);
        MenuMain();
    }

    public static void GetNumOFDOctorContracted() {
        System.out.println("\t=====================================================================");
        System.out.println("\t     Get Number Of Doctore Contracted Whith The Hospital       ");
        System.out.println("\t=====================================================================");
        Scanner in = new Scanner(System.in);
        HospetailStutions h = new HospetailStutions();
        h.getNumOfDoctrIsContracted();
        System.out.println("\t================================================================");
        System.out.println("Enter Any Key To Move To Main Menu ....");
        char c = in.next().charAt(0);
        MenuMain();
    }

    public static void GrudetuitPationt() {
        System.out.println("\t=====================================================================");
        System.out.println("\t                   Grudute Pationt Screen                       ");
        System.out.println("\t=====================================================================");
        Scanner in = new Scanner(System.in);
        HospetailStutions h = new HospetailStutions();
        Clinic c = new Clinic();
        int User_Choise;
         do {
            System.out.println("Enter The Number To Get Servec \n[1] InSide Pationt \n[2] OutSide Pationt");
            User_Choise= in.nextInt();
         } while (User_Choise != 1 && User_Choise != 2);
        System.out.println("Chios One From THis Pationt TO Grudeute ");
        int i = 1, m;
        switch (User_Choise) {
            case 1:
                if (!h.ListPersonIn.isEmpty()) {
                    for (InSidePatient p : h.ListPersonIn) {
                        System.out.println("The Number " + i + " For Pationt : " + p.getNameOfPerson());
                        i++;
                    }
                    m = in.nextInt();
                    h.grudtuted(h.ListPersonIn.get(m - 1));
                } else {
                    System.out.println("No One At OutSide ....");
                }
                break;
            case 2:
                if (!c.ListOfOutSidePerson.isEmpty()) {
                    for (OutSidePatient p : h.ListPersonOut) {
                        System.out.println("The Number " + i + " For Pationt : " + p.getNameOfPerson());
                        i++;
                    }
                    m = in.nextInt();
                    c.grudtuted(c.ListOfOutSidePerson.get(m - 1));
                } else {
                    System.out.println("No One At InSide ....");
                }
                break;
            default:
                break;
        }
        System.out.println("\t================================================================");
        System.out.println("Enter Any Key To Move To Main Menu ....");
        char q = in.next().charAt(0);
        MenuMain();
    }

    public static void ShowAllTermentForPerson() {
        System.out.println("\t=====================================================================");
        System.out.println("\t              Show All Pationt's Terment Screen                  ");
        System.out.println("\t=====================================================================");
        Scanner in = new Scanner(System.in);
        HospetailStutions h = new HospetailStutions();
        int User_Choise;
        do {
            System.out.println("Enter The Number To Get Servec \n[1] InSide Pationt \n[2] OutSide Pationt");
            User_Choise = in.nextInt();
        } while (User_Choise != 1 || User_Choise != 2);
        System.out.println("Chios One From THis Pationt TO Show All Terment ");
        int i = 1, m;
        switch (User_Choise) {
            case 1:
                if (!h.ListPersonIn.isEmpty()) {
                    for (InSidePatient p : h.ListPersonIn) {
                        System.out.println("The Number " + i + " For Pationt : " + p.getNameOfPerson());
                        i++;
                    }
                    m = in.nextInt();
                    h.ListPersonIn.get(m - 1).getAllTerment();
                } else {
                    System.out.println("No One At OutSide ....");
                }
                break;
            case 2:
                if (!h.ListPersonOut.isEmpty()) {
                    for (OutSidePatient p : h.ListPersonOut) {
                        System.out.println("The Number " + i + " For Pationt : " + p.getNameOfPerson());
                        i++;
                    }
                    m = in.nextInt();
                    h.ListPersonOut.get(m - 1).printOut();
                } else {
                    System.out.println("No One At InSide ....");
                }
                break;
            default:
                break;
        }
        System.out.println("\t================================================================");
        System.out.println("Enter Any Key To Move To Main Menu ....");
        char c = in.next().charAt(0);
        MenuMain();
    }

    public static void MoveFromCilincToSections() {
        System.out.println("\t=====================================================================");
        System.out.println("\t                 Move Frome Cilinc To Hospital                 ");
        System.out.println("\t=====================================================================");
        Scanner in = new Scanner(System.in);
        System.out.println("Chios One From THis Pationt TO Move ");
        HospetailStutions h = new HospetailStutions();
        int i = 1, m;
        if (!h.ListPersonOut.isEmpty()) {
            for (OutSidePatient p : h.ListPersonOut) {
                System.out.println("Enter The Number " + i + " For This Pationt : " + p.getNameOfPerson());
                i++;
            }
        } else {
            System.out.println("There Are No Body OutSide At Cilince .");
        }
        m = in.nextInt();
        h.addSickPersonToHospetal(h.ListPersonOut.get(m - 1));
        System.out.println("\t================================================================");
        System.out.println("Enter Any Key To Move To Main Menu ....");
        char c = in.next().charAt(0);
        MenuMain();
    }

    public static void AddTermentForPerson() {
        System.out.println("\t=====================================================================");
        System.out.println("\t                 Add Terment To Pation Screen                 ");
        System.out.println("\t=====================================================================");
        Scanner in = new Scanner(System.in);
        HospetailStutions h = new HospetailStutions();
        System.out.println("All Pation InSide Are ");
        int i = 1;
        for (InSidePatient p : h.ListPersonIn) {
            System.out.print("The Pationt " + i + " Is : ");
            System.out.println(p.getNameOfPerson());
            i++;
        }
        System.out.println("What Is The Name Of Pationt You Wanna To Add Terment For Him ? ");
        int m = in.nextInt();
        i = 1;
        int Num;
        do {
            System.out.println(
                    "Enter The Type Of Doctor : \n[1] Proven Doctor \n[2] Treaning Doctor \n[3] Contracted Doctor ");
            Num = in.nextInt();
        } while (Num > 3 || Num < 1);
        switch (Num) {
            case 1:
                if (!h.ListDoctorAreDone.isEmpty()) {
                    for (ProvenDoctor p : h.ListDoctorAreDone) {
                        System.out.print("The Doctore " + i + " Is : ");
                        System.out.println(p.getNameOfDoctore());
                        i++;
                    }
                    System.out.println("What Is The Name Of Doctore You Wanna To Add Terment For Him ? ");
                    int n = in.nextInt();
                    h.ListPersonIn.get(m - 1).addTretermentToPerson(h.ListDoctorAreDone.get(n - 1));
                } else {
                    System.out.println("There Is No Doctore Here From This Type");
                }
                break;
            case 2:
                if (!h.ListDoctorTreaning.isEmpty()) {
                    for (TreningDoctor p : h.ListDoctorTreaning) {
                        System.out.print("The Doctore " + i + " Is : ");
                        System.out.println(p.getNameOfDoctore());
                        i++;
                    }
                    System.out.println("What Is The Name Of Doctore You Wanna To Add Terment For Him ? ");
                    int n = in.nextInt();
                    h.ListPersonIn.get(m - 1).addTretermentToPerson(h.ListDoctorTreaning.get(n - 1));
                } else {
                    System.out.println("There Is No Doctore Here From This Type");
                }
                break;
            case 3:
                if (!h.ListDoctorAreGrude.isEmpty()) {
                    for (ContractedDoctor p : h.ListDoctorAreGrude) {
                        System.out.print("The Doctore " + i + " Is : ");
                        System.out.println(p.getNameOfDoctore());
                        i++;
                    }
                    System.out.println("What Is The Name Of Doctore You Wanna To Add Terment For Him ? ");
                    int n = in.nextInt();
                    h.ListPersonIn.get(m - 1).addTretermentToPerson(h.ListDoctorAreGrude.get(n - 1));
                } else {
                    System.out.println("There Is No Doctore Here From This Type");
                }
                break;
            default:
                break;
        }
        System.out.println("\t================================================================");
        System.out.println("Enter Any Key To Move To Main Menu ....");
        char c = in.next().charAt(0);
        MenuMain();
    }

    public static void ShowInfo() {
        System.out.println("\t=====================================================================");
        System.out.println("\t                 Show Pationt's Information Screen           ");
        System.out.println("\t=====================================================================");
        Scanner in = new Scanner(System.in);
        if (!HospetailStutions.ListPersonIn.isEmpty()) {
            System.out.println("For Pationt At Hospital :");
            for (InSidePatient i : HospetailStutions.ListPersonIn) {
                i.getFullInfo();
            }
        } else {
            System.out.println("No Body At Hospital...");
        }
        if (!Clinic.ListOfOutSidePerson.isEmpty()) {
            System.out.println("For Pationt At Cilince :");
            for (OutSidePatient i : Clinic.ListOfOutSidePerson) {
                i.printOut();
            }
        } else {
            System.out.println("No Body At Cilince...");
        }
        System.out.println("\t================================================================");
        System.out.println("Enter Any Key To Move To Main Menu ....");
        char c = in.next().charAt(0);
        MenuMain();
    }

    public static void ShowInfoAtPeronde() {
        System.out.println("\t=====================================================================");
        System.out.println("\t          Show Pationt's Information At Persode Screen         ");
        System.out.println("\t=====================================================================");
        Scanner in = new Scanner(System.in);
        HospetailStutions h = new HospetailStutions();
        System.out.println("Enter The Begin Date Serch Like This Staile dd/mm/yyyy:");
        String Begin_Serch_Date = in.next();
        System.out.println("Enter The End Date Serch Like This Staile dd/mm/yyyy:");
        String End_Serch_Date = in.next();
        h.getFullInformationAtBeroedForrPisents(Begin_Serch_Date, End_Serch_Date);
        System.out.println("\t================================================================");
        System.out.println("Enter Any Key To Move To Main Menu ....");
        char c = in.next().charAt(0);
        MenuMain();
    }

    public static void addSickPersonToHospetal() {
        System.out.println("\t=====================================================================");
        System.out.println("\t                 Add Pationt To Hospital Screen                          ");
        System.out.println("\t=====================================================================");
        Scanner in = new Scanner(System.in);
        HospetailStutions h = new HospetailStutions();
        System.out.println("Enter The Name Of Patient : ");
        String Name_Of_Patient = in.next();
        System.out.println("Enter The Addreas Of Patient : ");
        String Addreas_Of_Patient = in.next();
        System.out.println("Enter The Birth Date Of Patient Like This Staile dd/mm/yyyy : ");
        String BirthDate_Of_Patient = in.next();
        System.out.println("Enter The Joined Date Of Patient Like This Staile dd/mm/yyyy : ");
        String Joined_Date_Of_Patient = in.next();
        InSidePatient ip = new InSidePatient(Name_Of_Patient, Addreas_Of_Patient, BirthDate_Of_Patient,
                Joined_Date_Of_Patient);
        h.addSickPersonToHospetal(ip);
        System.out.println("\t================================================================");
        System.out.println("Enter Any Key To Move To Main Menu ....");
        char c = in.next().charAt(0);
        MenuMain();
    }

    public static void addSickPersonToCilinc() {
        System.out.println("\t=====================================================================");
        System.out.println("\t                 Add Pationt to Cilince Screen                   ");
        System.out.println("\t=====================================================================");
        Scanner in = new Scanner(System.in);
        Clinic c = new Clinic();
        System.out.println("Enter The Name Of Patient : ");
        String Name_Of_Patient = in.next();
        System.out.println("Enter The Addreas Of Patient : ");
        String Addreas_Of_Patient = in.next();
        System.out.println("Enter The Birth Date Of Patient Like This Staile dd/mm/yyyy : ");
        String BirthDate_Of_Patient = in.next();
        System.out.println("Enter The Joined Date Of Patient Like This Staile dd/mm/yyyy : ");
        String Joined_Date_Of_Patient = in.next();
        OutSidePatient op = new OutSidePatient(Name_Of_Patient, Addreas_Of_Patient, BirthDate_Of_Patient,
                Joined_Date_Of_Patient);
        c.addSickPersonToCilenc(op);
        HospetailStutions.ListPersonOut.add(op);
        System.out.println("\t================================================================");
        System.out.println("Enter Any Key To Move To Main Menu ....");
        char w = in.next().charAt(0);
        MenuMain();
    }

    public static void addDoctoreToHospetalAndCilince() {
        System.out.println("\t=====================================================================");
        System.out.println("\t              Add Doctore To Hospital And Cilince                         ");
        System.out.println("\t=====================================================================");
        Scanner in = new Scanner(System.in);
        HospetailStutions h = new HospetailStutions();
        Clinic c = new Clinic();
        int Num;
        System.out.println("Enter The Name Of Doctore : ");
        String Name_Of_Patient = in.next();
        System.out.println("Enter The Addreas Of Doctor : ");
        String Addreas_Of_Patient = in.next();
        System.out.println("Enter The Birth Date Of Doctor Like This Staile dd/mm/yyyy : ");
        String BirthDate_Of_Patient = in.next();
        System.out.println("Enter The Joined Date Of Doctor Like This Staile dd/mm/yyyy : ");
        String Joined_Date_Of_Patient = in.next();
        do {
            System.out.println(
                    "Enter The Type Of Doctor : \n[1] Proven Doctor \n[2] Treaning Doctor \n[3] Contracted Doctor ");
            Num = in.nextInt();
            switch (Num) {
                case 1:
                    System.out.println("Enter The Number Of Section That Doctore Working In ");
                    int Section_Num = in.nextInt();
                    System.out.println("Enter The Salary ");
                    float Salary_Num = in.nextFloat();
                    ProvenDoctor d = new ProvenDoctor(Name_Of_Patient, Addreas_Of_Patient, BirthDate_Of_Patient,
                            Joined_Date_Of_Patient, Section_Num, Salary_Num);
                    h.addDoctorToHospetil(d);
                    c.addDoctorToCilinic(d);
                    break;
                case 2:
                    System.out.println("Enter The Date Of End Treaning Like This Staile dd/mm/yyyy");
                    String End_Date = in.next();
                    TreningDoctor t = new TreningDoctor(Name_Of_Patient, Addreas_Of_Patient, BirthDate_Of_Patient,
                            Joined_Date_Of_Patient, End_Date);
                    h.addDoctorToHospetil(t);
                    c.addDoctorToCilinic(t);
                    break;
                case 3:
                    System.out.println("Enter The Date Of Contracted Like This Staile dd/mm/yyyy");
                    String Contracted_Date = in.next();
                    ContractedDoctor C = new ContractedDoctor(Name_Of_Patient, Addreas_Of_Patient, BirthDate_Of_Patient,
                            Joined_Date_Of_Patient, Contracted_Date);
                    h.addDoctorIsContracted(C);
                    c.addDoctorIsContracted(C);
                    break;
                default:
                    break;
            }
        } while (Num > 3 || Num < 1);
        System.out.println("\t================================================================");
        System.out.println("Enter Any Key To Move To Main Menu ....");
        char e = in.next().charAt(0);
        MenuMain();
    }

    public static void MenuMain() {
        ClearTerment();
        Scanner in = new Scanner(System.in);
        HospetailStutions h=new HospetailStutions(); 
        System.out.println("\t=====================================================================");
        System.out.println("\t                            Main Menu                          ");
        System.out.println("\t=====================================================================");
        System.out.println("\t\t [1]  Show All Petiont Information .");
        System.out.println("\t\t [2]  Show All Petiont Information At Perode .");
        System.out.println("\t\t [3]  Add Petiont To Hospital .");
        System.out.println("\t\t [4]  Add Petiont To Cilinc .");
        System.out.println("\t\t [5]  Move Petiont From Cililenc To Hospital .");
        System.out.println("\t\t [6]  Show All Terment For Pationt .");
        System.out.println("\t\t [7]  Grudeute Pationt From Hospital .");
        System.out.println("\t\t [8]  Add Terment For Petiont .");
        System.out.println("\t\t [9]  Show All Doctor Information .");
        System.out.println("\t\t [10] Show All Doctors Information At Perod .");
        System.out.println("\t\t [11] Add Doctore To Hospital .");
        System.out.println("\t\t [12] Remove Doctor From Hospital .");
        System.out.println("\t\t [13] Get Number Of Doctore Are Contracted .");
        System.out.println("\t\t [14] Get Number Of Pationt Are At Section At Perode .");
        System.out.println("\t\t [15] Convert Doctor From Treaining Type To Proven Type .");
        System.out.println("\t\t [16] Exit .");
        System.out.println("\t=====================================================================");
        int val = in.nextInt();
        ClearTerment();
        switch (val) {
            case 1:
                ShowInfo();
                break;
            case 2:
                ShowInfoAtPeronde();
                break;
            case 3:
                addSickPersonToHospetal();
                break;
            case 4:
                addSickPersonToCilinc();
                break;
            case 5:
                MoveFromCilincToSections();
                break;
            case 6:
                ShowAllTermentForPerson();
                break;
            case 7:
                GrudetuitPationt();
                break;
            case 8:
                AddTermentForPerson();
                break;
            case 9:
                ShowAllDoctoresInfo();
                break;
            case 10:
                ShowAllDoctoresInfoAtPerod();
                break;
            case 11:
                addDoctoreToHospetalAndCilince();
                break;
            case 12:
                removDoctoreToHospetal();
                break;
            case 13:
                GetNumOFDOctorContracted();
                break;
            case 14:
                GetNumbrOfPationtAtBerod();
                break;
            case 15:
                ConvertDoctor();
                break;
            default:
                break;
        }

    }

    public static void ClearTerment() {
        String os = System.getProperty("os.name").toLowerCase();
        try {
            if (os.contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
