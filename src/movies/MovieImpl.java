package movies;

/**
 * This class implements the movie interface. The movie has a title, director, and year of release.
 */
public class MovieImpl implements Movie {

  private final String title;
  private final Person director;
  private final int year;

  /**
   * Constructs a Movie object and initializes it to the movie's title, director and year.
   *
   * @param title    the title of this movie
   * @param director the name of the movie's director
   * @param year     the year the movie was released
   */
  public MovieImpl(String title, Person director, int year) {
    this.title = title;
    this.director = director;
    this.year = year;
  }

  @Override public String getTitle() {
    return title;
  }

  @Override public Person getDirector() {
    return director;
  }

  @Override public int getYear() {
    return year;
  }
  /**
   * Returns a string representation of the movie.
   * e.g. "The Apartment (Billy Wilder, 1960)"
   *      "La Dolce Vita (Federico Fellini, 1960)"
   *      "Dr. Strangelove (Stanley Kubrick, 1964)"
   * @return a string representation of the movie
   */
  @Override public String toString() {
    return this.getTitle() + " (" + this.getDirector() + ", " + this.getYear() + ")";
  }

  /**
   * Compares this movie with the specified movie for order. Returns a negative integer, zero, or a
   * compare the movie by year
   * if the years are the same, compare the movie by title
   * if the titles are the same, compare the movie by director
   * positive integer as this movie is less than, equal to, or greater than the specified movie.
   *
   * @param o the movie to be compared
   * @return a negative integer, zero, or a positive integer as this movie is less than, equal to,
   * or greater than the specified movie
   */
  @Override public int compareTo(Movie o) {
    if (this.getYear() == o.getYear()) {
      if (this.getTitle().equalsIgnoreCase(o.getTitle())) {
        return this.getDirector().compareTo(o.getDirector());
      }
      return this.getTitle().compareToIgnoreCase(o.getTitle());
    }
    return this.getYear() - o.getYear();
  }
}
