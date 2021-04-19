package arrays;

import java.util.Scanner;

public class Moving_all_negatives_to_one_side {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int pos = 0, temp;
        for (int i = 0; i<n; i++){
            if (arr[i] < 0){
                if(i != pos) {
                    temp = arr[i];
                    arr[i] = arr[pos];
                    arr[pos] = temp;
                }
                pos++;
            }
        }

        for (int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
