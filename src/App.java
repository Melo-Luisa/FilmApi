//day 1
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

//day 2

public class App {

    public void titles(String json, List<String> titles ){

        String[] palavras = json.split("\"title\":");
            //System.out.println("Status Code: " + response.statusCode());
            //System.out.println("Response Body:\n" + json);

            for (int i = 1; i < palavras.length; i++) {  // começa de 1 porque o 0 é antes do primeiro título
                String pedaco = palavras[i];

                // Pega o que está entre aspas após "title":
                String titulo = pedaco.split("\"")[1];

                titles.add(titulo);
            }

            System.out.println("Títulos encontrados: " + titles); 
    }

    public void rating(String json, List<Double> rate){
        String[] palavras = json.split("\"vote_average\":");
            //System.out.println("Status Code: " + response.statusCode());
            //System.out.println("Response Body:\n" + json);

            for (int i = 1; i < palavras.length; i++) {  // começa de 1 porque o 0 é antes do primeiro título
                String pedaco = palavras[i].split(",")[0];

                // Pega o que está entre aspas após "title":
                
                double nota = Double.parseDouble(pedaco.trim());

                rate.add(nota);
            }

            System.out.println("Títulos encontrados: " + rate); 
    }
    

    public void Image(String json, List<String> urlImages ){

        String[] palavras = json.split("\"poster_path\":");
            //System.out.println("Status Code: " + response.statusCode());
            //System.out.println("Response Body:\n" + json);

            for (int i = 1; i < palavras.length; i++) {  // começa de 1 porque o 0 é antes do primeiro título
                String pedaco = palavras[i];

                // Pega o que está entre aspas após "title":
                String titulo = pedaco.split("\"")[1];

                urlImages.add(titulo);
            }

        System.out.println("Imagens Encontradas: " + urlImages); 
    }

    public void Overview(String json, List<String> resenha){
        String[] palavras = json.split("\"overview\":");

            for (int i = 1; i < palavras.length; i++) {  // começa de 1 porque o 0 é antes do primeiro título
                String pedaco = palavras[i];

                // Pega o que está entre aspas após "title":
                String titulo = pedaco.split("\"")[1];

                resenha.add(titulo);
            }

        System.out.println("Resenhas: " + resenha); 
    }

    public void ID(String json, List<String> id){
        String[] palavras = json.split("\"id\":");

            for (int i = 1; i < palavras.length; i++) {  // começa de 1 porque o 0 é antes do primeiro título
                String pedaco = palavras[i];

                // Pega o que está entre aspas após "title":
                String titulo = pedaco.split("\"")[1];

                id.add(titulo);
            }

        System.out.println("Resenhas: " + id); 
    }

    

    public static void main(String[] args) throws Exception {
        List<String> titles = new ArrayList<>(); //parseia o título de cada filme do JSON;
        List<String> urlImages = new ArrayList<>();//parseia a URL do pôster de cada filme do JSON;
       // List<Integer> year = new ArrayList<>();
        List<Double> rates = new ArrayList<>();
        List<String> resenha = new ArrayList<>();
        List<String> ides = new ArrayList<>();

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
            String json = response.body();
            App app = new App();
            app.titles(json, titles);
            app.Image(json, urlImages);
            app.rating(json, rates);
            app.Overview(json, resenha);
            app.ID(json, ides);
                  
        

        } catch (IOException e) {
            System.out.println("Erro ao carregar propriedades: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("Erro ao enviar requisição: " + e.getMessage());
        }
    }
}
