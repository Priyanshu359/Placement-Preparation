class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0], b[0]));
        List<int[]> result = new ArrayList<>();
        int[] last = intervals[0];
        result.add(last);
        for(int i=1; i<intervals.length; i++){
            int[] curr = intervals[i];
            if(curr[0] <= last[1]){
                last[1] = Math.max(last[1], curr[1]);
            }
            else{
                last = curr;
                result.add(last);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}