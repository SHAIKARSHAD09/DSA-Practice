class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> st = new HashSet<>();
        for(int num: nums){
            if(st.contains(num)){
                return true;
            }
            st.add(num);
        }
        return false;
    }
}
