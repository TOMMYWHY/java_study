package interviews.servian;

import java.math.BigDecimal;

public class TaxCalculation {
    public static void main(String[] args) {



    }

    public static String calculateTax(float income){
        double tax =0.0f;
        double result =0.0f;
        if(income<=18200){
            BigDecimal bg = new BigDecimal(result);
            return String.format("%.2f",bg.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue());
        }

        if( income<=37000){

            result +=( (income-18200)*0.19) ;
            BigDecimal bg = new BigDecimal(result);
            return String.format("%.2f",bg.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue());

        }
        result  += (3700-18200)*0.19;
        if(income<=87000){
            result +=( (income-37000)*0.325) ;
            BigDecimal bg = new BigDecimal(result);
            return String.format("%.2f",bg.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue());
        }
        result +=( (18000-37000)*0.325) ;
        if(income<=18000){
            result +=(float)( (income-87000)*0.37) ;
            BigDecimal bg = new BigDecimal(result);
            return String.format("%.2f",bg.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue());
        }


        result +=(float)( (income-87000)*0.45) ;
        BigDecimal bg = new BigDecimal(result);
        return String.format("%.2f",bg.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue());


    }

}
