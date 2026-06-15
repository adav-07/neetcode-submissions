class KthLargest {
    PriorityQueue<Integer> pq;
    int k;
    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>();
        this.k=k;
        initialize(pq, nums);
    }

    private void initialize(PriorityQueue<Integer> pq, int[] nums){
        for(int num:nums){
            add(num);
        }
    }
    
    public int add(int val) {
        pq.add(val);
        if(pq.size()>k){
            pq.remove();
        }

        return pq.peek();
    }
}
