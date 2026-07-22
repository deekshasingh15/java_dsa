class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int right=0;
        int left=n-1;
        int maxarea=0;

        while(right<=left){
            int h=Math.min(height[right],height[left]);
            int w=left-right;
            int area=h*w;
            maxarea=Math.max(maxarea,area);
        
        if(height[right]<height[left]){
            right++;
        }else
    {
        left--;

    }
        }
    return maxarea;
    }
}