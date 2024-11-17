package main;

import java.util.Random;

import org.jfugue.player.Player;

public class MusicPlayer {
    private Player player = new Player();
    private String drawnNote;

    public void playNote(String note) {

        if (note == drawnNote) {
            System.out.println("Você acertou!");
            System.out.println("Nota tocada: " + note);
            System.out.println("Nota sorteada: " + drawnNote);
        } else {
            System.out.println("Você errou!");
        }
        
        player.play(note);
    }

    public String randomNote() {
        Random random = new Random();
        int indiceRandom = random.nextInt(Notes.list.length);
        player.play(Notes.list[indiceRandom]);
        return Notes.list[indiceRandom];
    }

}
