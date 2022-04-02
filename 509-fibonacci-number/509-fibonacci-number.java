class Solution {
  
  private static int[] arr = new int[31];
  
    public int fib(int n) {
        
      
      
      return fibonacci(n);
    }
  
    
    static int fibonacci(int num) {
      if (num == 0) return 0;
      if (num < 3) return 1;
      
      if (arr[num] != 0) return arr[num];
      
      
      
      return arr[num] = fibonacci(num - 1) + fibonacci(num - 2);
    }
}