class Solution {
    public int beautySum(String s) {
        int total=0;

        for(int i=0;i<s.length();i++){
            int[] freq = new int[26];
            for(int j=i; j<s.length(); j++){
                freq[s.charAt(j) - 'a']++;
                total+=beauty(freq);
            }
        }
        return total;
        
    }
    public int beauty(int[]freq){
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int f: freq){
            if(f == 0) continue;
            max = Math.max(max,f);
            min = Math.min(min,f);
        }
        return max-min;
    }
}