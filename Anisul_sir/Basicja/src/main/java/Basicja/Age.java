
package Basicja;

import java.util.Scanner;


public class Age {
    public static void prime(int num) 
    {
        boolean ans=true;
        for(int i=2; i*i<=num; i++)
        {
            if(num%i==0)
            {
                ans=false;
                break;
            }
        }
        if(ans)
            System.out.println(num+" is prime");
        else
            System.out.println(num+" is not prime");
    }
    
    public static void main(String[] args) 
    {
          Scanner ob = new Scanner(System.in);
          
              int n;
              System.out.println("No of age: ");
              n=ob.nextInt();
              int[]age=new int[n];
              for(int i=0; i<n;i++)
              {
                  age[i]=ob.nextInt();
              }
              for(int i=0; i<n;i++)
              {
                  System.out.print(age[i]+" ");
              }
              int sum=0,even=0,odd=0;
               for(int i=0; i<n;i++)
               {
                   sum+=age[i];
                   if(age[i]%2==0)
                       even++;
                   else
                       odd++;
               }
               System.out.println("sum "+sum);
               System.out.println(even+" "+odd);
               for(int i=0; i<n; i++)
               {
                   prime(age[i]);
               }
          
    }
 
}