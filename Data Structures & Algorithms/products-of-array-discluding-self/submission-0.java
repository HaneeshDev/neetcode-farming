class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        // int ele = nums[0];
        int[] output = new int[n];

        output[0] = 1;


        // left
        for(int i = 1; i < n; i++){
                output[i] = output[i - 1] * nums[i - 1] ;
        }

        //right product
        int right = 1;
        for(int i = n - 1; i >= 0; i--){
            output[i] *= right;
            right *= nums[i];
        }
        
        return output;
    }
}  
