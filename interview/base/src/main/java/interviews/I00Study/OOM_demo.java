package interviews.I00Study;

import java.util.ArrayList;

public class OOM_demo {
    byte[] arr = new byte[1*1024*1024];

    public static void main(String[] args) {
        ArrayList<OOM_demo> list = new ArrayList<>();
        int count =  0;
        try {
            while(true){
                list.add(new OOM_demo());
                count++;
            }
        }catch (Error e){
            System.out.println("count："+ count);
            e.printStackTrace();
        }


    }
}
