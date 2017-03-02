package project1;

import java.awt.Color;
import java.awt.Dimension;
<<<<<<< HEAD
import java.awt.Font;
=======
>>>>>>> a8355c1ff6225dc002492c9259b2dbdfa870667d
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
<<<<<<< HEAD
import java.util.Random;

=======
>>>>>>> a8355c1ff6225dc002492c9259b2dbdfa870667d
import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
<<<<<<< HEAD
import javax.swing.border.Border;
=======
>>>>>>> a8355c1ff6225dc002492c9259b2dbdfa870667d

@SuppressWarnings("serial")
class FirstFrame extends JPanel implements ActionListener {

    private BufferedImage pic;
    private JButton search;
    private JButton creators;
    private JButton exit;
<<<<<<< HEAD
    private JButton nextPic;
    private JButton prevPic;
    private JFrame f;
    private String backgroundFilename;
    
=======
    private JFrame f;
    
    // method: FirstFrame
    // purpose: Default Constructor
>>>>>>> a8355c1ff6225dc002492c9259b2dbdfa870667d
    public FirstFrame(){
    }
    
    // method: FirstFrame
    // purpose: Constructor, initialize variables
    public FirstFrame(JFrame frame){
<<<<<<< HEAD
    	backgroundFilename = "starryNight.jpg";
        setBorder(BorderFactory.createLineBorder(Color.black));
        setBackground(Color.BLACK);
        pic = null;
        nextPic = new JButton(">");
        prevPic = new JButton("<");
        search = new JButton("Search DB");
        creators = new JButton("Creators");
        exit = new JButton("Exit");
        nextPic.addActionListener(this);
        prevPic.addActionListener(this);
=======
        setBorder(BorderFactory.createLineBorder(Color.black));
        setBackground(Color.BLACK);
        pic = null;
        search = new JButton("Search Database");
        creators = new JButton("Creators");
        exit = new JButton("Exit");
>>>>>>> a8355c1ff6225dc002492c9259b2dbdfa870667d
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
    
<<<<<<< HEAD
=======
    // method: getPrefferedSize
    // purpose: sets the default size of screen to 600x400
>>>>>>> a8355c1ff6225dc002492c9259b2dbdfa870667d
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(600,400);
    }
    
<<<<<<< HEAD
=======
    // method: paintComponent
    // purpose: draw everything to the screen
>>>>>>> a8355c1ff6225dc002492c9259b2dbdfa870667d
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        try{
<<<<<<< HEAD
            pic = ImageIO.read(new File(backgroundFilename));
//            pic = ImageIO.read(new File("articuno.png"));
        }catch(IOException e){System.out.println("failed");}
        g.drawImage(pic, 0, 0, 600, 400, this);
        
        Font arrowFont = new Font("Arial", Font.BOLD, 20);
        Font boldFont = new Font("Arial", Font.BOLD, 20);
        
        
//        nextPic.setForeground(Color.white);
//        nextPic.setBackground(Color.black);
        nextPic.setForeground(Color.white);
        nextPic.setBackground(Color.white);
        nextPic.setBorderPainted(true);
        nextPic.setBorder(BorderFactory.createLineBorder(Color.white, 3));
        nextPic.setOpaque(false);
        nextPic.setContentAreaFilled(false);
        nextPic.setBounds(530, 150, 50, 100);
        nextPic.setFont(arrowFont);
        nextPic.setToolTipText("Click here is display the next picture");
        add(nextPic);

        prevPic.setForeground(Color.white);
        prevPic.setBackground(Color.white);
        prevPic.setBounds(20, 150, 50, 100);
        prevPic.setFont(arrowFont);
        prevPic.setOpaque(false);
        prevPic.setBorder(BorderFactory.createLineBorder(Color.white, 3));
        prevPic.setContentAreaFilled(false);
        prevPic.setToolTipText("Click here is display the next picture");
        add(prevPic);
        
        search.setForeground(Color.white);
        search.setBackground(Color.white);
        search.setBounds(170, 340, 140, 50);
        search.setToolTipText("Click Here To Search");
        search.setOpaque(false);
        search.setFont(boldFont);
        search.setBorder(BorderFactory.createLineBorder(Color.white, 3));
        add(search);
        
        creators.setForeground(Color.white);
        creators.setBackground(Color.white);
        creators.setBounds(310, 340, 140, 50);
        creators.setToolTipText("Click Here To See creators");
        creators.setOpaque(false);
        creators.setBorder(BorderFactory.createLineBorder(Color.white, 3));
        creators.setFont(boldFont);
        add(creators);
        
        exit.setForeground(Color.white);
        exit.setBackground(Color.white);
        exit.setBounds(450, 340, 140, 50);
        exit.setToolTipText("Click Here To exit");
        exit.setOpaque(false);
        exit.setFont(boldFont);
        exit.setBorder(BorderFactory.createLineBorder(Color.white, 3));
=======
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
>>>>>>> a8355c1ff6225dc002492c9259b2dbdfa870667d
        add(exit);
        
    }

    // method: actionPerformed
    // purpose: Get input from action events
        //according to each button press,
        //it will create different frame for it
    @Override
    public void actionPerformed(ActionEvent e) {       
<<<<<<< HEAD
    	
        if(e.getSource() == creators)
        {
            f.dispose();
            f = new JFrame("creators");
            f.add(new CreatorFrame(f));
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.pack();
            f.setVisible(true);
            f.setLocationRelativeTo(null);
=======
        f.dispose();
        if(e.getSource() == creators)
        {
            f = new JFrame("creators");
            f.add(new CreatorFrame(f));
>>>>>>> a8355c1ff6225dc002492c9259b2dbdfa870667d
        }
        else if(e.getSource() == exit)
        {
        	System.exit(0);
        }
<<<<<<< HEAD
        else if(e.getSource() == search)
        {
            f.dispose();
            f = new JFrame("Search");
            f.add(new SearchFrame(f));
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.pack();
            f.setVisible(true);
            f.setLocationRelativeTo(null);
        }
        else if(e.getSource() == prevPic)
        {
        	f.repaint();
        	System.out.println("TestPrev");
        	switchToNext(generateFilename());
        }
        else if(e.getSource() == nextPic)
        {
        	f.repaint();
        	System.out.println("TestNext");
        	switchToNext(generateFilename());
        }
        

        
    }
    public String generateFilename(){
    	String[] temp = {"starryNight.jpg","warpedTime.jpg"};    	
    	return temp[randInt(2,0)];
    }
    
    public void switchToNext(String s){
    	System.out.println(s);
    	backgroundFilename = s;
    }
    public int randInt(int high, int low){
    	Random rand = new Random();
    	return rand.nextInt(high) + low;
    }
=======
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
>>>>>>> a8355c1ff6225dc002492c9259b2dbdfa870667d
    
}
