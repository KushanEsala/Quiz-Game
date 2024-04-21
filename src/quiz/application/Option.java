package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Option extends JFrame implements ActionListener{

    String name;
    JButton science, mathematics, english, history;
    
    Option(String name) {
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel("Select Subjects for Quiz");
        heading.setBounds(200, 20, 400, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        science = new JButton("Science");
        science.setBounds(50, 100, 200, 30);
        science.setBackground(new Color(30, 144, 254));
        science.setForeground(Color.WHITE);
        science.addActionListener(this);
        add(science);
        
        mathematics = new JButton("Mathematics");
        mathematics.setBounds(50, 150, 200, 30);
        mathematics.setBackground(new Color(30, 144, 254));
        mathematics.setForeground(Color.WHITE);
        mathematics.addActionListener(this);
        add(mathematics);
        
        english = new JButton("English");
        english.setBounds(50, 200, 200, 30);
        english.setBackground(new Color(30, 144, 254));
        english.setForeground(Color.WHITE);
        english.addActionListener(this);
        add(english);
        
        history = new JButton("History");
        history.setBounds(50, 250, 200, 30);
        history.setBackground(new Color(30, 144, 254));
        history.setForeground(Color.WHITE);
        history.addActionListener(this);
        add(history);
        
        setSize(300, 350);
        setLocation(500, 200);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == science) {
            setVisible(false);
            new ScienceQuiz(name);
        } else if (ae.getSource() == mathematics) {
            setVisible(false);
            new MathematicsQuiz(name);
        } else if (ae.getSource() == english) {
            setVisible(false);
            new EnglishQuiz(name);
        } else if (ae.getSource() == history) {
            setVisible(false);
            new HistoryQuiz(name);
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Option("User");
        });
    }
}
