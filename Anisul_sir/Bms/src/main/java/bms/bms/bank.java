
package bms.bms;


public class bank {
   private String name;
   private long  accountnumber;
   private double balance;
    bank(String name,long  accountnumber,double balance)
    {
        this.name=name;
        this.accountnumber=accountnumber;
        this.balance=balance;
        
    }
    void display()
    {
        System.out.println(name+" "+accountnumber+" "+balance);
    }
    void deposit(double amount)
    {
        if(amount>0)
        {
            balance+=amount;
            System.out.println("Diposited:"+amount);
        }
        else
        {
            System.out.println("Amount should be positive");
        }
    }
       void withdraw(double amount)
        {
            if(amount>0 && amount<=balance)
            {
                balance-=amount;
                System.out.println("withdraw:"+amount);
            }
            else
            {
                System.out.println("Withdraw is not possible");
            }
        }

}

