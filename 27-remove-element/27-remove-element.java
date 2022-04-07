class Solution {
    public int removeElement(int[] nums, int val) {
        
      int[] result = new int[nums.length];
        int idx = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                result[idx++] = nums[i];
            }
        }

        for (int i = 0; i < result.length; i++) {
            nums[i] = result[i];
        }

        return idx;
    }
}