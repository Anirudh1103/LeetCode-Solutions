class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = getMax(candies);
        ArrayList<Boolean> arr = new ArrayList<Boolean>();
        for(int i=0;i<candies.length;i++)
        {
            if(candies[i]+extraCandies >= max)
                arr.add(true);
            else
                arr.add(false);
        }
        return arr;
        
    }
    public static int getMax(int[] candies)
    {
        int max = candies[0];
        for(int i=1;i<candies.length;i++)
            if(candies[i]>max)
                max = candies[i];
        return max;
    }
}