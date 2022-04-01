class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x == 0) return true;
        
        int n = x;
        int res = 0;
        int i = 0;
        while (x > 0) {
            res *= 10;
            int temp = x % 10;
            res += temp;
            x /= 10;
        }
        
        return (n == res);
    }
}