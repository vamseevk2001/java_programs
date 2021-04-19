package java_lab;

import java.util.Scanner;

public class perimeter_of_circle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius : ");
        int rad = sc.nextInt();
        double perimeter = 2 * 3.14 * rad;
        System.out.println("Perimeter : "+perimeter);
    }
}
