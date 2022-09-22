import java.util.*;

public class Movie {
	private String movieTitle;
	private String movieStudio;
	private String movieRating;

	public Movie(String movieTitle, String movieStudio, String movieRating) {
		this.movieTitle = movieTitle;
		this.movieStudio = movieStudio;
		this.movieRating = movieRating;
	}

	public Movie(String movieTitle, String movieStudio) {
		this.movieTitle = movieTitle;
		this.movieStudio = movieStudio;
		movieRating = "PG";
	}

	public Movie[] getPG(Movie[] inputMovies) {
		Movie[] pgMovies = new Movie[inputMovies.length];
		int i = 0;
		for (Movie movie : inputMovies) {
			if (movie.movieRating.equals("PG")) {
				pgMovies[i++] = movie;
			}
		}
		return pgMovies;
	}

	public String toString() {
		return "MovieTitle : " + movieTitle + " " + "MovieStudio : " + movieStudio + " " + "MovieRating : "
				+ movieRating + "";
	}

	public static void main(String[] args) {
		Movie movie = new Movie("Casino Royale", "Eon Productions", "PG-13");
		System.out.println(movie);
		Movie[] inputMovies = new Movie[4];

		inputMovies[0] = new Movie("ABC", "Sitara", "R");
		inputMovies[1] = new Movie("DEF", "Suresh", "PG");
		inputMovies[2] = new Movie("XYZ", "Ramu");
		inputMovies[3] = new Movie("KLM", "Rajesh", "PG-13");
		Movie[] pgMovies = movie.getPG(inputMovies);
		for (int i = 0; i < pgMovies.length; i++) {
			if (pgMovies[i] != null) {
				System.out.println(pgMovies[i].toString());
			}
		}
	}

}