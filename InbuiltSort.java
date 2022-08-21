package Sorting;
import java.util.*;
public class InbuiltSort {
    public static void printArr(Integer nums[]) {
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        Integer nums[] = {4, 5, 2, 1, 3};
        //Time complexity of this sort is nlogn.
        Arrays.sort(nums);
        Arrays.sort(nums, 0, 3);
        //For Decendind order sort
        Arrays.sort(nums, Collections.reverseOrder());
        Arrays.sort(nums, 0, 3, Collections.reverseOrder());
        printArr(nums);
    }
}
