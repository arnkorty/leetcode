import java.util.*;

public class MergeIntervals {
    public class Interval {
      int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }
    }
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> res = new ArrayList<>();
        if(intervals.size() == 0)
            return res;

        // sort the intervals list according to start
        Collections.sort(intervals, new Comparator<Interval>(){
            public int compare(Interval a, Interval b)
            {
                return a.start - b.start;
            }
        });;

        // get first one
        Interval temp = intervals.get(0);

        // if intervals only has one element
        if(intervals.size() == 1)
        {
            res.add(temp);
            return res;
        }

        // iterate intervals from [1] to end
        for(int i=1; i<intervals.size(); i++)
        {
            // case 1: if temp interval end >= this interval start ->
            //            merge tempStart, max(tempEnd, thisEnd) and make this merge one as new temp;
            if(temp.end >= intervals.get(i).start)
            {
                temp.end = Math.max(temp.end, intervals.get(i).end);
            }
            // case 2: if temp interval is not overlapping this interval ->
            //            add temp into list and make this new temp
            else
            {
                res.add(temp);
                temp = intervals.get(i);
            }
        }
        // add the last temp into list
        res.add(temp);


        return res;
    }

    public static void main(String[] args) {

    }
}
