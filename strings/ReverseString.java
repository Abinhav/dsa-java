/*
Problem:
Given a string, reverse the characters and return the reversed string.

Approach:
- Convert string to character array
- Use two pointers (start & end)
- Swap characters until pointers meet

Time Complexity: O(n)
Space Complexity: O(n)
*/

class ReverseString {

    public static String reverse(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        return new String(arr);
    }

    // For testing
    public static void main(String[] args) {
        String input = "hello";
        System.out.println(reverse(input)); // output: olleh
    }
}
