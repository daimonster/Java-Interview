import java.util.ArrayList;
import java.util.List;

class Solution {
    public int GetUglyNumber_Solution(int index) {
        if(index <= 0) return 0;
        int num2 = 0;
        int num3 = 0;
        int num5 = 0;
        List<Integer> uglyNumList = new ArrayList<Integer>();

        uglyNumList.add(1);

        while(uglyNumList.size() < index){
            int min = Min(uglyNumList.get(num2) * 2,uglyNumList.get(num3) * 3,
                uglyNumList.get(num5) * 5);
            uglyNumList.add(min);
            while(min >= uglyNumList.get(num2) * 2) num2++;
            while(min >= uglyNumList.get(num3) * 3) num3++;
            while(min >= uglyNumList.get(num5) * 5) num5++;
        }
        this.showList(uglyNumList);
        return uglyNumList.get(uglyNumList.size() - 1);
    }
    private int Min(int a,int b,int c){
        int min = a < b ? a:b;
        return min < c ? min : c;
    }

    private void showList(List<Integer> list) {
        for(int i = 0;i < list.size();i++){
            System.out.print(list.get(i).toString() + " ");
        }
        System.out.println();
    }
}

/**
 * J33GetUglyNumber
 */
public class J33GetUglyNumber {

    public static void main(String[] args) {
        Solution test = new Solution();
        int res = test.GetUglyNumber_Solution(7);
        System.out.println(res);
    }
}