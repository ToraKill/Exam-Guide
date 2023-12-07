package georgian.nordstrom.practiceexam;

import com.google.gson.annotations.SerializedName;

public class Movie {

    /* "Search": [
        {
          "Title": "Shrek",
          "Year": "2001",
          "imdbID": "tt0126029",
          "Type": "movie",
          "Poster": "https://m.media-amazon.com/images/M/MV5BOGZhM2FhNTItODAzNi00YjA0LWEyN2UtNjJlYWQzYzU1MDg5L2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_SX300.jpg"
        },
*/


    @SerializedName("Title")
    String title;

    @SerializedName("Year")
    String year;

    String imdbID;

    @SerializedName("Type")
    String type;

    @SerializedName("Poster")
    String poster;

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public String getImdbID() {
        return imdbID;
    }

    public String getType() {
        return type;
    }

    public String getPoster() {
        return poster;
    }
}
