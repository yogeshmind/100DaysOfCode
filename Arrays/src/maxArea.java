public class maxArea {
    static int maxArea(int[] height) {
        int maxArea = 0;
        int l = 0;
        int h = height.length - 1;
        while (l < h) {
            int Area = Math.min(height[l], height[h]) * (h - l);
            maxArea = Math.max(Area, maxArea);
            if (height[l] < height[h])
                l++;
            else
                h--;
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }
}
