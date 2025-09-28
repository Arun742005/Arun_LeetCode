import java.util.*;

class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        
        int longest = 0;
        for (int key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                int length = map.get(key) + map.get(key + 1);
                longest = Math.max(longest, length);
            }
        }
        
        return longest;
    }
}

