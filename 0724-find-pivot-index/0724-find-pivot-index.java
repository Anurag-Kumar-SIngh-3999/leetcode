class Solution {
    public int pivotIndex(int[] nums) {
        // int[] lprefix = new int[nums.length];
        // lprefix[0] = nums[0];
        // for(int i =1;i<nums.length;i++){
        //     lprefix[i] = lprefix[i-1] + nums[i];
        // }
        // int[] rprefix = new int[nums.length];
        // rprefix[nums.length-1] = nums[nums.length-1];
        // for(int i =nums.length-2 ; i>=0 ; i--){
        //     rprefix[i] = rprefix[i+1] + nums[i];
        // }
        // int i=0;
        // int j=nums.length-1;
        // while(i<j){
        //     if(rprefix[i]==lprefix[j]){
        //         return i;
        //     }
        //     if ()
        // }


        int totalsum=0;
        int leftsum=0;
        for(int i =0; i<nums.length;i++){
            totalsum+=nums[i];
        }

        for(int i = 0; i<nums.length;i++){

            if(leftsum==totalsum - leftsum-nums[i]){
                return i ;
            }
            leftsum+=nums[i];

        }
        return -1;
    }
}