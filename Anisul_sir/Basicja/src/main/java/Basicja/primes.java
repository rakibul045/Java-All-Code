
package Basicja;
import java.util.Scanner;
public class primes {
    
    


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter a number to check if it is prime: ");
        n = input.nextInt();
        boolean prime = true;

        if (n <= 1) {
            prime = false; // 1 and numbers less than 1 are not prime
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) { // Use Math.sqrt(n)
                if (n % i == 0) {
                    prime = false;
                    break; // Exit loop if a divisor is found
                }
            }
        }

        if (prime) {
            System.out.println(n + " is  a prime number.");
        } else 
        {
            System.out.println(n + " is not a prime number.");
        }
        
    }
}
    
    

