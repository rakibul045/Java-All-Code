

package RakibUL;

import java.util.Scanner;
public class Prim {

      public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter numbers:");
        for(int i=2;i<100;i++)
        {
            boolean prime=true;
          for(int j=2;j<i;j++)
        {
           if(i%j==0)
           {
               prime=false;
               break;
           }
        }
          if(prime==true)
          {
              System.out.print(i+" "+" prime"); 
          }
          else
          {
               System.out.println(i+" "+"not prime");
          }
      }
        
        
    }
    }

