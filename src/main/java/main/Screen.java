package main;

import javax.swing.JButton;
import enums.Notes;

public class Screen extends javax.swing.JFrame {
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
        setSize(600, 400);
    }

    private void initComponents() {
        int btnWidth = 60;
        int btnHeight = 150;
        int initialX = 10;
        int initialY = 10;

        for (Notes nota : Notes.values()) {
            JButton btnNote = new JButton(nota.getNameString());
            btnNote.setBounds(initialX, initialY, btnWidth, btnHeight);
            initialX += 65;

            btnNote.addActionListener(new java.awt.event.ActionListener() {

                @Override
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    musicPlayer.playNote(nota);
                }
            });

            this.add(btnNote);
        }

        this.setLayout(null);

    }

}