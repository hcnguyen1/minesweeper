import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class minesweeper {

    public static void main(String[] args) {
        Windows();
    }
    public static void Windows() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        
        // Creating a Minesweeper Window
        int width = 1600;
        int length = 900;
        frame.setBackground(Color.black);
        frame.setSize(width, length);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Minesweeper");
        frame.setResizable(false);
        frame.setVisible(true);
        frame.add(panel, BorderLayout.CENTER); // Adding UI into Windows

        // Creating UI
        panel.setBackground(Color.GRAY);
        
        // Difficulty Settings
        JButton button = new JButton("Easy");
        JButton button1 = new JButton("Medium");
        JButton button2 = new JButton("Hard");

        button.setBounds(width/8, length/9, 250, 100); // w, l, w, l
        panel.add(button);
        button1.setBounds(width/8, length/9+250, 250, 100);
        panel.add(button1);
        button2.setBounds(width/8, length/9+500, 250, 100);
        panel.add(button2);
    }
    
}