/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
*/



class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length-1;
       
        k=k%n;
        reverseArray(nums,0,n);
        reverseArray(nums,0,k-1);
        reverseArray(nums,k,n);
    }
    public static void reverseArray(int nums[],int start,int end)
        {
            while(start<end)
            {
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
            }
        }  
}
