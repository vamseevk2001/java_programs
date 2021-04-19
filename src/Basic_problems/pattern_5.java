package Basic_problems;
import java.lang.*;
import java.util.*;

public class pattern_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> nums = new PriorityQueue<>();
        int n = sc.nextInt();
        for (int i = 0; i<n; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x == 1) nums.add(y);
            else if(x == 2){
                if (nums.size() != 0) System.out.println(nums.peek());
                else System.out.println(-1);
            }
            else if (x == 3){
                if (nums.size() != 0) nums.poll();
            }
        }
    }

    }
