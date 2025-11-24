class Solution {
    public int maxVowels(String s, int k) {
        int currentcount = 0, maxcount = 0;

        boolean[] isVowel = new boolean[128];
        isVowel['a'] = isVowel['e'] = isVowel['i'] = isVowel['o'] = isVowel['u'] = true;

        for(int i=0; i<k; i++){
            if(isVowel[s.charAt(i)]) currentcount++;
        }
        maxcount = currentcount;

        for( int right = k; right < s.length(); right++){
            int left = right - k;

            if(isVowel[s.charAt(left)]) currentcount--;

            if(isVowel[s.charAt(right)]) currentcount++;

            maxcount = Math.max( maxcount , currentcount);
        }
        return maxcount;
    }
}