class Solution {
  
    //T0 = 0, T1 = 1, T2 = 1, T3 = 2  
  
    public int tribonacci(int n) {
      
        int[] memo = new int[38];
        return tribo(n, memo);
    }
  
    public int tribo(int n, int[] arr) {
      if (n == 0) return 0;
      if (n < 3) return 1;
      
      if (arr[n] != 0) return arr[n];
      
      return arr[n] = tribo(n - 3, arr) + tribo(n - 2, arr) + tribo(n - 1, arr);
    }
}