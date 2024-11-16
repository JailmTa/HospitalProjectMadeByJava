package Hospital;
import java.util.List;
import java.util.Scanner;

public abstract class Patient {
    Scanner in = new Scanner(System.in);
    private int NumOfPerson = Counter;
    private String NameOfPerson;
    private String AddreasOfPerson;
    private String BirthDateOfPerson;
    private String JoinedDate;
    static int Counter = 1;

    private List<InSidePatient> InSide_Persons;
    private List<OutSidePatient> OutSide_Persons;

    Patient() {
    }

    Patient(String NameOfPerson, String AddreasOfPerson, String DateOfPerson,String JoinedDate) {
        this.NameOfPerson = NameOfPerson;
        this.AddreasOfPerson = AddreasOfPerson;
        this.BirthDateOfPerson = DateOfPerson;
        this.JoinedDate=JoinedDate;
        Counter++;
    }

    
    public void ConvertFromInSideToSection(InSidePatient Person) {
        System.out.println("Did You Accepted To Convert It?");
        boolean Accepted = in.nextBoolean();
        if (Accepted) {
            HospetailStutions h1 = new HospetailStutions();
            h1.setTypeOfSection();
        }
    }

    public void ConvertFromOutSideToSection(OutSidePatient Person) {
        System.out.println("Did You Accepted To Convert It?");
        boolean Accepted = in.nextBoolean();
        if (Accepted) {
            HospetailStutions h1 = new HospetailStutions();
            h1.setTypeOfSection();
        }
    }
    
    public String getAddreasOfPerson() {
        return AddreasOfPerson;
    }

    public String getBirthDateOfPerson() {
        return BirthDateOfPerson;
    }

    public String getNameOfPerson() {
        return NameOfPerson;
    }

    public int getNumOfPerson() {
        return NumOfPerson;
    }

    public String getJoinedDate() {
        return JoinedDate;
    }

    @Override
    public String toString() {
        return "\t----------------------Patatont_Information----------------------"+"\n\t|"+setSpace("Number",25)+": " + getNumOfPerson()+"\n\t|"+setSpace("Name",25)+ ": " + getNameOfPerson() + "\n\t|"+setSpace("Addreas",25)+": " + getAddreasOfPerson() + "\n\t|"+setSpace("Date",25)+": " + getBirthDateOfPerson()
        +"\n\t|"+setSpace("Joined Date",25)+": "+getJoinedDate();
    }

    public String setSpace(String n,int Spaces){
        for(int i=n.length();i<Spaces;i++){
            n+=" ";
        }
        return n;
    }
}
