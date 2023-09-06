//Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.

class Solution {
    public boolean repeatedSubstringPattern(String s) {
   String concat=s+s;
   
   return concat.substring(1,concat.length()-1).contains(s);

    }
}
 
