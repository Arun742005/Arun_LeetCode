class Solution {
    public String decodeString(String s) {
        Stack<Integer> numstack = new Stack<>();
        Stack<String> strstack = new Stack<>();
        int currentnum = 0;
        String currentstr = "";

        for(char ch: s.toCharArray()){

            if(Character.isDigit(ch)){
                currentnum = currentnum *10 + (ch - '0') ;
            }
            else if(Character.isLetter(ch)){
                currentstr += ch;
            }
            else if(ch =='['){
                numstack.push(currentnum);
                strstack.push(currentstr);
                currentnum = 0;
                currentstr = "";
            }
            else if(ch ==']'){
                int repeat = numstack.pop();
                String prev = strstack.pop();
                StringBuilder sb = new StringBuilder(prev);

                for(int i=0; i<repeat; i++){
                    sb.append(currentstr);
                }
                currentstr = sb.toString();
            }
        }
        return currentstr;
    }
}