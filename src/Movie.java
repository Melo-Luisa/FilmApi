/**
 * Class para pegar as informações necessário já filtradas em MovieParser
 */
public class Movie {
    public String title;
    public String poster_path;
    public double vote_average;
    public String overview;
    public int id;

    public String getTitle(){return title;}
   // public String getImage(){return poster_path;}
    public Double getRate(){return vote_average;}
    public String getOverview(){return overview;}
    public Integer getId(){return id;}

    public String getFullPosterUrl() {
        return "https://image.tmdb.org/t/p/w500" + poster_path;
            
    }
}

// public class Movie extends App {
//     protected String title;
//     protected String urlImage;
//     protected double rating;
//     protected String resenha;
//     protected int ides; 


//     public Movie(String title, String urlImage, double rating, String resenha, int ides) {
//         this.title = title;
//         this.urlImage = urlImage;
//         this.rating = rating;
//         this.resenha = resenha;
//         this.ides = ides;
//     }

//     public String getTitle(){return title;}
//     public String getImage(){return urlImage;}
//     public Double getRate(){return rating;}
//     public String getOverview(){return resenha;}
//     public Integer getId(){return ides;}

    

//     @Override
//     public String toString(){
//         return "Títulos: " + title + "\n" + 
//                 "Images: " + urlImage + "\n" +
//                 "Overview: " + resenha + "\n" +
//                 "Rating: " + rating + "\n" + 
//                 "Id: " + ides;
//     }

//     public String getFullPosterUrl() {
//         return urlImage != null
//             ? "https://image.tmdb.org/t/p/w500" + urlImage
//             : null;
//     }

// }