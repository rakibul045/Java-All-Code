
package Basicja;

import java.util.Scanner;



public class pallendrom {
    
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        
        int num,temp,sum=0,r;
        System.out.println("Enter a number:");
        num=input.nextInt();
        temp=num;
        while(temp!=0)
        {
            r=temp%10;
            sum=sum*10+r;
            temp=temp/10;
            
        }
        if(sum==num)
        {
            System.out.println("pallendrome number");
        }
        else
        {
            System.out.println("not pallendrome numbert11");
        }
    }
    
}
