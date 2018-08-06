class Solution {
    public int InversePairs(int [] array) {
        if(array == null || array.length == 0) return 0;
        int [] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return InverseCore(array,copy,0,array.length - 1);
    }
    private int InverseCore(int[] array,int[] copy,int low,int high) {
        if(low == high) return 0;
        int mid = (low + high)/2;
        int leftCount = InverseCore(array, copy, low, mid)%1000000007;
        int rightCount = InverseCore(array, copy, mid + 1, high)%1000000007;
        int count = 0;
        int i = mid;
        int j = high;
        int locCopy = high;
        while (i >= low && j > mid) {
            if (array[i] > array[j]) {
                count += j - mid;
                copy[locCopy--] = array[i--];
                if(count>=1000000007) count %= 1000000007;
            }
            else copy[locCopy--] = array[j--];
        }
        for (; i >= low; i--) {
            copy[locCopy--] = array[i];
        }
        for(; j > mid ; j--){
            copy[locCopy--] = array[j];
        }
        for(int s=low;s<=high;s++)
        {
            array[s] = copy[s];
        }
        return (leftCount + rightCount + count) % 1000000007;
    }
    
}
/**
 * J35InversePairs
 */
public class J35InversePairs {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,0};
        Solution test = new Solution();
        System.out.println(test.InversePairs(array));
    }
}