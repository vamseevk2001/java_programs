package Basic_problems;

import java.util.Scanner;

public class prime_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        boolean isPrime = false;
        for (int i = 2; i<= n/2; i++)
        {
            if (n%i == 0)
                isPrime = false;
            else
                isPrime = true;

        }
        if (isPrime == true)
            System.out.print(n+" is a prime number");
        else
            System.out.print(n+" is not a prime number");
    }
}
