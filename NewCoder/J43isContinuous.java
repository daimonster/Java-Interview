import java.util.Arrays;

public class Solution {
    public boolean isContinuous(int [] numbers) {
        if(numbers == null || numbers.length < 1) return false;
        Arrays.sort(numbers);
        int numOfZero = 0;
        int numOfGap = 0;
        for(int i = 0; i < numbers.length && numbers[i] == 0; i++) numOfZero++;
        for(int i = numOfZero; i < numbers.length - 1;i++){
            if(numbers[i] == numbers[i + 1]) return false;
            if(numbers[i] + 1 != numbers[i + 1]) numOfGap += (numbers[i + 1] 
            - numbers[i] - 1);
        }
        return numOfZero >= numOfGap ? true : false;
    }
}