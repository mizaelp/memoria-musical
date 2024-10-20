package main;

import javax.swing.JButton;
import org.jfugue.player.Player;

public class Screen extends javax.swing.JFrame {
    Player player = new Player();

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Screen().setVisible(true);
            }
        });
    }

    public Screen() {
        initComponents();
        setTitle("Memória Musical");
        setSize(600, 400);

    }

    private void initComponents() {
        JButton btnDo = new javax.swing.JButton("Dó");
        JButton btnRe = new javax.swing.JButton("Ré");
        this.setLayout(null);
        btnDo.setBounds(250, 150, 100, 30);
        btnRe.setBounds(250, 200, 100, 30);
        this.add(btnDo);
        this.add(btnRe);

        btnDo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlay(evt, "C");
            }
        });

        btnRe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlay(evt, "D");
            }
        });
    }

    private void btnPlay(java.awt.event.ActionEvent evt, String note) {
        player.play(note);
        System.out.println("Nota tocada foi: " + note);
    }
}