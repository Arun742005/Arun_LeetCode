class Solution {
    public String minWindow(String s, String t) {

        Map<Character,Integer>targetCount = new HashMap();
        Map<Character,Integer>windowCount = new HashMap();

         for( char c : t.toCharArray()){
            targetCount.put(c,targetCount.getOrDefault(c,0)+1);
        }

        int left=0,right=0;
        int minLen = Integer.MAX_VALUE;
        int formed=0;
        int start=0;
        int required = targetCount.size();

        while(right < s.length()){
            char c = s.charAt(right);
            windowCount.put(c,windowCount.getOrDefault(c,0)+1);

            if(targetCount.containsKey(c) && 
            windowCount.get(c).intValue() == targetCount.get(c).intValue()){
                formed++;
            }

            while(left <= right && formed == required){
                if(right - left + 1 < minLen){
                minLen = right - left + 1;
                start = left;
                }

           char ch = s.charAt(left);
           windowCount.put(ch,windowCount.get(ch)-1);
           if(targetCount.containsKey(ch) &&
            windowCount.get(ch).intValue() < targetCount.get(ch).intValue()){
            formed--;
           }
           left++;
        }
        right++;
        }
        
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start,start+minLen);       
    }
}