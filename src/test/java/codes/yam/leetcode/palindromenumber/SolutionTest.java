package codes.yam.leetcode.palindromenumber;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
    private final Solution solution = new Solution();

    @Test
    @DisplayName("Check if 121 is a palindrome")
    public void testPositiveCase() {
        assertTrue(solution.isPalindrome(121), "121 should be palindrome");
    }

    @Test
    @DisplayName("Check if 221 is not a palindrome")
    public void testNegativeCase() {
        assertFalse(solution.isPalindrome(221), "221 should not be palindrome");
    }
}
