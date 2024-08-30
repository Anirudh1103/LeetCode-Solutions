class Solution {
    public boolean isHappy(int n) {
        int count =0;
        while(n!=1) {
            String num = String.valueOf(n);
            int temp = 0;
            for (int i = 0,curr_num = 0; i < num.length(); i++) {
                temp = Integer.valueOf(num.charAt(i) - '0');
                curr_num += temp * temp;
                n = curr_num;
            }
            count++;
            if(count == 100)break;
        }

        return n == 1;
        
    }
}