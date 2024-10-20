package main;
import org.jfugue.player.Player;

public class Screen extends javax.swing.JFrame {
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen().setVisible(true);
                Player player = new Player();
                player.play("C D E F G A B");
            }
        });
    }

    public Screen() {
        setTitle("Memória Musical");
        setSize(400,300);
    }
}