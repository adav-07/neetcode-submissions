/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        int n = intervals.size();
        if(n==0){
            return true;
        }

        Collections.sort(intervals, new IntervalComparator());
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;

        for(int i=1;i<n;i++){
            Interval interval = intervals.get(i);
            if(interval.start<end){
                return false;
            }
            start = interval.start;
            end = interval.end;
        }
        return true;
    }
}

class IntervalComparator implements Comparator<Interval>{
    public int compare(Interval i1, Interval i2){
        return i1.start-i2.start;
    }
}
