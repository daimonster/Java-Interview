import java.util.Arrays;

class Solution {
    public int GetNumberOfK(int [] array , int k) {
        int length = array.length;
        if(length == 0) return 0;
        int snum = this.getFirstnum(array, 0, length - 1, k);
        int lnum = this.getLastnum(array, 0, length - 1, k);
        if(lnum > -1 && snum > -1 )return lnum - snum + 1;
        else return 0;
    }
    public int getFirstnum(int [] array,int start,int end,int k){
        // int length = array.length;
        int midIndex = (start + end) / 2;
        // int midnum = array[midIndex];
        while (start <= end) {
            if(array[midIndex] > k) end = midIndex - 1;
            else if(array[midIndex] < k) start = midIndex + 1;
            else if(midIndex > 0 && array[midIndex - 1] == k ) end = midIndex - 1;
            else return midIndex;
            midIndex = (start + end) / 2;
        }
        return -1;
    }
    public int getLastnum(int [] array,int start,int end,int k){
        int length = array.length;
        int midIndex = (start + end) / 2;
        while (start <= end) {
            if(array[midIndex] > k) end = midIndex - 1;
            else if(array[midIndex] < k) start = midIndex + 1;
            else if(midIndex < length - 1 && array[midIndex + 1] == k ) start = midIndex + 1;
            else return midIndex;
            midIndex = (start + end) / 2;
        }
        return -1;
    }
}

/**
 * J37GetNumberOfK
 */
public class J37GetNumberOfK {

    public static void main(String[] args) {
        Solution test = new Solution();
        int [] array = {1,2,3,3,3,3,4,5};
        int start = test.getFirstnum(array, 0, 7, 3);
        int last = test.getLastnum(array, 0, 7, 3);
        //int res = test.GetNumberOfK(array, 3);
        System.out.println(start + " " + last);// + " " + last + res);

    }
}