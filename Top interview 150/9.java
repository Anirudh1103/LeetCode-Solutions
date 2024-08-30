class Solution {
    public boolean isPalindrome(int x) {
        boolean flag =false;
        String s_x = String.valueOf(x),checker="";
        for(int i=s_x.length()-1;i>=0;i--)
            checker += s_x.charAt(i);
        for(int i=0;i<s_x.length();i++)
        {
            if(s_x.charAt(i) == checker.charAt(i))flag = true;
            else
            {
                flag = false;
                break;
            }
        }
        return flag;
        
    }
}