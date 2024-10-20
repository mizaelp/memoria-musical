package main;

import org.jfugue.player.Player;

public class MusicPlayer {
    private Player player = new Player();

    public void playNote(String note) {
        System.out.println("Tocando a nota: " + note);
        player.play(note);
    }
}
