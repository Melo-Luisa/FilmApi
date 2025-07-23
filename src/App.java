import java.util.ArrayList;
import java.util.List;


public class App {
    public List<String> titles = new ArrayList<>(); 
    public List<String> urlImages = new ArrayList<>();
    public List<Double> rates = new ArrayList<>();
    public List<String> resenhas = new ArrayList<>();
    public List<Double> Ides = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        //Objeto da class HttpService - coexão com a API
        String json = HttpService.getJson();

        //Chamada para o método da class MovieParser
        List<Movie> movies = MovieParser.parse(json);

        //For para ler a lista da API puxando os métodos de Movie;
        for (Movie movie : movies) {
            System.out.println("Título: " + movie.getTitle());
            System.out.println("Poster: " + movie.getFullPosterUrl());
            System.out.println("Nota: " + movie.getRate());
            System.out.println("Descrição: " + movie.getOverview());
            System.out.println("ID: " + movie.getId());
            System.out.println("------------------------------");
        };
    }
}
