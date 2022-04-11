package HomeWork_6;

/* Сделал Vladislav Torgashev-1
11.04.2022
 */

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Objects;


public class AccuWeather {
    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("http://dataservice.accuweather.com/forecasts/v1/daily/5day/812?apikey=Msdg8ttfvTwyBW5MHxlf4ApMYH2ujNit")
                .build();

        Response response = client.newCall(request).execute();
        System.out.println(Objects.requireNonNull(response.body()).string());
    }
}
