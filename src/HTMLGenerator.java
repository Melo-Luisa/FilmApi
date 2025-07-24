import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class HTMLGenerator {

    public void generateHTML(List<Movie> movies) {
        StringBuilder html = new StringBuilder();

        html.append("<!DOCTYPE html>");
        html.append("<html lang='pt-BR'>");
        html.append("<head>");
        html.append("<link href=\"https://fonts.googleapis.com/css2?family=Bebas+Neue&display=swap\" rel=\"stylesheet\">\r\n" + //
        "");
        html.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
        html.append("<title>FilmApi</title>");
        html.append("<link rel=\"stylesheet\" href=\"style.css\">");
        // html.append("<style>");
        // html.append("body { font-family: Arial; padding: 20px; background-color: #f0f0f0; }");
        // html.append(".movie { background: white; border-radius: 10px; padding: 15px; margin-bottom: 20px; box-shadow: 0 0 10px #ccc; }");
        // html.append("img { max-width: 200px; }");
        // html.append("</style>");
        html.append("</head>");
        html.append("<body>");
        html.append("<h1>FILMAPI</h1>");
         html.append("<div class = 'movie-container'>");

        for (Movie movie : movies) {
           
            html.append("<div class='movie'>");
            html.append("<h2>").append(movie.getTitle()).append("</h2>"); 
            html.append("<img src='").append(movie.getFullPosterUrl()).append("' alt='Poster'>");
            html.append("<p><strong>Rate:</strong> ").append(String.format("%.1f", movie.getRate())).append("</p>");
            html.append("<p><Strong>Release Date:</strong> ").append(movie.getYear()).append("<p>");
            html.append("<p><strong>Overview:</strong> ").append(movie.getOverview()).append("</p>");
            html.append("<p><strong>ID:</strong> ").append(movie.getId()).append("</p>");
            html.append("</div>");

        }
        html.append("</div");
        html.append("</body>");
        html.append("</html>");

        // Salva o HTML em arquivo
        try {
            File file = new File("resource/index.html");
            file.getParentFile().mkdirs(); // cria a pasta se não existir
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(html.toString());
            writer.close();

            // Abre no navegador
            Desktop.getDesktop().browse(file.toURI());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
