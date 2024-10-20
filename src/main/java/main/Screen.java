package main;

import javax.swing.JButton;
import java.awt.Color;

public class Screen extends javax.swing.JFrame {

    static String Notes[] = { "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B" };
    int btnWidth = 60;
    int btnHeightWhite = 150;
    int btnHeightBlack = 120;
    int initialX = 10;
    int initialY = 10;
    int increment = 65;

    Color btnBlack = new Color(0, 0, 0);
    Color btnWhite = new Color(255, 255, 255);

    private MusicPlayer musicPlayer;

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen().setVisible(true);
            }
        });
    }

    public Screen() {

        musicPlayer = new MusicPlayer();

        initComponents();
        setTitle("Memória Musical");
        setSize(795, 205);
    }

    private void initComponents() {

        for (String note : Notes) {
            JButton btnNote = new JButton(note);

            if (note.contains("#")) {
                btnNote.setBackground(btnBlack);
                btnNote.setForeground(btnWhite);
                btnNote.setBounds(initialX, initialY, btnWidth, btnHeightBlack);
            } else {
                btnNote.setBackground(btnWhite);
                btnNote.setForeground(btnBlack);
                btnNote.setBounds(initialX, initialY, btnWidth, btnHeightWhite);
            }

            initialX += increment;

            btnNote.addActionListener(new java.awt.event.ActionListener() {

                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    musicPlayer.playNote(note);
                }
            });

            this.add(btnNote);
        }

        this.setLayout(null);

    }

}