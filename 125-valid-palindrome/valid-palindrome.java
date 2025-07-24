class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right = s.length()-1;

        while(left < right){
            while(left < right && !isAlphabet(s.charAt(left))){
                left++;
            }
            while(left < right && !isAlphabet(s.charAt(right))){
                right--;
            }

            char leftChar =Character.toLowerCase(s.charAt(left));
            char rightChar =Character.toLowerCase( s.charAt(right));

            if(leftChar != rightChar){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean isAlphabet(char ch){
        return( (ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9'));
        
    }

}