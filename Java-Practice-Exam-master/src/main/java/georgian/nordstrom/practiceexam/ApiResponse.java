package georgian.nordstrom.practiceexam;

import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Array;

public class ApiResponse {
    /*
    {
      "Search": [
        {
          "Title": "Shrek",
          "Year": "2001",
          "imdbID": "tt0126029",
          "Type": "movie",
          "Poster": "https://m.media-amazon.com/images/M/MV5BOGZhM2FhNTItODAzNi00YjA0LWEyN2UtNjJlYWQzYzU1MDg5L2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_SX300.jpg"
        },
        {
          "Title": "Shrek 2",
          "Year": "2004",
          "imdbID": "tt0298148",
          "Type": "movie",
          "Poster": "https://m.media-amazon.com/images/M/MV5BMDJhMGRjN2QtNDUxYy00NGM3LThjNGQtMmZiZTRhNjM4YzUxL2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_SX300.jpg"
        }
      ],
      "totalResults": "47",
      "Response": "True"
    }
     */
    @SerializedName("Search")
    Movie[] search;

    @SerializedName("totalResults")
    String totalResults;

    @SerializedName("Response")
    String response;

    public Movie[] getSearch() {
        return search;
    }

    public String getTotalResults() {
        return totalResults;
    }

    public String getResponse() {
        return response;
    }
}
