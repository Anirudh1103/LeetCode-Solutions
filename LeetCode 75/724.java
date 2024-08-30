class Solution {
    public int pivotIndex(int[] nums) {
        int pivot = -1,b_sum = 0,f_sum = 0;
        for(int i=0;i< nums.length;i++)
        {
            for(int j=i+1;j< nums.length;j++)
            {
                f_sum+=nums[j];
            }
            if(b_sum == f_sum)
            {
                pivot = i;
                break;
            }
            else{
             b_sum += nums[i];
             f_sum = 0;
            }
        }
        return pivot;
    }
}