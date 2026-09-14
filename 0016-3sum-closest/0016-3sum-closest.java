class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        Arrays.sort(nums);
        int closestsum = nums[0]+nums[1]+nums[2];
        int currentsum = 0;
        for(int i=0 ; i<nums.length ; i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                currentsum = nums[i]+nums[j]+nums[k];
               
                if(currentsum==target){
                    return currentsum;
                }
                if( Math.abs(target-closestsum) >Math.abs(target - currentsum) ){
                    closestsum = currentsum;
                }
                if( currentsum < target ){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return closestsum;
    }
}