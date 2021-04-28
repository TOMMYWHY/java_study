package interviews.servian;

public class MiddleDayCalculation {
    public static void main(String[] args) {


    }

    static String middleOfDay(String sunriseTime,String sunsetTime){
        int sr = getTime(sunriseTime);
        int ss = getTime(sunsetTime);
        int mid =  ss+ sr;

        if(mid%2==0){
            mid/=2;
        }else {mid=(mid+1)/2;}

        int h = mid/60;
        int m = mid%60;
        String hStr = parseTime(h);
        String mStr = parseTime(m);


        return hStr +  ":" + mStr;
    }

    static int getTime(String t){
        String[] strArrs = t.split(":");
        Integer h =Integer.parseInt(strArrs[0]);
        Integer m =Integer.parseInt(strArrs[1]);
        return h*60+m;
    }

    static  String parseTime(int t){
        String hStr="";
        if(t<10){
            hStr = "0"+Integer.toString(t);
        }else {
            hStr = Integer.toString(t);
        }
        return hStr;
    }

}
