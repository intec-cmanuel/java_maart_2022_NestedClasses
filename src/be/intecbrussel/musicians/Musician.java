package be.intecbrussel.musicians;

public class Musician {
    private String name;

    public enum InstrumentType {
        VIOLIN, GUITAR, TRIANGLE
    }

    public static class Instrument {
        public void makeSound() {
            System.out.println(" plays the trumpet*trumpet noises*");
        }
    }

    public void play() {
        Instrument instrument = new Instrument();
        instrument.makeSound();
    }
}
