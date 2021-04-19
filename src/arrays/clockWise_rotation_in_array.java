package arrays;

import java.util.Scanner;

public class clockWise_rotation_in_array {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter "+n+" elements: ");
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int x = arr[n-1];
        for (int i = n - 1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = x;

        for (int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }



    }
}

