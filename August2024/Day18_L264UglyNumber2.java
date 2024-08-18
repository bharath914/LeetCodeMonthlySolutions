public class Day18_L264UglyNumber2 {
    public static void main(String[] args) {
        L264Solution sol = new L264Solution();
        System.out.println("Curr ans is "+sol.nthUglyNumber(361));
    }
}

class L264Solution {
    public int nthUglyNumber(int n) {
        int[] t = new int[n + 1]; // Array to store ugly numbers
        t[1] = 1; // First ugly number

        // Initialize t2, t3 & t5 with 1 to point to the 1st ugly number
        int t2 = 1, t3 = 1, t5 = 1;

        for (int i = 2; i <= n; i++) {
            int second = t[t2] * 2;
            int third = t[t3] * 3;
            int fifth = t[t5] * 5;

            t[i] = Math.min(Math.min(second, third), fifth);

            if (t[i] == second) {
                t2++;
            }
            if (t[i] == third) {
                t3++;
            }
            if (t[i] == fifth) {
                t5++;
            }
        }

        return t[n];
    }
}
