package main;

import javax.swing.JButton;

public class Screen extends javax.swing.JFrame {

    static String listOfNotes[] = { "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B" };
    int btnWidth = 60;
    int btnHeight = 150;
    int initialX = 10;
    int initialY = 10;

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
        setSize((btnWidth * listOfNotes.length) + (initialX * 2), btnHeight + initialY);
    }

    private void initComponents() {

        for (String oneNote : listOfNotes) {
            JButton btnNote = new JButton(oneNote);
            btnNote.setBounds(initialX, initialY, btnWidth, btnHeight);
            initialX += 65;

            btnNote.addActionListener(new java.awt.event.ActionListener() {

                @Override
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    musicPlayer.playNote(oneNote);
                }
            });

            this.add(btnNote);
        }

        this.setLayout(null);

    }

}