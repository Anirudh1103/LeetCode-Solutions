class Solution {
    public int[] searchRange(int[] nums, int target) {
     int start=0,end = nums.length-1;
     if(end == 0)
     {
        if(target == nums[start])
            return new int[] {start,end};
        else
            return new int[] {-1,-1};
     }
     while(start <= end)
     {
        if(nums[start]!=target)
            start++;
        if(nums[end]!=target)
            end--;
        if(nums[start] == target && nums[end] == target)
            return new int[] {start,end};
     }
     return new int[] {-1,-1};
}
}