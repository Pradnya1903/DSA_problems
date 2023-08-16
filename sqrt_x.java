/*
Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.


*/




/*Time complexity:
O(logn)

Space complexity:
O(1)
*/


class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1)
        {
            return x;
        }
        int start=1;
        int mid=-1;
        int end=x;
        while(start<=end)
        {
            mid=start+(end-start)/2;

            if(mid*mid>x)
            {
              end=mid-1;
            }
            else if(mid*mid==x)
            {
                return mid;
            }
            else
            {
                start=mid+1;
            }
        }
        return end;
    }
}
