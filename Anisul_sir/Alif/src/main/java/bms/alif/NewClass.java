/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bms.alif;

/**
 *
 * @author USER
 */
public class NewClass {
    
    private String name;
    private long idname;
    private double balance;
    
    
    
    NewClass(String name,long idname,double balance){
        
        this.name=name;
        this. idname=idname;
        this.balance=balance;
           
    }
    void display(){
        
        System.out.println(name+" "+idname+" "+balance);
         
    }
    void deposit(double amount){
        if(amount>0)
        {
            balance+=amount;
            
        }
        else
        {
            System.out.print("Amount cannt be negative");
        }
         
    }
    void withdraw(double amount)
    {
        if(amount<balance)
        {
            balance-=amount;
        }
        else
        {
            System.out.println("You have not enough money");
        }
          
        
    }
     
}
