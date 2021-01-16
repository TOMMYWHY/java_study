package collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo1 {
    @Test
    public void testCollection(){
        Collection collection = new ArrayList();
        collection.add("xxx");
        collection.add("ooo");
        collection.add("yyy");
        System.out.println(collection);

        for (Object obj : collection){
            System.out.println(obj);
        }

        Iterator iterator = collection.iterator();
        while(iterator.hasNext()){
            String next =(String) iterator.next();
            System.out.println(next);
        }
    }
}
