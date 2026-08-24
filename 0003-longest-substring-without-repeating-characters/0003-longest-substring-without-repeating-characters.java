class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] lastseen = new int[128];
        int left = 0;
        int maxLength = 0;
        Arrays.fill(lastseen, -1);

        for(int right = 0; right<s.length(); right++) {
            char ch = s.charAt(right);

            if(lastseen[ch]>=left){
                left = lastseen[ch] +1;
            }
            lastseen[ch] = right;
            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
}