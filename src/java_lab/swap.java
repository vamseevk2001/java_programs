package java_lab;

import java.util.Scanner;

public class swap {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Integer.toString(a) + " " + Integer.toString(b));

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(Integer.toString(a) +" "+ Integer.toString(b));
    }

}
