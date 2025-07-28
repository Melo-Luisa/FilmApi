import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class App {
    public List<String> titles = new ArrayList<>(); 
    public List<String> urlImages = new ArrayList<>();
    public List<Integer> rates = new ArrayList<>();
    public List<String> resenhas = new ArrayList<>();
    public List<Integer> Ides = new ArrayList<>();
    public List<String> year = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        //Objeto da class HttpService - coexão com a API
        String json = HttpService.getJson();
       // System.out.println(json);

        //Chamada para o método da class MovieParser
        List<Movie> movies = MovieParser.parse(json);
        //Filmes ordenados
        Collections.sort(movies);
        Comparator.reverseOrder();
        
        new HTMLGenerator().generateHTML(movies);

        
    }
}
