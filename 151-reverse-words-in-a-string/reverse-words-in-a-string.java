class Solution {
    public String reverseWords(String s) {

        char[] ch = s.toCharArray();
        int n = ch.length;

        reverse(ch ,0,n-1);
        
        int i=0,j=0;
        StringBuilder sb = new StringBuilder();

        while(i<n){
            while(i<n && ch[i] == ' ') i++;
            if(i >= n) break;

        j=i;
        while(j<n && ch[j]!=' ')  j++;
        
        reverse(ch,i,j-1);

        if(sb.length() >0) sb.append(" ");
        sb.append(ch,i,j-i);

        i=j;
    }
        return sb.toString();

        // String[] word = s.trim().split("\\s+");

        // StringBuilder sb = new StringBuilder();
        // for(int i=word.length-1; i>=0; i--){
        //     sb.append(word[i]);
        //     if(i != 0) sb.append(" ");
        // }
        // return sb.toString();
    }

public void reverse(char[] chars,int left , int right){
    while(left < right){
        char temp = chars[left];
        chars[left++] = chars[right];
        chars[right--] = temp;
    }
}
}