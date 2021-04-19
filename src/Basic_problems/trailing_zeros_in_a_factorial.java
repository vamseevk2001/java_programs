package Basic_problems;

import java.util.Scanner;

public class trailing_zeros_in_a_factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = 0;
        for (int i = 5; i<=n; i*=i){
            res += n/i;
        }
        System.out.print(res);

    }
            }