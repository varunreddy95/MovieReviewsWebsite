package dev.varunreddy.movies;

import com.mongodb.client.model.geojson.LineString;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
@Data   // From Lombok Javadoc - Creates getters, setters and toString methods
@AllArgsConstructor   //Lombok Constructor with all the fields
@NoArgsConstructor     //Lombok Constructor with no fields
public class Movie {
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;

    @DocumentReference   // Allows us to store only Ids, whereas reviews in separate collection
    private List<Review> reviewIds;

}
