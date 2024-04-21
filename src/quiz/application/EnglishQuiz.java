package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EnglishQuiz extends JFrame implements ActionListener {
    
  
    
    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String useranswers[][] = new String[10][1];
    JLabel qno, question;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup groupoptions;
    JButton next, submit, lifeline;
    
    public static int timer = 15;
    public static int ans_given = 0;
    public static int count = 0;
    public static int score = 0;
    
    String name;
    
  EnglishQuiz(String name) {
        this.name = name;
        setBounds(50, 0, 1440, 850);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1440, 392);
        add(image);
        
        qno = new JLabel();
        qno.setBounds(100, 450, 50, 30);
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(qno);
        
        question = new JLabel();
        question.setBounds(150, 450, 900, 30);
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(question);

           questions[0][0] = "What is the meaning of 'altruistic'?";
           questions[0][1] = "Selfless";
           questions[0][2] = "Greedy";
           questions[0][3] = "Ambitious";
           questions[0][4] = "Generous";

           questions[1][0] = "Which word means 'a written account of someone's life'?";
           questions[1][1] = "Biography";
           questions[1][2] = "Fiction";
           questions[1][3] = "Novel";
           questions[1][4] = "Diary";

           questions[2][0] = "What literary device is used in 'She sells seashells by the seashore'?";
           questions[2][1] = "Alliteration";
           questions[2][2] = "Metaphor";
           questions[2][3] = "Simile";
           questions[2][4] = "Hyperbole";

           questions[3][0] = "Which of the following is a synonym for 'verbose'?";
           questions[3][1] = "Wordy";
           questions[3][2] = "Concise";
           questions[3][3] = "Brevity";
           questions[3][4] = "Laconic";

           questions[4][0] = "What is the opposite of 'abundant'?";
           questions[4][1] = "Scant";
           questions[4][2] = "Plentiful";
           questions[4][3] = "Ample";
           questions[4][4] = "Copious";

           questions[5][0] = "Which word means 'a feeling of worry, nervousness, or unease about something with an uncertain outcome'?";
           questions[5][1] = "Anxiety";
           questions[5][2] = "Joy";
           questions[5][3] = "Excitement";
           questions[5][4] = "Contentment";

           questions[6][0] = "Who was the founder of the Mongol Empire?";
           questions[6][1] = "Genghis Khan";
           questions[6][2] = "Kublai Khan";
           questions[6][3] = "Attila the Hun";
           questions[6][4] = "Tamerlane";

           questions[7][0] = "Which civilization developed the first system of writing known as cuneiform?";
           questions[7][1] = "Sumerians";
           questions[7][2] = "Indus Valley Civilization";
           questions[7][3] = "Ancient Egyptians";
           questions[7][4] = "Mayans";

           questions[8][0] = "Who was the principal author of the Declaration of Independence?";
           questions[8][1] = "Thomas Jefferson";
           questions[8][2] = "George Washington";
           questions[8][3] = "John Adams";
           questions[8][4] = "Benjamin Franklin";

           questions[9][0] = "What was the name of the ship on which Charles Darwin sailed during his voyage?";
           questions[9][1] = "HMS Beagle";
           questions[9][2] = "HMS Victory";
           questions[9][3] = "HMS Endeavour";
           questions[9][4] = "HMS Discovery";

           answers[0][1] = "Selfless";
           answers[1][1] = "Biography";
           answers[2][1] = "Alliteration";
           answers[3][1] = "Wordy";
           answers[4][1] = "Scant";
           answers[5][1] = "Anxiety";
           answers[6][1] = "Genghis Khan";
           answers[7][1] = "Sumerians";
           answers[8][1] = "Thomas Jefferson";
           answers[9][1] = "HMS Beagle";


         
        opt1 = new JRadioButton();
        opt1.setBounds(170, 520, 700, 30);
        opt1.setBackground(Color.WHITE);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt1);
        
        opt2 = new JRadioButton();
        opt2.setBounds(170, 560, 700, 30);
        opt2.setBackground(Color.WHITE);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt2);
        
        opt3 = new JRadioButton();
        opt3.setBounds(170, 600, 700, 30);
        opt3.setBackground(Color.WHITE);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt3);
        
        opt4 = new JRadioButton();
        opt4.setBounds(170, 640, 700, 30);
        opt4.setBackground(Color.WHITE);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        add(opt4);
        
        groupoptions = new ButtonGroup();
        groupoptions.add(opt1);
        groupoptions.add(opt2);
        groupoptions.add(opt3);
        groupoptions.add(opt4);
        
        next = new JButton("Next");
        next.setBounds(1100, 550, 200, 40);
        next.setFont(new Font("Tahoma", Font.PLAIN, 22));
        next.setBackground(new Color(30, 144, 255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        
        
        
        submit = new JButton("Submit");
        submit.setBounds(1100, 630, 200, 40);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);
        
        start(count);
        
        setVisible(true);
    }

     EnglishQuiz (String name, String science) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            ans_given = 1;
            if (groupoptions.getSelection() == null) {
               useranswers[count][0] = "";
            } else {
                useranswers[count][0] = groupoptions.getSelection().getActionCommand();
            }
            
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            
            count++;
start(count);
} else if (ae.getSource() == lifeline) {
    if (count == 2 || count == 4 || count == 6 || count == 8 || count == 9) {
        opt2.setEnabled(false);
        opt3.setEnabled(false);
    } else {
        opt1.setEnabled(false);
        opt4.setEnabled(false);
    }
    lifeline.setEnabled(false);
} else if (ae.getSource() == submit) {
    ans_given = 1;
    if (groupoptions.getSelection() == null) {
        useranswers[count][0] = "";
    } else {
        useranswers[count][0] = groupoptions.getSelection().getActionCommand();
    }

    for (int i = 0; i < useranswers.length; i++) {
        if (useranswers[i][0].equals(answers[i][1])) {
            score += 10;
        } else {
            score += 0;
        }
    }
    setVisible(false);
    new Score(name, score);
}

    }
    
    public void paint(Graphics g) {
        super.paint(g);
        
        String time = "Time left - " + timer + " seconds"; // 15
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 25));
        
        if (timer > 0) { 
            g.drawString(time, 1100, 500);
        } else {
            g.drawString("Times up!!", 1100, 500);
        }
        
        timer--; // 14
        
        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        if (ans_given == 1) {
            ans_given = 0;
            timer = 15;
        } else if (timer < 0) {
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9) { // submit button
                if (groupoptions.getSelection() == null) {
                   useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                
                for (int i = 0; i < useranswers.length; i++) {
                    if (useranswers[i][0].equals(answers[i][1])) {
                        score += 10;
                    } else {
                        score += 0;
                    }
                }
                setVisible(false);
                new Score(name, score);
            } else { // next button
                if (groupoptions.getSelection() == null) {
                   useranswers[count][0] = "";
                } else {
                    useranswers[count][0] = groupoptions.getSelection().getActionCommand();
                }
                count++; // 0 // 1
                start(count);
            }
        }
        
    }
    
    public void start(int count) {
        qno.setText("" + (count + 1) + ". ");
        question.setText(questions[count][0]);
        opt1.setText(questions[count][1]);
        opt1.setActionCommand(questions[count][1]);
        
        opt2.setText(questions[count][2]);
        opt2.setActionCommand(questions[count][2]);
        
        opt3.setText(questions[count][3]);
        opt3.setActionCommand(questions[count][3]);
        
        opt4.setText(questions[count][4]);
        opt4.setActionCommand(questions[count][4]);
        
        groupoptions.clearSelection();
    }
    
    public static void main(String[] args) {
        new EnglishQuiz ("User");
    }
}