class Solution {
    public int[] topKFrequent(int[] nums, int k) {
 // Step 1: Count frequency
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create buckets
        List<Integer>[] buckets = new List[nums.length + 1];

        for (int num : freq.keySet()) {
            int frequency = freq.get(num);

            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }

            buckets[frequency].add(num);
        }

        // Step 3: Traverse buckets from highest frequency
        int[] result = new int[k];
        int index = 0;

        for (int frequency = buckets.length - 1;
             frequency >= 0 && index < k;
             frequency--) {

            if (buckets[frequency] != null) {

                for (int num : buckets[frequency]) {
                    result[index++] = num;

                    if (index == k) {
                        break;
                    }
                }
            }
        }

        return result;
    }
}