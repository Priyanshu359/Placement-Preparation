class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        int i = s.length() - 1;

        while(i>=0){
            while(i>=0 && s.charAt(i)==' '){
                i--;
            }
            if(i<0) {
                break;
            }

            int j = i;
            while(j>=0 && s.charAt(j)!=' '){
                j--;
            }

            if(result.length()>0){
                result.append(" ");
            }
            result.append(s, j+1, i+1);
            i=j;
        }
        return result.toString();
    }
}