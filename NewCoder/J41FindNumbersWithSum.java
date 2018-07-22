package bin.j41;
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        int begin = 0;
        int end = array.length - 1;
        return findNumbers(array, sum, begin, end);
    }
    private ArrayList<Integer> findNumbers(int [] array,int sum, int begin, int end ){
        ArrayList<Integer> twoNums = new ArrayList<Integer>();
        if(array == null || array.length <= 0) return twoNums;
        while(begin < end){
            int plussum = array[begin] + array[end];
            if(plussum == sum){
                twoNums.add(array[begin]);
                twoNums.add(array[end]);
                return twoNums;
            }
            else if(plussum > sum) end--;
            else begin++;
        }
        return twoNums;
    }
}