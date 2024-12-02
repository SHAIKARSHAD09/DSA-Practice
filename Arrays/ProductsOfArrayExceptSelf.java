class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];

        for(int i=0; i<len; i++){
            result[i] = 1;
        }

        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                if(i != j){
                    result[i] *= nums[j];
                }
            }
        }

        return result;

    }
}  
