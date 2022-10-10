
public class Main {
    public static void main(String[] args) {
        GoodMorning user=new GoodMorning();
        user.sayGoodMorning();
        user.sayGoodMorning("Nagul");
        user.sayGoodMorning("Nagul","How are you");
        user.sayGoodMorning(5);
    }
}
class GoodMorning
{
    public void sayGoodMorning()
    {
        System.out.println("Good Morning");
    }
    public void sayGoodMorning(String name)
    {
        System.out.println("Good Morning "+name);
    }
    public void sayGoodMorning(String name,String sentence)
    {
        System.out.println("Good Morning "+name+sentence);
    }
    public void sayGoodMorning(int n)
    {
        System.out.println("Enter a name or Sentence");
    }

}