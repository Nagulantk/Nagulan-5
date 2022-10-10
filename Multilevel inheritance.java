
public class Main {
    public static void main(String[] args) {

        Students nagul=new ABCSchool();
        nagul.fillPersonalDetails("Nagul",21,"19-06-2002",189076);

        nagul.enterPhoneNumber(98429123342L);
        nagul.enterEmail("nagulan@gamil.com");
        nagul.enterMarks(45,56,67);
        nagul.percentage();
        nagul.sum();
        nagul.studentDetails(189076);
        nagul=new Ehkn();
        nagul.fillPersonalDetails("Nagul",21,"19-06-2002",189076);

        nagul.enterPhoneNumber(98429123342L);
        nagul.enterEmail("nagulan@gamil.com");
        nagul.enterMarks(45,56,67);
        nagul.percentage();
        nagul.sum();
        nagul.studentDetails(189076);
    }
}
interface Students
{
    void fillPersonalDetails(String name,int age,
                             String DOB,int rollNumber);
    void enterMarks(int maths,int chemistry,int physics);
    void enterEmail(String email);
    void enterPhoneNumber(long phoneNumber);
    void percentage();
    void sum();
    void studentDetails(int rollNumber);
}
class ABCSchool implements Students
{
    String name;
    int age;
    String DOB;
    int rollNumber;
    String email;
    long phoneNumber;

    int sum;
    int maths;
    int physics;
    int chemistry;

    public void enterEmail(String email) {
        this.email = email;
    }

    public void enterPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    @Override
    public void fillPersonalDetails(String name,int age,
                                    String DOB,int rollNumber) {
        this.name=name;
        this.age=age;
        this.DOB=DOB;
        this.rollNumber=rollNumber;

    }

    @Override
    public void enterMarks(int maths, int chemistry, int physics) {
        this.maths=maths;
        this.chemistry=chemistry;
        this.physics=physics;
        sum=maths+chemistry+physics;
    }

    @Override
    public void percentage() {
        System.out.println((sum*100)/300);
    }
    public void sum()
    {
        System.out.println(sum);
    }
    public void studentDetails(int rollNumber)
    {
        if(this.rollNumber==rollNumber)
        {
            System.out.println("Name:"+name+" Roll number:"+rollNumber+" Email:"+email+" DOB"+DOB+" Age:"+age);
        }
        else {
            System.out.println("Enter a valid roll number");
        }
    }
}
class Ehkn implements Students
{
    String name;
    int age;
    String DOB;
    int rollNumber;
    String email;
    long phoneNumber;

    int sum;
    int maths;
    int physics;
    int chemistry;


    public void enterEmail(String email) {
        this.email = email;
    }

    public void enterPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    @Override
    public void fillPersonalDetails(String name,int age,
                                    String DOB,int rollNumber) {
        this.name=name;
        this.age=age;
        this.DOB=DOB;
        this.rollNumber=rollNumber;

    }

    @Override
    public void enterMarks(int maths, int chemistry, int physics) {
        this.maths=maths;
        this.chemistry=chemistry;
        this.physics=physics;

        sum=maths+chemistry+physics;
    }

    @Override
    public void percentage() {
        System.out.println((sum*100)/300);
    }
    public void sum()
    {
        System.out.println(sum);
    }
    public void studentDetails(int rollNumber)
    {
        if(this.rollNumber==rollNumber)
        {
            System.out.println("Name:"+name+" Roll number:"+rollNumber+" Email:"+email+" DOB"+DOB+" Age:"+age);
        }
        else {
            System.out.println("Enter a valid roll number");
        }
    }

}