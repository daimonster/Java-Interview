package bin.newcoder.findcontinuoussequence;
import java.util.ArrayList;
class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer> > ContinuousSeq = new ArrayList<ArrayList<Integer> >();
        for (int i = (int)(sum/2 + 1); i >= 2; i--) {
            if((2 * sum + i - i * i) % (2 * i) == 0){
                int start = (2 * sum + i - i * i) / (2 * i);
                if(start > 0){
                    for (int j = 0; j < i; j++) {
                        num.add(start + j);
                    }
                }
            }
            if (num.size() > 0 && num != null) {
                ContinuousSeq.add(new ArrayList<Integer>(num) );
                num.clear();
            }
        }
        return ContinuousSeq;
    }
}

public class J40FindContinuousSequence{
    public static void main(String[] args) {
        Solution test = new Solution();
        int target = 3;
        ArrayList<ArrayList<Integer> > res = test.FindContinuousSequence(target);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }
}