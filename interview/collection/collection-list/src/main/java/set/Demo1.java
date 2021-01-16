package set;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Demo1 {
    @Test
    public void testSet(){
        Set<String> set = new HashSet<>();
        set.add("xxx");
        set.add("oo");
        set.add("pp");
        set.add("yyy");
        System.out.println(set);

        for(String i:set){
            System.out.println(i);
        }

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
