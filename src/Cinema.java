public class Cinema {
    private AudioSystem a;
    private MoviePlayer m;
    private VideoSystem v;

    public Cinema(AudioSystem a, MoviePlayer m, VideoSystem v){
        this.a = a;
        this.m = m;
        this.v = v;
    }

    public void runMovie(String movie){
        System.out.println("Preparazione alla visione del film...");
        v.on();
        v.setSource("Movie Player");
        a.on();
        a.setVolume(70);
        m.on();
        m.playMovie(movie);
        System.out.println("Inizio film...");
    }

    public void endMovie(){
        System.out.println("Spegnimento sistema...");
        m.off();
        a.off();
        v.off();
        System.out.println("Sistema spento.");
    }
}
