class Solution {
    public int maxProduct(int[] nums) {
       int max=nums[0];
       int min=nums[0];
       int result=nums[0];
       for(int i=1;i<nums.length;i++) {
        int cur=nums[i];
        int tmax=Math.max(cur,Math.max(max*cur,min*cur));
        min=Math.min(cur,Math.min(min*cur,max*cur));
        max=tmax;
        result=Math.max(result,max);
       }
       return result;
    }
}
