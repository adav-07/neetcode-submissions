class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<int[]>(new OriginComparator());
        int i,m=points.length;
        for(i=0;i<m;i++){
            pq.add(points[i]);
        }

        int[][] array=new int[k][2];
        for(i=0;i<k;i++){
            array[i]=pq.remove();
        }
        return array;
    }

    class OriginComparator implements Comparator<int[]>{
        public int compare(int[] a, int[] b){
            double val1=Math.sqrt((a[0]*a[0])+(a[1]*a[1]));
            double val2=Math.sqrt((b[0]*b[0])+(b[1]*b[1]));
            if(val1>val2){
                return 1;
            }
            else{
                return -1;
            }
        }
    } 
}
