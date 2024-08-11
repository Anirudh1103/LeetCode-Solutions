/*
 
    class Solution {
    public void rotate(int[] nums, int k) {
        int[] new_nums = new int[nums.length];
        int i=k,right = nums.length-1,temp_k = k-1;
        //Step 1: [7,1,2,3,4,5,6]
        //Step 2: [6,7,1,2,3,4,5]
        //Step 3: [5,6,7,1,2,3,4]
        for(int j=0;j<k;j++)
        {
            new_nums[temp_k] = nums[right--];
            //System.out.println(new_nums[temp_k]);
            temp_k--;
            }
        for(int j=0;j< nums.length-k;j++)
            new_nums[i++] = nums[j];
        for(int j=0;j<new_nums.length;j++)
            nums[j] = new_nums[j];
    }
}
 */ 
// The above commented out code only works for few cases if you fixed it contact me.
class Solution {
    public void rotate(int[] nums, int k) {
      k %= nums.length;
      reverse(nums, 0, nums.length - 1);
      reverse(nums, 0, k - 1);
      reverse(nums, k, nums.length - 1);
    }
  
    private void reverse(int[] nums, int l, int r) {
      while (l < r)
        swap(nums, l++, r--);
    }
  
    private void swap(int[] nums, int l, int r) {
      final int temp = nums[l];
      nums[l] = nums[r];
      nums[r] = temp;
    }
  }