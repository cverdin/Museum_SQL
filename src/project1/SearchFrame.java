package project1;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.KeyStroke;


@SuppressWarnings("serial")
public class SearchFrame extends JPanel implements ActionListener {

    private JFrame f;
    private JFrame results;
    private JButton exit;
    
    public SearchFrame(){
    }
    
    public SearchFrame(JFrame frame){
        setBorder(BorderFactory.createLineBorder(Color.black));
        setBackground(Color.BLACK);
        f=frame;
        exit = new JButton("Give Up");
        exit.setToolTipText("Click to give up and skip this game");
        exit.addActionListener(this);

        Action exitGame = new AbstractAction(){
            public void actionPerformed(ActionEvent e) {
                 System.exit(0);
            }
        };
        
        this.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), "exitGame");

        this.getActionMap().put("exitGame",exitGame);
    }
    
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(600,400);
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
          
        exit.setForeground(Color.blue);
        exit.setBackground(Color.black);
        exit.setBounds(430, 130, 80, 40);
        add(exit);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==exit&&exit.isEnabled()){
            exit.setEnabled(false);
            exitGame();
        }
    }
    @SuppressWarnings("unused")
	private void search(){
    	results = new JFrame("Results");
    	results.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    private void exitGame(){
        f.dispose();
        f = new JFrame("Main");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new FirstFrame(f));
        f.pack();
        f.setVisible(true);
        f.setLocationRelativeTo(null);//center the frame
    }
   
    
}

