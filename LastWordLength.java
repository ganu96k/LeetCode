public class LastWordLength {
    public static int lengthOfLastWord(String s) {
        // Remove trailing spaces from the string
        s = s.trim();
        // Find the last space in the string
        int lastSpaceIndex = s.lastIndexOf(' ');
        // Calculate the length of the last word
        return s.length() - lastSpaceIndex - 1;
    }

    public static void main(String[] args) {
        // Example 1
        String s1 = "Hello World";
        System.out.println("Output: " + lengthOfLastWord(s1)); // Output: 5

        // Example 2
        String s2 = "   fly me   to   the moon  ";
        System.out.println("Output: " + lengthOfLastWord(s2)); // Output: 4

        // Example 3
        String s3 = "luffy is still joyboy";
        System.out.println("Output: " + lengthOfLastWord(s3)); // Output: 6
    }
}
