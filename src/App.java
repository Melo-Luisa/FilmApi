import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Properties;

public class App {
    public static void main(String[] args) throws Exception {
        try{
            //cria cliente http
            HttpClient client = HttpClient.newHttpClient();
            Properties props = new Properties();

            //Utilizando O properties para não mostrar a API Key
            //carrega os arquivos
            FileInputStream input = new FileInputStream("config.properties");
            props.load(input);

            // Parte base da URL da API
            String baseUrl = "https://api.themoviedb.org/3/movie/popular";

            //le os arquivos 
            String apiKey = props.getProperty("tmdb.api_key");
            String language = props.getProperty("tmdb.language");
            String page = props.getProperty("tmdb.page");


            //Chave API + URL
            String url = String.format(
                    "%s?api_key=%s&language=%s&page=%s",
                    baseUrl, apiKey, language, page
                );
            //cria um request GET
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();
        
            // Envia a requisição e recebe a resposta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Imprime o status e o corpo da resposta
            System.out.println("Status Code: " + response.statusCode());
            System.out.println("Response Body:\n" + response.body());

        } catch (IOException e) {
            System.out.println("Erro ao carregar propriedades: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("Erro ao enviar requisição: " + e.getMessage());
        }
    }
}
