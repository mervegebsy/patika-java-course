package week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Movie {
    String movieName;
    int publicationYear;
    String movieType;
    double IMDbScore;

    public Movie(String movieName, int publicationYear, String movieType, double IMDbScore) {
        this.movieName = movieName;
        this.publicationYear = publicationYear;
        this.movieType = movieType;
        this.IMDbScore = IMDbScore;
    }
    // okunabilir bir şekilde döndürür
    @Override
    public String toString() {
        return "Film{filmAdi='" + movieName + "', yayinYili=" + publicationYear +
                ", filmTuru='" + movieType + "', imdbPuani=" + IMDbScore + "}";
    }

    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<>();
        movies.add(new Movie("The Matrix",1999,"Bilim Kurgu",8.7));
        movies.add(new Movie("Parasite", 2019,"Komedi",8.6));
        movies.add(new Movie("Shutter Island",2010,"Gerilim",8.2));
        movies.add(new Movie("Inception",2010,"Bilim Kurgu",8.8));
        movies.add(new Movie("The Dark Night",2008,"Suç",9.0));

        // IMDb puanına göre sıralama büyükten küçüğe
        System.out.println("IMDb puanına göre sıralama");
        movies.sort((m1, m2) -> Double.compare(m2.IMDbScore, m1.IMDbScore));
        movies.forEach(System.out::println);
        System.out.println();

        // Yayın yılına göre sıralama (küçükten büyüğe)
        System.out.println("Yayın yılına göre sıralama");
        movies.sort(Comparator.comparingInt(m -> m.publicationYear));
        movies.forEach(System.out::println);
        System.out.println();
        // Bilim kurgu türündeki filmleri filtreleme ve yazdırma
        System.out.println("Bilim kurgu türündeki filmler: ");
        filter(movies,"Bilim Kurgu");


    }
    public static void filter(List<Movie> movies, String filmType){
        for(Movie movie: movies){
            if(movie.movieType.equalsIgnoreCase(filmType)){
                System.out.println(movie);
            }
        }
    }
}
