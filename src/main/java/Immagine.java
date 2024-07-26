package src.main.java;

public class Immagine extends ElementoMultimediale {
    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    public void diminuisciLuminosita() {
        if (luminosita > 0) luminosita--;
    }

    public void aumentaLuminosita() {
        luminosita++;
    }

    public void show() {
        System.out.println(getTitolo() + "*".repeat(luminosita));
    }
}

