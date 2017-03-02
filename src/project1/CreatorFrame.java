package project1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;


@SuppressWarnings("serial")
public class CreatorFrame extends JPanel implements ActionListener {


    private JButton back;
    private JFrame f;
    
    // method: ThirdFrame
    // purpose: Default Constructor
    public CreatorFrame() {
        setBorder(BorderFactory.createLineBorder(Color.black));
        back = new JButton("Back");
    }
    
    // method: ThirdFrame
    // purpose: Constructor, initialize variables
    public CreatorFrame(JFrame frame) {
        setBorder(BorderFactory.createLineBorder(Color.black));
        back = new JButton("Back");
        f = frame;
        
        Action showInfo = new AbstractAction(){
            public void actionPerformed(ActionEvent e) {
                 JOptionPane.showMessageDialog(null, "Reyhan Patia, 011370580\nMichael T Kries, 009862307\nMystic's Games, Summer 2016");
            }
        };
        this.getInputMap().put(KeyStroke.getKeyStroke("F1"), "showInfo");
        this.getActionMap().put("showInfo",showInfo);
        
        Action exitGame = new AbstractAction(){
            public void actionPerformed(ActionEvent e) {
                 System.exit(0);
            }
        };
        this.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "exitGame");
        this.getActionMap().put("exitGame",exitGame);
    }
    
    // method: getPrefferedSize
    // purpose: sets the default size of screen to 600x400
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(600,400);
    }
    
    // method: paintComponent
    // purpose: draw everything to the screen
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Font font = new Font("Arial", Font.BOLD, 28);
        Graphics2D g2 = (Graphics2D) g;
        g2.setFont(font);
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.black);
        g2.drawString("CREATORS", 235, 100);
        
        font = new Font("Arial", Font.BOLD, 20);
        g2.setFont(font);
        g2.setColor(Color.black);
        g2.drawString("Joshua Shinn", 180, 180);
        g2.drawString("Carlos Verdin", 180, 220);
        g2.drawString("Michael Kries", 180, 260);
        
        back.setBounds(10, 360, 65, 25);
        back.addActionListener(this);
        back.setToolTipText("Click to go back to the home page");
        add(back);
        
    }

    // method: actionPerformed
    // purpose: Get input from action events
    @Override
    public void actionPerformed(ActionEvent ae) {
        f.dispose();
        f = new JFrame("Home Screen");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new FirstFrame(f));
        f.pack();
        f.setVisible(true);
        f.setLocationRelativeTo(null);
    }
    
}
