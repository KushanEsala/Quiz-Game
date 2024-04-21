package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ScienceQuiz extends JFrame implements ActionListener {
    
  
    
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
    
    ScienceQuiz(String name) {
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
        
       questions[0][0] = "What is the process by which plants make their food?";
        questions[0][1] = "Photosynthesis";
        questions[0][2] = "Respiration";
        questions[0][3] = "Transpiration";
        questions[0][4] = "Digestion";

        questions[1][0] = "Which planet is known as the 'Red Planet'?";
        questions[1][1] = "Mars";
        questions[1][2] = "Jupiter";
        questions[1][3] = "Venus";
        questions[1][4] = "Mercury";

        questions[2][0] = "What is the force that pulls objects towards the center of the Earth?";
        questions[2][1] = "Gravity";
        questions[2][2] = "Friction";
        questions[2][3] = "Magnetism";
        questions[2][4] = "Centrifugal force";

        questions[3][0] = "What is the boiling point of water in Celsius?";
        questions[3][1] = "100°C";
        questions[3][2] = "0°C";
        questions[3][3] = "-100°C";
        questions[3][4] = "212°C";

        questions[4][0] = "What is the smallest unit of matter?";
        questions[4][1] = "Atom";
        questions[4][2] = "Molecule";
        questions[4][3] = "Element";
        questions[4][4] = "Compound";

        questions[5][0] = "What is the process by which water vapor turns into liquid water?";
        questions[5][1] = "Condensation";
        questions[5][2] = "Evaporation";
        questions[5][3] = "Sublimation";
        questions[5][4] = "Precipitation";

        questions[6][0] = "What is the main function of the heart?";
        questions[6][1] = "Pumping blood";
        questions[6][2] = "Digesting food";
        questions[6][3] = "Producing hormones";
        questions[6][4] = "Filtering waste";

        questions[7][0] = "What is the process by which plants release water vapor into the atmosphere?";
        questions[7][1] = "Transpiration";
        questions[7][2] = "Photosynthesis";
        questions[7][3] = "Respiration";
        questions[7][4] = "Evaporation";

        questions[8][0] = "Which gas do plants use during photosynthesis?";
        questions[8][1] = "Carbon dioxide";
        questions[8][2] = "Oxygen";
        questions[8][3] = "Nitrogen";
        questions[8][4] = "Hydrogen";

        questions[9][0] = "What is the hardest natural substance on Earth?";
        questions[9][1] = "Diamond";
        questions[9][2] = "Graphite";
        questions[9][3] = "Quartz";
        questions[9][4] = "Steel";
        
        answers[0][1] = "JDB";
        answers[1][1] = "int";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "Heap memory";
        answers[5][1] = "Remote interface";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Bytecode is executed by JVM";
        
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

     ScienceQuiz(String name, String science) {
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
        new  ScienceQuiz("User");
    }
}