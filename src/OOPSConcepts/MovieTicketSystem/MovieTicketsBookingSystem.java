package OOPSConcepts.MovieTicketSystem;
import java.util.ArrayList;

class MovieException extends Exception{
    MovieException(String message){
        super(message);
    }
}

class Movie{
    private String title;
    private String genre;
    private String duration;

    Movie(String title,String genre,String duration){
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }

    public String getTitle(){
        return title;
    }

    public String getDetails(){
        return "# " + title + " - " + genre + " - " + duration + " minutes";
    }
}

class Theatre{
    private String name;
    private String location;
    ArrayList<Movie> moviesAvailable;

    Theatre(String name,String location){
        this.name = name;
        this.location = location;
        moviesAvailable = new ArrayList<>();
    }

    public void addMovie(Movie movie){
        moviesAvailable.add(movie);
    }

    public void removeMovie(String title) throws MovieException{
        Movie existMovie = null;
        for(Movie movie : moviesAvailable){
            if(movie.getTitle().equalsIgnoreCase(title)){
                existMovie = movie;
                break;
            }
        }
        if(existMovie == null){
            throw new MovieException("Error: movie doesn't exist");
        }
        moviesAvailable.remove(existMovie);
    }

    public boolean isAvailable(Movie movie){
        for(Movie m: moviesAvailable){
            if(m.getTitle().equalsIgnoreCase(movie.getTitle())){
                return true;
            }
        }
        return false;
    }
}

class User{
    private String name;
    private String email;
    private String phoneNumber;

    User(String name,String email,String phoneNumber){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getUserDetails(){
        return "Name: " + name + " Email: " + email+ " PhoneNumber: " + phoneNumber;
    }
}

interface IBookable{
    public void confirmBooking() throws MovieException;
    public void cancelBooking() throws MovieException;
}

class Booking implements IBookable{

    private User user;
    private Movie movie;
    private Theatre theatre;
    private String seatNumber;
    private String showTime;
    private boolean isConfirmed;

    Booking(User user,Movie movie,Theatre theatre,String seatNumber,String showTime){
        this.user = user;
        this.movie = movie;
        this.theatre = theatre;
        this.seatNumber = seatNumber;
        this.showTime = showTime;
        this.isConfirmed = false;
    }

    public void confirmBooking() throws MovieException{
        if(!theatre.isAvailable(movie)){
            throw new MovieException(movie.getTitle() + " is not available in theatre");
        }
        isConfirmed = true;
        System.out.println(movie.getTitle() + " Booked successfully!");
    }
    public void cancelBooking() throws MovieException{
        if(!isConfirmed){
            throw new MovieException("No active booking found.");
        }
        isConfirmed = false;
        System.out.println(movie.getTitle() + " Booking cancel successfully!");
    }
}

public class MovieTicketsBookingSystem {
    public static void main(String args[]){
        User kishan = new User("kishan","kareliyakishan007@gmail.com","9999999999");

        Movie jawan = new Movie("Jawan","action","1:45");
        Movie idiots = new Movie("3 idiots","comedy","2:56");

        Theatre pvr = new Theatre("PVR cinema","ahmedabad");
        Theatre rajhans = new Theatre("Rajhans Cinema","mumbai");
        pvr.addMovie(jawan);
        pvr.addMovie(idiots);

        Booking jawanBooking = new Booking(kishan,jawan,pvr,"B5-B8","2:35PM");
        Booking idiotBooking = new Booking(kishan,idiots,rajhans,"A4-A9","11:20PM");

        try {
            jawanBooking.confirmBooking();
            idiotBooking.confirmBooking();
        }catch (MovieException e){
            System.out.println(e.getMessage());
        }
    }
}
