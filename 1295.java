class Solution {
    public int findNumbers(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++)
        {
            int count=0,temp = nums[i];
            while(temp!=0)
            {
                temp= temp/10;
                count++;
            }
            if(count%2==0)
                ans++;
        }
        return ans;
    }
}