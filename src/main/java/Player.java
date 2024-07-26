package src.main.java;

import java.util.Scanner;

public class Player {
    private static ElementoMultimediale[] elementi = new ElementoMultimediale[3];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creazione degli elementi multimediali
        for (int i = 0; i < 3; i++) {
            System.out.println("Inserisci il tipo di elemento (audio, video, immagine):");
            String tipo = scanner.nextLine();
            System.out.println("Inserisci il titolo:");
            String titolo = scanner.nextLine();

            switch (tipo.toLowerCase()) {
                case "audio":
                    System.out.println("Inserisci la durata:");
                    int durataAudio = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci il volume:");
                    int volumeAudio = Integer.parseInt(scanner.nextLine());
                    elementi[i] = new Audio(titolo, durataAudio, volumeAudio);
                    break;
                case "video":
                    System.out.println("Inserisci la durata:");
                    int durataVideo = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci il volume:");
                    int volumeVideo = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci la luminosità:");
                    int luminositaVideo = Integer.parseInt(scanner.nextLine());
                    elementi[i] = new Video(titolo, durataVideo, volumeVideo, luminositaVideo);
                    break;
                case "immagine":
                    System.out.println("Inserisci la luminosità:");
                    int luminositaImmagine = Integer.parseInt(scanner.nextLine());
                    elementi[i] = new Immagine(titolo, luminositaImmagine);
                    break;
                default:
                    System.out.println("Tipo non valido, riprova.");
                    i--;
                    break;
            }
        }

        // Interazione con l'utente per eseguire gli elementi
        while (true) {
            System.out.println("Quale elemento vuoi eseguire? (1-3, 0 per terminare):");
            int scelta = Integer.parseInt(scanner.nextLine());
            if (scelta == 0) {
                break;
            } else if (scelta >= 1 && scelta <= 3) {
                ElementoMultimediale elemento = elementi[scelta - 1];
                if (elemento instanceof Riproducibile) {
                    ((Riproducibile) elemento).play();
                } else if (elemento instanceof Immagine) {
                    ((Immagine) elemento).show();
                }
            } else {
                System.out.println("Scelta non valida, riprova.");
            }
        }

        scanner.close();
    }
}

