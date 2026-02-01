/*
Problem:
Check whether a given string is a valid palindrome
considering only alphanumeric characters and ignoring case.

Approach:
- Use two pointers (left & right)
- Skip non-alphanumeric characters
- Compare characters ignoring case

Time Complexity: O(n)
Space Complexity: O(1)
*/

class ValidPalindrome {

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) !=
                Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(input)); // Output: true
    }
}
