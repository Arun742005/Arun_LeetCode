class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] word = s.split(" ");
        if(word.length != pattern.length()) return false;

        Map<Character , String> charToWord = new HashMap<>();
        Map<String , Character> wordToChar = new HashMap<>();

        for(int i=0; i<pattern.length(); i++){

            String w = word[i];
            char c = pattern.charAt(i);

            if(charToWord.containsKey(c)){
                if(!charToWord.get(c).equals(w)) return false;
            }else{
                charToWord.put(c,w);
            }
            
            if(wordToChar.containsKey(w)){
                if(wordToChar.get(w) != c) return false;
            }else{
                wordToChar.put(w,c);
            }
            
        }
      return true;
    }
}