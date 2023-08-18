/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, 
  it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.
  
Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
*/

class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int n=s.length();
        
         for(int i=0;i<n/2;i++)
         {
          if(s.charAt(i)!=s.charAt(n-1-i))
          {
              return false;
          }
         }
         return true ;
    }
}
