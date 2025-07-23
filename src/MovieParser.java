
import com.google.gson.Gson;
import java.util.List;

public class MovieParser {

    /**
     * Extrai os dados relevantes de um JSON contendo informações de filmes.
     *
     * @param json A resposta da API em formato JSON contendo os filmes.
     * 
     * @return Uma lista de objetos Movie com os dados extraídos.
     */
    public static List<Movie> parse(String json) {
        Gson gson = new Gson();

        // Converte o JSON em um objeto MovieResponse
        MovieResponse response = gson.fromJson(json, MovieResponse.class);

        // Retorna a lista de filmes da resposta
        return response.results;
    }
}

//Old Version

// import java.util.ArrayList;
// import java.util.List;


// public class MovieParser {

//     public static List<Movie> parse(String json) {
//         List<Movie> movies = new ArrayList<>();

//         String[] filmes = json.split("\"title\":");
        

//         for (int i = 1; i < filmes.length; i++) {
//             try {
//                 String bloco = filmes[i];

//                 // Título
//                 String title = bloco.split("\"")[1];
                

//                 // Poster
//                 String posterPath = bloco.split("\"poster_path\":\"")[1].split("\"")[0];
//                 String posterUrl = "https://image.tmdb.org/t/p/w500" + posterPath;


//                 // Nota
//                 String ratingStr = bloco.split("\"vote_average\":")[1].split(",")[0];
//                 double rating = Double.parseDouble(ratingStr.trim());

//                 // Overview 
//                 String resenha = bloco.split("\"overview\":\"")[1].split("\"")[0];

//                 //ID    
//                  String IdStr = bloco.split("\"id\":")[1].split(",")[0];
//                 double id = Double.parseDouble(IdStr.trim());
        

//                 // Cria e adiciona o filme
//                 movies.add(new Movie(title, posterUrl, rating, resenha, id));

//             } catch (Exception e) {
//                 System.out.println("Erro ao processar um filme: " + e.getMessage());
//             }

            
//         }
        
//         return movies;
//     }

    


    
// }

