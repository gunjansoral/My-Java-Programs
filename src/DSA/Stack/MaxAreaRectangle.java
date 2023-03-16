package DSA.Stack;

public class MaxAreaRectangle {
    private static int maxAreaWorker(int[] bars, int left, int right, int maxArea) {
        if (left >= right) return maxArea;
        int minHeightIdx = left;
        int minHeight = bars[left];
        //find width
        int width = right - left + 1;
        //find minimum height
        for (int i = left; i < right; i++) {
            if (bars[i] < minHeight) {
                minHeightIdx = i;
                minHeight = bars[i];
            }
        }
        //find area
        int area = width * minHeight;
        //updating max area
        if (area > maxArea) maxArea = area;
        int leftArea = maxAreaWorker(bars, left, minHeightIdx - 1, maxArea);
        int rightArea = maxAreaWorker(bars, minHeightIdx + 1, right, maxArea);
        return Math.max(leftArea, rightArea);
    }

    public static int maxArea(int[] bars) {
        int maxArea = bars[0];
        int left = 0;
        int right = bars.length - 1;
        return maxAreaWorker(bars, left, right, maxArea);
    }
}
