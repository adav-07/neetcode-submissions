class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        int a,b;
        for(String c:tokens){
            if(c.equals("+")){
                b=stack.pop();
                a=stack.pop();
                stack.push(a+b);
            }
            else if(c.equals("-")){
                b=stack.pop();
                a=stack.pop();
                stack.push(a-b);
            }
            else if(c.equals("*")){
                b=stack.pop();
                a=stack.pop();
                stack.push(a*b);
            }
            else if(c.equals("/")){
                b=stack.pop();
                a=stack.pop();
                stack.push(a/b);
            }
            else{
                stack.push(Integer.parseInt(c));
            }
        }
        return stack.pop();
    }
}
