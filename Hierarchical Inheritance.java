public class Main {
    public static void main(String[] args) {

        Intern intern =new Intern();
        intern.salary(100);
        System.out.println(intern.salary);
        intern.coaching();
        intern.food();
        intern.accessToEmployeeDetails();
        intern.developing();
        intern.recruiting();
        MTS mts =new MTS();
        mts.salary(100);
        System.out.println(mts.salary);
        mts.coaching();
        mts.food();
        mts.accessToEmployeeDetails();
      mts.developing();
       mts.recruiting();
      LE le =new LE();
       le.salary(100);
        System.out.println(le.salary);
        le.coaching();
        le.food();
        le.accessToEmployeeDetails();
       le.developing();
       le.recruiting();
    }
}
abstract class Zoho
{

    int salary;
    int pf;


    abstract public void developing();
    abstract public void coaching();
    abstract public void accessToEmployeeDetails();
    abstract public void recruiting();
    public void food()
    {
        System.out.println("Free food");
    }



}
class Intern extends Zoho{
    public void salary(int days)
    {
        super.salary=days*500;
    }
    public void developing()
    {
        System.out.println("Developing a basic application");
    }
    public void coaching()
    {
        System.out.println("They will be guided by mentors");
    }
    public void accessToEmployeeDetails()
    {
        System.out.println("Does not have the acccess to the other employee details");
    }
    public void recruiting()
    {
        System.out.println("They will be recruited by higher officials");
    }
}
class MTS extends Intern{
    public void salary(int days)
    {
        super.salary=days*1000;
        pf=salary/10;
    }
    public void developing()
    {
        System.out.println("Developing a client needed application");
    }

}
class LE extends MTS
{
    public void salary(int days)
    {
        super.salary=days*2000;
        pf=salary/10;
    }
    public void developing()
    {
        System.out.println("Guiding the juniors");
    }
    public void recruiting()
    {
        System.out.println("They will recruit freshers");
    }
    public void coaching()
    {
        System.out.println("They are guiding their juniors");
    }

}