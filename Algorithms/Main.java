import slidingwindow.SlidingWindow;

public class Main {
    public static void main(String[] args) {
        SlidingWindow window = new SlidingWindow();
        int max = window.maxsubArraySum(new int[]{1, 2, 3, 4}, 2);
        System.out.println(max);
    }
}
