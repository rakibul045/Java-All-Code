
package Basicja;

import java.util.Scanner;


public class Games {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int a;
        int count=0;
        a=input.nextInt();
        int[] x=new int [a];
        int[] y=new int [a];
        
        for(int i=0; i<a; i++)
        {
            x[a]=input.nextInt();
            y[a]=input.nextInt();
        }
         for(int i=0; i<a; i++)
    {
        for(int j=0; j<a; j++)
        {
            if(x[i]==y[j])
            {
                count++;
            }
        }

    }
        System.out.println(count);
        
}
    }

