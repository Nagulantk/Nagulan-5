public class Main {
    public static void main(String[] args) {
Axis user=new Axis(4567,234,5000,"Nagul");
user.withdrawAmount(4567,234,500,"Nagul");


    }
}
class ATM
{
    int accountNumber;
    int pin;
    int balance;
    ATM(int accountNumber,int pin,int balance)
    {
        this.accountNumber=accountNumber;
        this.pin=pin;
        this.balance=balance;
    }
    public void sayThankYou()
    {
        System.out.println("Thankyou");
    }
    public void withdrawAmount(int accountNumber,int pin,int amount)
    {
        if(this.accountNumber==accountNumber&&this.pin==pin)
        {
            if(amount<balance)
            {
                balance=balance-amount;
                System.out.println("amount is withdrawn");
            }
            else {
                System.out.println("Insufficient balance");
            }
        }
    }
}
class Axis extends ATM
{
    String name;
    Axis(int accountNumber,int pin,int balance,String name)
    {
        super( accountNumber, pin, balance);
        this.name=name;
    }
    public void getBalance(int accountNumber,int pin,String name)
    {
       if( super.accountNumber==accountNumber&&super.pin==pin&&this.name.equals(name))
       {
           System.out.println(balance);
           super.sayThankYou();
       }
       else {
           System.out.println("Enter valid details");
           super.sayThankYou();
       }

    }
    public void withdrawAmount(int accountNumber,int pin,int amount,String name)
    {
        if(super.accountNumber==accountNumber&&super.pin==pin&&this.name.equals(name))
        {if(amount<super.balance){
            super.balance=super.balance-amount;
            System.out.println("amount is withdrawn");
            super.sayThankYou();}
            else {
                System.out.println("Insufficient balance");
            super.sayThankYou();
        }
        }
    }
}