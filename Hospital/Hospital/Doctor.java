package Hospital;
public abstract class Doctor {
    private int NumOfDoctor = Counter;
    private String JoinedDate;
    private String NameOfDoctore;
    private String AddreasOfDoctore;
    private String BirthDateOfDoctor;
    static int Counter = 1;

    Doctor() {
        Counter++;
    }

    Doctor(String Name, String Addreas, String Date,String JoinedDate) {
        this.NameOfDoctore = Name;
        this.AddreasOfDoctore = Addreas;
        this.BirthDateOfDoctor = Date;
        this.JoinedDate=JoinedDate;
        Counter++;
    }

    public String getAddreasOfDoctore() {
        return AddreasOfDoctore;
    }

    public String getBirthDateOfDoctor() {
        return BirthDateOfDoctor;
    }

    public String getNameOfDoctore() {
        return NameOfDoctore;
    }

    public int getNumOfDoctor() {
        return NumOfDoctor;
    }

    public String getJoinedDate() {
        return JoinedDate;
    }

    public void getInfo(){
        System.out.println("\n\t----------------------Doctore_Information----------------------");
        System.out.print("\t|"+setSpace("Num Of Doctore Is",25)+": "+NumOfDoctor+"\n\t|"+setSpace("Name Of Doctore",25)+": "+NameOfDoctore+"\n\t|"+setSpace("Addreas For Doctore",25)+": "+AddreasOfDoctore+"\n\t|"+setSpace("BirthDate Of Doctore",25)+": "+BirthDateOfDoctor+"\n\t|"+setSpace("Joined Date",25)+": "+JoinedDate);
    }

    public String setSpace(String n,int Spaces){
        for(int i=n.length();i<Spaces;i++){
            n+=" ";
        }
        return n;
    }
}
