package Basic_problems;

import java.util.Scanner;

public class palindrome_of_numbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = n;
        int reversed = 0;
        int remainder;

        while(x != 0){
            remainder = x % 10;
            x = x/10;
            reversed = (reversed * 10) + remainder;
        }

        System.out.println("the reverse of "+n+" is :"+reversed);

        if(reversed == n) System.out.println(n+" is a palindrome.");
        else System.out.println(n+" is not a palindrome.");
    }


}
