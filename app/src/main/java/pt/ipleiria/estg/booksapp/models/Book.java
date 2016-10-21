package pt.ipleiria.estg.booksapp.models;

public class Book {

    private String title;
    private String series;
    private String author;
    private String year;
    private String isbn13;
    private String synopse;
    private float rating;
    private int cover;

    public Book(String title, String series, String author, String year, String isbn13, String synopse, float rating,
                int cover) {

        this.title = title;
        this.series = series;
        this.author = author;
        this.year = year;
        this.isbn13 = isbn13;
        this.synopse = synopse;
        this.rating = rating;
        this.cover = cover;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getIsbn13() {
        return isbn13;
    }

    public void setIsbn13(String isbn13) {
        this.isbn13 = isbn13;
    }

    public String getSynopse() {
        return synopse;
    }

    public void setSynopse(String synopse) {
        this.synopse = synopse;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getCover() {
        return cover;
    }

    public void setCover(int cover) {
        this.cover = cover;
    }

    @Override
    public String toString() {
        return title ;
    }
}
