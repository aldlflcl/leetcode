class Solution {
    public int removeDuplicates(int[] nums) {
        int tmp = nums[0];

        boolean flag = false;
        int count = 0;
        int length = 0;

        for (int i = 1; i < nums.length; i++) {
            if (tmp > nums[i]) break;
            if (nums[i] == tmp) {
                flag = true;
                count++;
                continue;
            }
            if (flag) {
                for (int j = i; j < nums.length; j++) {
                    nums[j - count] = nums[j];
                }
                i -= count;
                count = 0;
                flag = false;
            }
            tmp = nums[i];
            length++;
        }
        return length + 1;

    }
}