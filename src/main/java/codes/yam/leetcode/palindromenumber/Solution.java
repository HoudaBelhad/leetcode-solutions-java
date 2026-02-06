package codes.yam.leetcode.palindromenumber;


/**
 * <p>Solution for the <b>Palindrome Number</b> problem.</p>
 * <ul>
 * <li><b>Time Complexity:</b> <code>O(log10(n))</code></li>
 * <li><b>Space Complexity:</b> <code>O(1)</code></li>
 * </ul>
 */
class Solution {
    /**
     * Checks if an integer is a palindrome.
     *
     * @param x The integer to check.
     * @return true if x is a palindrome, false otherwise.
     */
    public boolean isPalindrome(int x) {
        if (x < 0) return false;

        int reversed = 0;
        int original = x;
        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return original == reversed;
    }
}