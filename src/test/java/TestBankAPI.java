import data.CountryCode;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static rest.ApiRequest.getRest;

@RunWith(Parameterized.class)
public class TestBankAPI {

//    @Parameterized.Parameters
//    public static Collection options() {
//        return Arrays.stream(new String[]{
//                "USD",
//                "AUD"}).toList();
//    }

    @Parameterized.Parameters
    public static Collection options(){
        return Arrays.asList(CountryCode.values());
    }


    @Test
    public void test1(){

        JSONArray bank=new JSONArray(getRest("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?valcode="+ CountryCode.AUD +"&json"));
        JSONObject jsonObject= (JSONObject)  bank.get(0);

                System.out.println("r030 ="+jsonObject.getInt("r030")+" \n"
                +"rate = "+jsonObject.getDouble("rate")+"\n"
                +"txt = "+ jsonObject.getString("txt")+"\n"
                +"cc= "+ jsonObject.getString("cc")+"\n"
                +"exchange date= "+ jsonObject.getString("exchangedate")
                );
    }
}
