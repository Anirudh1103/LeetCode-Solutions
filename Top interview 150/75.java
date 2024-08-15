class Solution {
    public void sortColors(int[] nums) {
        for(int i=0;i< nums.length;i++)
            for(int j=i+1;j< nums.length;j++)
            {
                    int temp;
                    if(nums[j]<=nums[i])
                    {
                        temp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = temp;
                    }
            }
    }
}