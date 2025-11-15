class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n1 = word1.length() , n2 = word2.length();
        int max = Math.max(n1,n2);
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<max; i++){
            if(i<n1) sb.append(word1.charAt(i));
            if(i<n2) sb.append(word2.charAt(i));
        }
        return sb.toString();
    }
}