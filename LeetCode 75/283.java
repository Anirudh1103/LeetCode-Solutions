class Solution {
    public void moveZeroes(int[] nums) {
        int res_arr = 0,count = 0;
        for(int i=0;i< nums.length;i++)
        {
            if(nums[i]==0)
                count++;
            else
                nums[res_arr++] = nums[i];
        }
        for(int i=res_arr;i< res_arr+count;i++)
            nums[i] = 0;
    }
}