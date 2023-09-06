/*
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
You must write an algorithm that runs in O(n) time.
*/

class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer>h=new HashSet<>();
       int max=0,longest=0,ans=0;
       for(int i:nums)
       {
           h.add(i);
       }
       for(int i:nums)
       {
           if(!h.contains(i-1))
           {
               max=1;
               longest=i;
               while(h.contains(long+1))
               {
                   max+=1;
                   longest=+=1;
               }
           }
          ans=Math.max(max,ans);
       }
       return ans;
    }
}
