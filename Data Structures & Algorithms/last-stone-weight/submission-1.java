class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        for(int stone:stones){
            pq.add(stone);
        }

        while(pq.size()!=1 && pq.size()!=0){
            int a = pq.remove();
            int b = pq.remove();
            if(a!=b){
                pq.add(Math.abs(a-b));
            }
        }

        if(pq.size()==0){
            return 0;
        }
        return pq.remove();
    }
}
