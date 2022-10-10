public class Main {
    public static void main(String[] args) {
     try{
      throw new NegativeNumberException("good");

        }
      catch(NegativeNumberException e)
       {
            System.out.println("Exception is caught  "+e.toString());

        }
    }
}
class NegativeNumberException extends RuntimeException
{
 public NegativeNumberException(String s)
    {
super(s);
    }

}