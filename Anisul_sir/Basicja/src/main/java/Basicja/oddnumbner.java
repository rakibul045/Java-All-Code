
package Basicja;

import java.util.Scanner;
public class oddnumbner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       int n,sum = 0;
       n=input.nextInt();
       
       
        for(int i=2;i<=10;i++)
        {
             sum=n*i;
             System.out.println(sum);
        }
        
       
       
    }
    
}
