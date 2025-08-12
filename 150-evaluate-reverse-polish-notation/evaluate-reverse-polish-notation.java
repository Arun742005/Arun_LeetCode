class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token : tokens){
            if("+-/*".contains(token)){
                int b = stack.pop();
                int a = stack.pop();
                int res = token.equals("+") ? a+b 
                        : token.equals("-") ? a-b 
                        : token.equals("*") ? a*b 
                        :a/b;
                
                stack.push(res);
            }
            else{
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}