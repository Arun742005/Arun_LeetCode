class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0,end=0;
        int maxLen=0;
        int[] charMap = new int[128];


        while(end < s.length()){

            char current = s.charAt(end);
            if(charMap[current] == 0){
                charMap[current]= 1;
                maxLen = Math.max(maxLen , end-start+1);
                end++;
            }
            else{
                charMap[s.charAt(start)] = 0;
                start++;
            }  
        }
        return maxLen;
    }
}