class Solution {
    public void reverseString(char[] s) {
        int j = s.length-1;
        for(int i=0; i<=j; i++) {
            char character = s[i];
            s[i] = s[j];
            s[j] = character;
            j--;
        }
    }
}