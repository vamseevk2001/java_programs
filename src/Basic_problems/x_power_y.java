package Basic_problems;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class x_power_y {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("x^y");
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter y: ");
        int y = sc.nextInt();
        int answer = 1;
        for (int i = 1; i<=y; i++) answer *= x;
        System.out.print(x+"^"+y+" = "+answer);
    }
}
