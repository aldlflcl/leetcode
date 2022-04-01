class Solution {
    
    public int search(int[] nums, int target) {
        
        int sIdx = 0;
        int eIdx = nums.length - 1;
        
        while (eIdx >= sIdx) {
            int now = (eIdx + sIdx) / 2;
            if (nums[now] == target) return now;
            
            if (nums[now] < target) {
                sIdx = now + 1;
            } else {
                eIdx = now - 1;
            }
        }
        
        return -1;
    }
}