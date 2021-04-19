package java_lab;

import java.util.Scanner;

public class area_retangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter length: ");
        double length = sc.nextDouble();

        System.out.print("enter breadth: ");
        double breadth = sc.nextDouble();

        double area = length * breadth;
        System.out.println("Area : " + area);


        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter : " + perimeter);
    }
}
