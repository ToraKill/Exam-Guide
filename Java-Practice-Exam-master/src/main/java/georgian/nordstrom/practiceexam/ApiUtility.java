package georgian.nordstrom.practiceexam;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiUtility {

    /***
     * Creates a new http request to the omdb api and returns the response which is converted to an ApiResponse object
     * @param searchName the name of the movie to search for
     * @return Movie[] an array of movies
     */
    public static Movie[] getMovies(String searchName) throws IOException, InterruptedException {
        searchName = searchName.replace(" ", "%20");
        String url = "https://www.omdbapi.com/?apikey=8127fd11&s=" + searchName;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(url)).build();

        HttpResponse<String> httpResponse = client.send(httpRequest, HttpResponse.BodyHandlers
                .ofString());

        Gson gson = new Gson();
        return gson.fromJson(httpResponse.body(), ApiResponse.class).getSearch();

    }
}
