
package Basicja;

import java.util.Scanner;
public class T_prime {
    

    public static void main(String[] args) 
    {
        int MAX = 1000000;
        boolean[] isNotPrime = new boolean[MAX + 1];

       
        for (int i = 2; i * i <= MAX; i++) 
        {
            if (!isNotPrime[i])
            {
                for (int j = i * i; j <= MAX; j += i)
                {
                    isNotPrime[j] = true;
                }
            }
        }

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++)
        {
            long b = sc.nextLong();
            long sqrt = (long) Math.sqrt(b);

            if (b == 1) 
            {
                System.out.println("NO");
            } else if (sqrt * sqrt == b && !isNotPrime[(int) sqrt]) 
            {
                System.out.println("YES");
            } else
            {
                System.out.println("NO");
            }
        }

       
    }
}
