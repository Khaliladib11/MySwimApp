
package mini.project.java;


public class Rent {
    private int rentId;
    private int filmId;
    private int clientId;
    private int duration;
    private final double cost=0.5;

    
    public Rent(){}
    public Rent(int rentId, int filmId, int clientId, int duration) {
        this.rentId = rentId;
        this.filmId = filmId;
        this.clientId = clientId;
        this.duration = duration;
    }

    public int getRentId() {
        return rentId;
    }

    public void setRentId(int rentId) {
        this.rentId = rentId;
    }

    public int getFilmId() {
        return filmId;
    }

    public void setFilmId(int filmId) {
        this.filmId = filmId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Rent{" + "rentId=" + rentId + ", filmId=" + filmId + ", clientId=" + clientId + ", duration=" + duration + ", cost=" + cost + '}';
    }
    
    
    
}
