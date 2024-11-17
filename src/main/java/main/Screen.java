package main;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GridLayout;

public class Screen extends javax.swing.JFrame {

    static Color btnBlack = new Color(0, 0, 0);
    static Color btnWhite = new Color(255, 255, 255);
    private JPanel panel = new JPanel(new GridLayout(1, Notes.list.length));
    private MusicPlayer musicPlayer;

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Screen().setVisible(true));
    }

    public Screen() {
        initScreen();
        createButtons();
        musicPlayer.randomNote();
    }

    private void initScreen() {
        setTitle("Memória Musical");
        add(panel);
        setLayout(new GridLayout(1, 1));
        setSize(795, 205);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void createButtons() {
        musicPlayer = new MusicPlayer();

        for (String note : Notes.list) {
            JButton btnNote = new JButton(note);
            btnNote.setBackground(note.contains("#") ? btnBlack : btnWhite);
            btnNote.setForeground(note.contains("#") ? btnWhite : btnBlack);
            btnNote.addActionListener(evt -> musicPlayer.playNote(note));
            panel.add(btnNote);
        }

    }

}