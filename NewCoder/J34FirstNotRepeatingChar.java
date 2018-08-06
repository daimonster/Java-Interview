import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int FirstNotRepeatingChar(String str) {
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                int temp = map.get(c);
                temp++;
                map.put(c, temp);
            }
            else map.put(c, 1);
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(map.get(c) == 1) return i;
        }
    return -1;
    }
}