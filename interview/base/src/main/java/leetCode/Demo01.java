package leetCode;

import java.util.*;

public class Demo01 {

// 给两个List a,b，实现两个List两个List的并集，即合并两个List，重复的元素只保留一个。
// 不可以调用现成的集合方法
// 有空闲限制，a的长度是m，b的长度是n，额外空间最多用m+n (不是O(m+n))
// 尝试优化下，最少的时间复杂度是多少，在代码注释里给出最终的时间复杂度


    public static class ListUnion {
        static List<Integer> union(List<Integer> a, List<Integer> b) {
            // 在这儿实现
            /*method 1 */
            Set<Integer> temp = new HashSet<Integer>();
            for(int i :a) temp.add(i);
            for (int j : b ) temp.add(j);
            List<Integer> result = new ArrayList<>(temp);
//            System.out.println("result:"+result);

            /*method 2 */
            /*List<Integer> result = new ArrayList<Integer>();
            for (int i = 0; i < a.size(); i++) {
                if(! result.contains(a.get(i))){
                    result.add(a.get(i));
                }
            }
            for (int i = 0; i < b.size(); i++) {
                if(!result.contains(b.get(i))){
                    result.add(b.get(i));
                }
            }*/
            return result;
        }
        public static void main(String[] args) {
            // union([ 2, 1, 3], [ 2, 3, 4]) ==  [1, 2, 3, 4]
            System.out.println(union(Arrays.asList(2,1,3), Arrays.asList(2,3,4))); // 原题此处少个闭合括号
        }
    }

}



