import static org.junit.Assert.*;
import org.junit.Test;

public class PalindromeUtilsTest {
    @Test
    public void testIsPalindrome_Palindrome() {
        assertTrue(PalindromeUtils.isPalindrome("madam"));
    }

    @Test
    public void testIsPalindrome_NotPalindrome() {
        assertFalse(PalindromeUtils.isPalindrome("hello"));
    }

    @Test
    public void testIsPalindrome_NullInput() {
        assertFalse(PalindromeUtils.isPalindrome(null));
    }

    @Test
    public void testIsPalindrome_EmptyString() {
        assertTrue(PalindromeUtils.isPalindrome(""));
    }
}