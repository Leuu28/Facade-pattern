public class Main {
    public static void main(String[] args) {

        AudioSystem audio = new AudioSystem();
        VideoSystem video = new VideoSystem();
        MoviePlayer movie = new MoviePlayer();

        Cinema cinema = new Cinema(audio, movie, video);

        cinema.runMovie("Titanic");

        cinema.endMovie();
    }
}