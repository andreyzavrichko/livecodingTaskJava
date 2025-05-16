package org.example.interviewcore;

public class IndexEdgeCase {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        for (int i = 0; i <= nums.length; i++) {
            try {
                System.out.println(nums[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Index problem at: " + i);
            }
        }
    }
}
// Что будет выведено?

