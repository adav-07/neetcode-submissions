class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int a,b;
        for(String s:operations){
            if(s.equals("D")){
                a=stack.peek();
                stack.push(a*2);
            }
            else if(s.equals("C")){
                stack.pop();
            }
            else if(s.equals("+")){
                a=stack.pop();
                b=stack.peek();
                stack.push(a);
                stack.push(a+b);
            }
            else{
                stack.push(Integer.parseInt(s));
            }
        }

        int count=0;
        while(!stack.isEmpty()){
            count+=stack.pop();
        }
        return count;
    }
}