package Basic_problems;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        while(sc.hasNextInt()){
            int a = sc.nextInt();
            arr.add(a);

        }
        for (int i = 0; i<arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }

    }
}
