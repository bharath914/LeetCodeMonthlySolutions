public class Day17_L1937_MaxNumberOfPoints {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{1,5,1},{3,1,1}};
        int[][] arr2 = {{1,5},{2,3},{4,2}};
        L1937Solution solution = new L1937Solution();
        System.out.println(solution.maxPoints(arr2));
    }
}

class L1937Solution{
    public long maxPoints(int[][] points) {
        int[][] high = new int[points.length][1];
        int[][] pos = new int[points.length][1];
        long ans = 0;
        for(int i=0;i<points.length;i++){
            int max =0;
            int index =0;
            for(int j=0;j<points[i].length;j++){
                max = Math.max(max,points[i][j]);
                if(max==points[i][j])index=j;
            }
            int prevIndex = 0;
            ans+=max;
            if(i!=0){
                prevIndex = pos[i-1][0];
                ans-= Math.abs(prevIndex-index);
            }
            pos[i][0] = index;
        }
        return ans;
    }
}
