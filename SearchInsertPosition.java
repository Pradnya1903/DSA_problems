/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. 
If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity
*/

class Solution {
    public int searchInsert(int[] nums, int target) {
       int i=0;
       for( i=0;i<nums.length;i++)
       {
           if(nums[i]==target)
           {
               break;
            
           }

           if(nums[i]>target)
           {
             nums[i]=target;
             break;
             
           }
       }
    
      return i;
    }
}
