class Solution {
    public void moveZeroes(int[] nums) {
        int nonzeropos=0;
        for (int i =0; i<nums.length;i++){
            if(nums[i]!=0){
                int temp=nums[i];
                nums[nonzeropos]=temp;
                nonzeropos++;
            }
        }
        for(int j=nonzeropos;j<nums.length;j++){
            nums[j]=0;
        }
    }
}