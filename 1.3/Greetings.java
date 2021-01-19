/**
 * ICS4UR Computer Science, 12
 * Brampton, Canada
 *
 * https://github.com/SamAssareymuriyil
 * https://repl.it/@SamTheMan/
 *
 * modified     20201008
 * date         20201008
 * @filename    Greetings.java
 * @author      Sam Assareymuriyil
 * @version     1.0
 * @see         Greetings program Assignment 1.3
 */

// package Greetings;

import javax.swing.*;
import java.awt.*;

public class Greetings extends JFrame {

    public Greetings () {
        super ("Salutations Sire!");
        getContentPane().setBackground(new Color(255,69,0));
        setSize(500,280);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        Font font = new Font("Century Gothic", Font.BOLD, 20);
        JTextArea textArea = new JTextArea("Name: Sam Assareymuriyil\nSchool: North Park Secondary School\nFavourite Music: UK drill or slow jazz\nFavourite TV Show: How I Met Your Mother\nFavourite Color: This shade of orange\nFavourite Instrument/s: Guitar/Bass\nFavourite Animated Movie: Ratatouille\nFavourite Video Game: Rocket League\n# of Siblings: 1");
        textArea.setFont(font);
        textArea.setEditable(false);
        textArea.setForeground(Color.BLACK);
        textArea.setBackground(new Color(255,69,0));
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        add(textArea);
        setVisible(true);
        System.out.println("loaded");
    }

    public static void main(String[] args) {
        Greetings gs = new Greetings();
    }
}
