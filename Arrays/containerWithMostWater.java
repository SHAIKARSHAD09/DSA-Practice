class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int res = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int w = Math.abs(j-i);
                int h = Math.min(heights[i], heights[j]);
                int area = h * w;
                res = Math.max(res, area);
                
            }
        }
        return res;
    }
}
