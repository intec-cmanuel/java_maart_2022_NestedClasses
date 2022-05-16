package be.intecbrussel.musicians;

public class MusicApp {
    public static void main(String[] args) {
        Musician jeanMozart = new Musician();
        jeanMozart.play();

        // for non static inner classes
//        Musician.Instrument instrument = jeanMozart.new Instrument();
        // for static inner classes
        Musician.Instrument instrument2 = new Musician.Instrument();

        Musician.InstrumentType type = Musician.InstrumentType.TRIANGLE;




        Musician musician = new Musician();
        musician.play();
        
    }
}
