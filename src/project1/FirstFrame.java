package project1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

@SuppressWarnings("serial")
class FirstFrame extends JPanel implements ActionListener {

    private BufferedImage pic;
    private JButton search;
    private JButton creators;
    private JButton exit;
    private JFrame f;
    
    // method: FirstFrame
    // purpose: Default Constructor
    public FirstFrame(){
    }
    
    // method: FirstFrame
    // purpose: Constructor, initialize variables
    public FirstFrame(JFrame frame){
        setBorder(BorderFactory.createLineBorder(Color.black));
        setBackground(Color.BLACK);
        pic = null;
        search = new JButton("Search Database");
        creators = new JButton("Creators");
        exit = new JButton("Exit");
        search.addActionListener(this);
        creators.addActionListener(this);
        exit.addActionListener(this);
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
        try{
            pic = ImageIO.read(new File("articuno.png"));
        }catch(IOException e){System.out.println("failed");}
        g.drawImage(pic,50, 50, 300, 300, this);
      
        search.setForeground(Color.white);
        search.setBackground(Color.black);
        search.setBounds(450, 200, 140, 50);
        search.setToolTipText("Click Here To Play");
        add(search);
        
        creators.setForeground(Color.white);
        creators.setBackground(Color.black);
        creators.setBounds(450, 260, 140, 50);
        creators.setToolTipText("Click Here To See creators");
        add(creators);
        
        exit.setForeground(Color.white);
        exit.setBackground(Color.black);
        exit.setBounds(450, 320, 140, 50);
        exit.setToolTipText("Click Here To exit");
        add(exit);
        
    }

    // method: actionPerformed
    // purpose: Get input from action events
        //according to each button press,
        //it will create different frame for it
    @Override
    public void actionPerformed(ActionEvent e) {       
        f.dispose();
        if(e.getSource() == creators)
        {
            f = new JFrame("creators");
            f.add(new CreatorFrame(f));
        }
        else if(e.getSource() == exit)
        {
        	System.exit(0);
        }
        else
        {
            f = new JFrame("Search");
            f.add(new SearchFrame(f));
            //NOTE: CHANGED TO SEVENTHFRAME FOR TESTING!! UNCOMMENT LINE ABOVE
            //AND DELETE LINE BELOW TO SET BACK TO NORMAL
            
        }
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        
    }
    
}
