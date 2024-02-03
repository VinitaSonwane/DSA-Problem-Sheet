class Solution {
    public boolean isPalindrome(String s) {
        // Convert the string to lower case and remove non-alphanumeric characters
        String filteredString = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        int n = filteredString.length();
        for (int i = 0; i < n / 2; i++) {
            if (filteredString.charAt(i) != filteredString.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
