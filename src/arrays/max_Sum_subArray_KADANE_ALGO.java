package arrays;

import java.util.Scanner;

public class max_Sum_subArray_KADANE_ALGO {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter "+n+" elements : ");
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //Kadane's algorithm:
        int max_current = arr[0];
        int max_global = arr[0];
        for (int i = 1; i<n; i++){
            max_current = Math.max(arr[i], max_current+arr[i]);
            if (max_current > max_global){
                max_global = max_current;
            }
        }

        System.out.println("Max sum : "+ max_global);
    }
}
