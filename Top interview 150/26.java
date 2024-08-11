class Solution {
    public int removeDuplicates(int[] nums) {
        int k=0;
       for(int i=0;i<nums.length;i++)
       {
        for(int j=i+1;j<nums.length;j++)
        {
            if(nums[i] == nums[j])
                nums[i] = 19999;
        }
        
       }
       for(int i = 0;i<nums.length;i++)
        {
            if(nums[i] == 19999)continue;
            else 
                nums[k++] = nums[i];
        }
        return k;
        
    }
}