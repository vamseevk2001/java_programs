package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class union_intersection_sorted_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        ArrayList<Integer> union = new ArrayList<>();
        ArrayList<Integer> intersection = new ArrayList<>();

        System.out.println("Enter " + n + " values for array 1: ");
        for (int i = 0; i<n; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter " + m + " values for array 2: ");
        for (int i = 0; i<m; i++){
            arr2[i] = sc.nextInt();
        }

        //union:
        int x = arr1.length, y= arr2.length;
        int a = 0, b = 0;


        while (a < x && b < y){
            if(arr1[a] < arr2[b]){
                union.add(arr1[a]);
                a++;
            }
            else if (arr2[b] < arr1[a]){
                union.add(arr2[b]);
                b++;
           }
            else{
                union.add(arr1[a]);
                intersection.add(arr1[a]);
                a++;
                b++;
            }
        }


        while (a < x){
            union.add(arr1[a]);
            a++;
        }

        while (b < y){
            union.add(arr2[b]);
            b++;
        }

        int i;
        System.out.print("Union: ");
        for(i = 0; i<union.size(); i++) {
            System.out.print(union.get(i) + " ");
        }

        System.out.println();
        //intersection:
        System.out.print("Intersection: ");
        for(i = 0; i<intersection.size(); i++) {
            System.out.print(intersection.get(i) + " ");
        }




    }
}
