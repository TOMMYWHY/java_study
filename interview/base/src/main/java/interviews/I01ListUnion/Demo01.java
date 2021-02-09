package interviews.I01ListUnion;

import java.util.*;

public class Demo01 {

// 给两个List a,b，实现两个List两个List的并集，即合并两个List，重复的元素只保留一个。
// 不可以调用现成的集合方法
// 有空闲限制，a的长度是m，b的长度是n，额外空间最多用m+n (不是O(m+n))
// 尝试优化下，最少的时间复杂度是多少，在代码注释里给出最终的时间复杂度


    public static class ListUnion {

        public static int[] mergeArrays(int[] arr1, int[] arr2) {
            int[] temp = new int[arr1.length + arr2.length];
            System.arraycopy(arr1, 0, temp, 0, arr1.length);
            System.arraycopy(arr2, 0, temp, arr1.length, arr2.length);
            for (int i = 0; i < arr1.length; i++) {
                for (int j = arr1.length; j < temp.length; j++) {
                    if (temp[i] == temp[j]) {
                        temp[j] = temp[temp.length - 1];
                        temp = Arrays.copyOf(temp, temp.length - 1);
                        break;
                    }
                }
            }
//            Arrays.sort(temp);
            System.out.println(temp.toString());
            return temp;
        }



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
//            System.out.println(union(Arrays.asList(2,1,3), Arrays.asList(2,3,4))); // 原题此处少个闭合括号
//            System.out.println(mergeArrays(new int[]{2,1,3},new int[]{2,3,4} ));
        }
    }

}



