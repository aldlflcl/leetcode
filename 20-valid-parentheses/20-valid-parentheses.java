class Solution {
  
    public boolean isValid(String s) {
        
      char[] chArr = s.toCharArray();
      
      Stack<Character> stack = new Stack<>();
      
      for (int i = 0; i < chArr.length; i++) {
        char c = chArr[i];
        
        if (c == '(' || c == '{' || c == '[') {
          stack.push(c);
          continue;
        }
        
        if (stack.size() > 0) {
          char pop = stack.pop();

          if (c == ')') {
            if (pop != '(')
              return false;
          }

          if (c == '}') {
            if (pop != '{')
              return false;
          }

          if (c == ']') {
            if (pop != '[')
              return false;
          }
        } else
          return false;
        
      }
      return stack.size() == 0;
    }
}