class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token : tokens){
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                int b = stack.pop();
                int a = stack.pop();
                int res;
                switch(token){
                    case"+" : res = a+b; break;
                    case"-" : res = a-b; break;
                    case"*" : res = a*b; break;
                    default : res = a/b; break;
                }
                stack.push(res);
            }
            else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}