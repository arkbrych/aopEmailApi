package pl.brych.aop_email_api.dto;

public class Film {

    private String filmName;
    private Integer releaseYear;
    private String filmProducer;

    public Film(String filmName, Integer releaseYear, String filmProducer) {
        this.filmName = filmName;
        this.releaseYear = releaseYear;
        this.filmProducer = filmProducer;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getFilmProducer() {
        return filmProducer;
    }

    public void setFilmProducer(String filmProducer) {
        this.filmProducer = filmProducer;
    }

    @Override
    public String toString() {
        return "Film{" +
                "filmName='" + filmName + '\'' +
                ", releaseYear=" + releaseYear +
                ", filmProducer='" + filmProducer + '\'' +
                '}';
    }
}
