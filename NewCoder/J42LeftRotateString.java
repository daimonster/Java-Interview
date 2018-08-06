public class Solution {
    public String LeftRotateString(String str,int n) {
        if(str.length() < n) return str;
        String tempStr = str + str;
        return tempStr.substring(n,str.length() + n);
    }
}