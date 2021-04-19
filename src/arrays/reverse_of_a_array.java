package arrays;

public class reverse_of_a_array {
    public static void main(String[] args){
        int[] arr = new int[]{1, 2, 4, 2, 4, 4,5,6,2,-1};
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        printArray(arr);
    }
    static int[] printArray(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        return arr;
    }
}
