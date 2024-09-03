class Solution {
    public int maximumWealth(int[][] accounts) {
        int curr_val=0;
        for(int row=0;row< accounts.length;row++) {
            int sum = 0;
            for (int col = 0; col < accounts[row].length; col++)
                sum+=accounts[row][col];
            if(sum>curr_val)
                curr_val = sum;

        }
        return curr_val;
    }
}