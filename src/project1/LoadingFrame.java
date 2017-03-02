package project1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

@SuppressWarnings("serial")
public class LoadingFrame extends JPanel{

    private BufferedImage pic;

    // method: LoadingFrame
    // purpose: Default Constructor
    public LoadingFrame(){
        setBorder(BorderFactory.createLineBorder(Color.black));
        setBackground(Color.BLACK);
        pic = null;
        
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

        //paint the background picture
        try{
            pic = ImageIO.read(new File("MonaLisa.png"));
        }catch(IOException e){System.out.println("failed");}
        g.drawImage(pic,0, 0, 600, 400, this);

<<<<<<< HEAD
=======
        //paint HANGMAN to the screen
>>>>>>> a8355c1ff6225dc002492c9259b2dbdfa870667d
        Font font = new Font("Arial", Font.BOLD, 60);
        Graphics2D g2 = (Graphics2D) g;
        g2.setFont(font);
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.white);
        g2.drawString("Where Art Thou", 75, 50);

<<<<<<< HEAD
=======
        //paint LOADING to the screen
>>>>>>> a8355c1ff6225dc002492c9259b2dbdfa870667d
        font = new Font("Arial", Font.BOLD, 30);
        g2.setFont(font);
        g2.setColor(Color.white);
        g2.drawString("LOADING...", 220, 320);

<<<<<<< HEAD
=======
        //paint Team Mystic to the screen
>>>>>>> a8355c1ff6225dc002492c9259b2dbdfa870667d
        font = new Font("Arial", Font.BOLD, 20);
        g2.setFont(font);
        g2.setColor(Color.white);
        g2.drawString("Josh, Carlos, Mike", 300, 370);
    }
}
