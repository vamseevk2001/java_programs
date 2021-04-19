package Basic_problems;

import java.util.Arrays;
import java.util.Scanner;

public class array_sum_equal_to_target {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int target= sc.nextInt();
        int[] nums = {2,5,7,8};

        //brute force solution:
        for (int i  = 0; i<nums.length; i++) {
            for (int j = i+1; j<=nums.length - 1; j++){
                if(nums[i] + nums[j] == target){
                     int[] result = {i, j};
                     System.out.print(Arrays.toString(result));
                }
            }
        }
    }
}
