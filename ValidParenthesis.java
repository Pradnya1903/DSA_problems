/*
Time complexity:
The time complexity of the solution is O(n)O(n)O(n), where n is the length of the input string. 
This is because we traverse the string once and perform constant time operations for each character.

Space complexity:
The space complexity of the solution is O(n)O(n)O(n), where n is the length of the input string. 
This is because the worst-case scenario is when all opening brackets are present in the string and the stack will have to store them all
*/

class Solution {
    public boolean isValid(String s) {
        Stack<Character>stack=new Stack<Character>();

        for(char c:s.toCharArray())
        {
            if(c=='(' || c=='[' || c=='{')
            {
             stack.push(c);
            }
              else
            {
                 if(stack.isEmpty())
                 {
                     return false;
                 } 
                 char top=stack.peek();
                 if((c==')'&& top=='(' ) || ( c==']'&& top=='[') || (c=='}'&& top=='{'))
                 {
                    stack.pop();
                  }
                  else
                  {
                      return false;
                  }

            }


        }
        return stack.isEmpty();
    }
}
