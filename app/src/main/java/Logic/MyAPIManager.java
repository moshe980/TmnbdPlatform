package Logic;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;

import java.util.ArrayList;
import java.util.List;

public class MyAPIManager implements APIService {
    private List<String> movieNames;
    private static MyAPIManager instance;


    private MyAPIManager() {
        this.movieNames = new ArrayList();
        this.movieNames.add("Spider-Man");
        this.movieNames.add("Spider-Man2");
        this.movieNames.add("Spider-Man3");


    }

    public static MyAPIManager getInstance() {
        if (instance == null) {
            instance = new MyAPIManager();
        }
        return instance;

    }
    @Override
    public void printAllMovies() {
        System.out.println("***********"+this.movieNames.toString());
    }
}
