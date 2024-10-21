package main;

import java.util.Random;

import org.jfugue.player.Player;

public class MusicPlayer {
    private Player player = new Player();

    public void playNote(String note) {
        System.out.println("Tocando a nota: " + note + " - " + takeNote());
        player.play(note);
    }

    private int takeNote() {
        Random random = new Random();
        int indiceRandom = random.nextInt(Notes.list.length);
        return indiceRandom;
    }
}
