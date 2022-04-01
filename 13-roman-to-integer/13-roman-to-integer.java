class Solution {
    
    static char[] symbol = new char[]{'I', 'V', 'X', 'L', 'C', 'D', 'M'};
    static int[] nums = new int[]{1, 5, 10, 50, 100, 500, 1000};
    
    public int romanToInt(String s) {
        
        char[] chArr = s.toCharArray();
        int answer = 0;
        int tmp = 0;
        
        for (int i = chArr.length - 1; i >= 0; i--) {
            
            char c = chArr[i];
            
            for (int j = 0; j < symbol.length; j++) {
                if (c != symbol[j]) continue;
                if (tmp <= nums[j]) {
                    answer += nums[j];
                    tmp = nums[j];
                } else {
                    answer -= nums[j];
                }
                break;
            }
            
        }
        
        return answer;
    }
}