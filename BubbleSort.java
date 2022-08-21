package Sorting;

public class BubbleSort {
    //Time complexity O(n2)
    public static void bubbleSort(int nums[]) {
        int n = nums.length;
        for(int turn= 0; turn<=n-2; turn++) {
            for(int j= 0; j<=n-2-turn; j++) {
                if(nums[j] > nums[j+1]) {
                    //swap
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
    public static void printArr(int nums[]) {
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int nums[] = {5, 4, 1, 3, 2};
        bubbleSort(nums);
        printArr(nums);
    }
}
