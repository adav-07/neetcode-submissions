class MinStack {
    Stack<int[]> stack;
    int min;
    public MinStack() {
        stack=new Stack<>();
        min=Integer.MAX_VALUE;
    }
    
    public void push(int value) {
        if(stack.isEmpty()){
            int[] arr={value,value};
            stack.push(arr);
            min=value;
        }
        else{
            int[] peek=stack.peek();
            min=Math.min(value, peek[1]);
            int[] arr={value,min};
            stack.push(arr);
        }
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        int[] arr=stack.peek();
        return arr[0];
    }
    
    public int getMin() {
        int[] arr=stack.peek();
        return arr[1];
    }
}
