package Logic;

import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;

import java.io.IOException;

public class TmbdApiManager implements APIService {
    private final OkHttpClient client;
    private final Request request;
    private static TmbdApiManager instance;

    private TmbdApiManager() {
        client = new OkHttpClient();

        request = new Request.Builder()
                .url("https://api.themoviedb.org/3/discover/movie?api_key=96624ea86553cd7a4caed4ecbdc35ec1")
                .build();
    }

    public static TmbdApiManager getInstance() {
        if (instance == null) {
            instance = new TmbdApiManager();
        }
        return instance;

    }


    @Override
    public void printAllMovies() {
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {
            }

            @Override
            public void onResponse(Response response) throws IOException {
                ResponseBody responseBody = response.body();
                System.out.println(responseBody.string());
            }
        });

    }


}
