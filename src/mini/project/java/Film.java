
package mini.project.java;


public class Film {
    private int filmId;
    private String filmName;
    private String filmDirector;
    private String filmHero;
    private String filmType;
    private int filmShelf;
    private int filmCopies;
    private int filmCopiesAvailable;

    
    public Film(){}
    public Film(int filmId, String filmName, String filmDirector, String filmHero, String filmType, int filmShelf, int filmCopies, int filmCopiesAvailable) {
        this.filmId = filmId;
        this.filmName = filmName;
        this.filmDirector = filmDirector;
        this.filmHero = filmHero;
        this.filmType = filmType;
        this.filmShelf = filmShelf;
        this.filmCopies = filmCopies;
        this.filmCopiesAvailable = filmCopiesAvailable;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getFilmDirector() {
        return filmDirector;
    }

    public void setFilmDirector(String filmDirector) {
        this.filmDirector = filmDirector;
    }

    public String getFilmHero() {
        return filmHero;
    }

    public void setFilmHero(String filmHero) {
        this.filmHero = filmHero;
    }

    public String getFilmType() {
        return filmType;
    }

    public void setFilmType(String filmType) {
        this.filmType = filmType;
    }

    public int getFilmShelf() {
        return filmShelf;
    }

    public void setFilmShelf(int filmShelf) {
        this.filmShelf = filmShelf;
    }

    public int getFilmCopies() {
        return filmCopies;
    }

    public void setFilmCopies(int filmCopies) {
        this.filmCopies = filmCopies;
    }

    public int getFilmCopiesAvailable() {
        return filmCopiesAvailable;
    }

    public void setFilmCopiesAvailable(int filmCopiesAvailable) {
        if(filmCopiesAvailable<filmCopies)
            this.filmCopiesAvailable = filmCopiesAvailable;
    }

    @Override
    public String toString() {
        return "Film{" + "filmId=" + filmId + ", filmName=" + filmName + ", filmDirector=" + filmDirector + ", filmHero=" + filmHero + ", filmType=" + filmType + ", filmShelf=" + filmShelf + ", filmCopies=" + filmCopies + ", filmCopiesAvailable=" + filmCopiesAvailable + '}';
    }
    
    
    
    
}
