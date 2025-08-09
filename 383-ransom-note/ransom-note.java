class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       
       if(magazine.length() < ransomNote.length()) return false;

       int[] count = new int[26];

       for(int i=0; i<magazine.length(); i++){
        count[magazine.charAt(i) - 'a']++;
       }

       for(int i=0; i<ransomNote.length(); i++){
        int index = ransomNote.charAt(i) - 'a';
        if(--count[index] < 0) return false;
       }
       return true;
    }
}