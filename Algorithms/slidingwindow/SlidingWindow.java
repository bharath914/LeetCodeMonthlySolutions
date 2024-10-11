package slidingwindow;

public class SlidingWindow {
    /**
     * @param k size of the window.
     * @return max sum in given k size sub array;
     */
    public int maxsubArraySum(int[] nums, int k) {
       int sum=0;
       int windowSum=0;
       for(int i=0;i<k;i++){
           windowSum+=nums[i];
           sum=windowSum;
       }
       for(int i=k;i<nums.length;i++){
           windowSum += (nums[i]-nums[i-k]);
           sum = Math.max(windowSum,sum);
       }
       return sum;
    }
}
