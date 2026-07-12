class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while(i<j) {
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else{
                return (isPallindrome(s, i+1, j) || isPallindrome(s, i, j-1));
            }
        }
        return true;
    }
    private static boolean isPallindrome(String s, int left, int right) {
        while(left<right) {
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}