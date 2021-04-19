package Basic_problems;

import java.util.Scanner;

public class fibonnacci {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of the first element: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of the second element: ");
        int b = sc.nextInt();
        System.out.print("Enter the required length of the fibonnacci series: ");
        int n = sc.nextInt();
        System.out.print(a+" "+b+" ");
        for (int i=0; i<n-2; i++){
            int c = a+b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
    }
}
