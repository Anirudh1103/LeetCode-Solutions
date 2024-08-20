class Solution {
    public int searchInsert(int[] nums, int target)
     {
        int index = 0;
        
        for(int i=0;i< nums.length;i++)
        {
            if(i== nums.length-1) index = i+1;
            if(nums[i]>=target) 
            {
                index = i--;
                break;
            }
        }
        return index;

    }
}
