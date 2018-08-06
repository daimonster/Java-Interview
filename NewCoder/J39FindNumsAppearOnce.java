//一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字
//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array == null && array.length <= 0) return;
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            temp ^= array[i];
        }
        int first1BitFromRight = Findfirst1(temp);
        int temp1 = 0;
        int temp2 = 0;
        for (int i = 0; i < array.length; i++) {
            if(Is1bit(array[i], first1BitFromRight)) temp1 ^= array[i];
            else temp2 ^= array[i];
        }
        num1[0] = temp1;
        num2[0] = temp2;
        
    }

    private int Findfirst1(int num){
        int index = 0;
        while((num & 1) == 0){
            index+=1;
            num = num >> 1;
        }
        return index;
    }
    private Boolean Is1bit(int num,int first1bit){
        num = num >> first1bit;
        return (num&1) == 1 ? true : false;
    }
}