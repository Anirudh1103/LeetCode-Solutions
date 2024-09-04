class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        for(int i=0,index = 0;i<n;i++)
        {
            arr[index++] = nums[i];
            arr[index++] = nums[i+n];
        }
        return arr;
    }
}