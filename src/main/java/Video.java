package src.main.java;

public class Video extends ElementoMultimediale implements Riproducibile {
    private int durata;
    private int volume;
    private int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }

    public void abbassaVolume() {
        if (volume > 0) volume--;
    }

    public void alzaVolume() {
        volume++;
    }

    public void diminuisciLuminosita() {
        if (luminosita > 0) luminosita--;
    }

    public void aumentaLuminosita() {
        luminosita++;
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(getTitolo() + "!".repeat(volume) + "*".repeat(luminosita));
        }
    }

    @Override
    public int getDurata() {
        return durata;
    }
}

