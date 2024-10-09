public class Main {
    public static void main(String[] args) {
        Musician music = new Musician();
        Piano piano = new Piano();
        Guitar guitar = new Guitar();
        Flute flute = new Flute();

        music.play(piano);
        music.play(guitar);
        music.play(flute);
    }
}