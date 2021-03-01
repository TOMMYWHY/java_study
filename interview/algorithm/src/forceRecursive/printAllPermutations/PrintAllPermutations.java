package forceRecursive.printAllPermutations;

import java.util.ArrayList;

public class PrintAllPermutations {
    public static ArrayList<String> Permutation(String str){
        ArrayList<String> res = new ArrayList<>();
        if(str==null || str.length()==0){return res;}
        char[] chs = str.toCharArray();
        process(chs,0,res);
        return res;
    }

    private static void process(char[] str, int i, ArrayList<String> ans) {
        if(i==str.length){ans.add(String.valueOf(ans.stream()));}
        for (int j = i; j < str.length; j++) {
            swap(str,i,j);
            process(str,i+1,ans);
            swap(str,i,j);
        }
    }



    public static void swap(char[] chs, int i, int j) {
        char tmp = chs[i];
        chs[i] = chs[j];
        chs[j] = tmp;
    }
}
