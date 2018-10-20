package bin.newcoder.test;
import java.util.HashMap;
import java.util.*;
import java.util.Map;
import java.util.Arrays;
class Solution {
    Map<Character,Integer> temp=new HashMap<Character,Integer>();
    StringBuilder charlist = new StringBuilder(); 
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        charlist.append(ch);
        if(temp.containsKey(ch) == false){
            temp.put(ch,1);
        }else{
            temp.put(ch,2);
        }
    }

  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        char res = '#';
        for (int i = 0; i < charlist.length(); i++) {
            if(temp.get(charlist.charAt(i))!=2){
                res = charlist.charAt(i);
                break;
            }
        }
        return res;
    }

}

public class J45FirstAppearingOnce {

    public static void main(String[] args) {
        char[] test = {'g','o','o','g','l','e','f','a'};
        Solution aa = new Solution();
        for (int i = 0; i < test.length ; i++) {
            aa.Insert(test[i]);
        }
        System.out.println(aa.FirstAppearingOnce());
     }
}