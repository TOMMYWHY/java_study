package map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo1 {
    @Test
    public void testMap(){
        Map<String, String> map = new HashMap<>();
        map.put("1","a");
        map.put("2","b");
        map.put("3","c");
        map.put("4","e");
        System.out.println(map);

        Set<String> keySet = map.keySet();
        /*for(String key:keySet){
            System.out.println(key);
        }*/
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
        System.out.println("-----");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        System.out.println(entries);
        for (Map.Entry<String,String> entry:entries){
            System.out.println(entry.getKey()+"----"+entry.getValue());

        }
    }
}
