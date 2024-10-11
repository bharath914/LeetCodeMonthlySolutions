package slidingwindow;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class L187RepeatedDNA {
    public static void main(String[] args) {
        String dna   = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        System.out.println(findRepeatedDnaSequences(dna));
    }

    public static List<String> findRepeatedDnaSequences(String s) {
        if (s.length() < 10) return new ArrayList<>();
        HashSet<String> res = new HashSet<>();
        HashSet<String> set = new HashSet<>();
        char[] arr = s.toCharArray();
        String cur = "";
        for (int i = 0; i < 10; i++) {
            cur += arr[i];
        }
        System.out.println("Curr is "+cur);
        set.add(cur);
        for (int i = 10; i < arr.length; i++) {
            cur += arr[i];
            String sub = cur.substring(1);
            System.out.println("CUrr sub string is "+sub);
            if (!set.add(sub)) {
                res.add(sub);
            }
            cur=sub;
        }
        return res.stream().toList();
    }
}
