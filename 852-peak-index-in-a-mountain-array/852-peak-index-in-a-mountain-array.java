class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
      int max = Integer.MIN_VALUE;
      int result = 0;
      
      for (int i = 0; i < arr.length; i++) {
        if (max < arr[i]) {
          max = arr[i];
          result = i;
        }
      }
      return result;
    }
}