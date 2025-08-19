class Solution {
    public boolean isPalindrome(int n) {
        int rev = 0, m = n;
        while(m > 0) {
            rev = rev*10 + m%10;
            m /= 10;
        }
        return n == rev;
    }
}