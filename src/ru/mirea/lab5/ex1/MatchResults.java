package ru.mirea.lab5.ex1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MatchResults extends JFrame {
    private int milanScore = 0;
    private int madridScore = 0;
    private String lastScorer = "N/A";
    private String winner = "DRAW";

    public MatchResults() {
        JButton milanButton = new JButton("AC Milan");
        JButton madridButton = new JButton("Real Madrid");
        JLabel resultLabel = new JLabel("Result: 0 X 0");
        JLabel lastScorerLabel = new JLabel("Last Scorer: N/A");
        JLabel winnerLabel = new JLabel("Winner: DRAW");

        milanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                milanScore++;
                lastScorer = "AC Milan";
                updateLabels(resultLabel, lastScorerLabel, winnerLabel);
            }
        });

        madridButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                madridScore++;
                lastScorer = "Real Madrid";
                updateLabels(resultLabel, lastScorerLabel, winnerLabel);
            }
        });

        setLayout(new GridLayout(5, 1));
        add(milanButton);
        add(madridButton);
        add(resultLabel);
        add(lastScorerLabel);
        add(winnerLabel);
        setTitle("Match");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,600);
    }

    private void updateLabels(JLabel resultLabel, JLabel lastScorerLabel, JLabel winnerLabel) {
        resultLabel.setText("Result: " + milanScore + " X " + madridScore);
        lastScorerLabel.setText("Last Scorer: " + lastScorer);

        if (milanScore > madridScore) {
            winner = "AC Milan";
        } else if (milanScore < madridScore) {
            winner = "Real Madrid";
        } else {
            winner = "DRAW";
        }

        winnerLabel.setText("Winner: " + winner);
    }
}