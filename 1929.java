class Solution {
    public int[] getConcatenation(int[] nums) {
        int length = 2* nums.length,i,j=0;
        int[] arr;
        arr = new int[length];
        for(i=0;i< nums.length;i++)
            arr[i] = nums[i];
        for(i = nums.length;i< arr.length;i++)
            arr[i] = nums[j++];
    return arr;   
    }
}