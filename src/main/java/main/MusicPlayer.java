package main;

import org.jfugue.player.Player;
import enums.Notes;

public class MusicPlayer {
    private Player player = new Player();

    public void playNote(Notes note) {
        System.out.println("Tocando a nota: " + note.name());
        player.play(note.name());
    }
}
