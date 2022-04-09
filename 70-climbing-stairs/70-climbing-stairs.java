class Solution {
    public int climbStairs(int n) {
      int[][] arr = new int[46][46];
      return solution(n, 0, arr);
    }
  
    public int solution(int n, int cur, int[][] arr) {
      if ((n - cur) < 0) return 0;
      if ((n - cur) == 0) return 1;
      
      if (arr[n][cur] != 0) return arr[n][cur];
      
      return arr[n][cur] = solution(n, cur + 1, arr) + solution(n, cur + 2, arr);
    }
}