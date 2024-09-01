import java.util.Arrays;

public class L2022_Convert1dTo2D {
    public static void main(String[] args) {
        L2022Solution sol = new L2022Solution();
        int[] array = {1, 2, 3, 4};
        int[][] result = sol.construct2DArray(array, 2, 2);
        for (int[] arr :result){
            System.out.println(Arrays.toString(arr));
        }
    }
}

class L2022Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
            int[][] ans = new int[m][n];
            for (int i = 0; i < m; i++) {
                int[] sub = new int[n];
                int index = 0;
                for (int j = 0;j<n;j++){
                    int curr= i*m +j;
                    sub[index++] = original[curr];
                }
                ans[i] = sub;
            }
            return ans;
    }
}
