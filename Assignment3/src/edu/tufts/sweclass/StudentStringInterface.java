package edu.tufts.sweclass;

/**
 * This is an interface for a simple class that represents a string, defined
 * as a sequence of characters.
 *
 * This interface should NOT be altered in any way.
 */
public interface StudentStringInterface {

    /**
     * Returns the current string.
     * If the string is null, or has not been set to a value, it should return null.
     *
     * @return Current string
     */
    String getString();

    /**
     * Sets the value of the current string
     *
     * @param string The value to be set
     */
    void setString(String string);

    /**
     * Returns the number of numbers in the current string, where a number is defined as a
     * contiguous (i.e., uninterrupted) sequence of digits.
     * 
     * If the current string is null or empty, the method should return 0.
     * 
     * Examples:
     * - countNum would return 2 for string "The numbers are 2200 and 7".
     *
     * @return Number of numbers in the current string
     */
    int countNum();

    /**
     * Rotates every substring of n characters in the current string and returns the resulting string.
     * If 'right' is true, each substring of n characters should be shifted one place right, with the n-th character
     * becoming the first character in the resulting substring. Otherwise, if 'right' is false, the characters should be
     * shifted one place to the left, with the first character becoming the n-th character in the resulting substring.
     * In case the length of the current string ia not a multiple of n, the last partial substring should also be shifted
     * in an analogous way.
     *
     * Examples:
     * - For n=2 and right=true, "hello all, bye all" would be converted to "ehll ola,lb eya ll".
     * - For n=4 and right=true, "1234567890" would be converted to "4123856709".
     * - For n=2 and right=false, "hello all, bye all" would be converted to "ehll ola,lb eya ll".
     * - For n=4 and right=false, "1234567890" would be converted to "2341678509".
     *
     * @param n Size of substring of characters to rotate
     * @param right Boolean that indicates whether characters rotate to the right (vs the left)
     * @return String with the original string's characters rotated in sets of n size
     * @throws NullPointerException     If the current string is null
     * @throws IllegalArgumentException If n <=0 (and the current string is not null)
     */
    String rotateChar(int n, boolean right);
}
