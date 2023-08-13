/*  
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, 
which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII.
Instead, the number four is written as IV. Because the one is before the five we subtract it making four. 
The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

*/
class Solution {
    public int romanToInt(String s) {

    Map<Character,Integer>m=new HashMap<>();
    m.put('I',1);
    m.put('V',5);
    m.put('X',10);
    m.put('L',50);
    m.put('C',100);
    m.put('D',500);
    m.put('M',1000);


int ans=0;
for(int i=0;i<s.length();i++)
{
if(i<s.length()-1 && m.get(s.charAt(i))<m.get(s.charAt(i+1)))
{
ans-=m.get(s.charAt(i));
} 
else 
{
ans+=m.get(s.charAt(i)); 
}
}
     return ans;   
    
}
}
