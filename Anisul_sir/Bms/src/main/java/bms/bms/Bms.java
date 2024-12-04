

package bms.bms;


public class Bms {

    public static void main(String[] args) {
       bank ob=new bank("karim",1234567864,37000);
       ob.display();
       ob.deposit(20000);
       ob.display();
       ob.withdraw(10000);
       ob.display();
           
    }
    }
