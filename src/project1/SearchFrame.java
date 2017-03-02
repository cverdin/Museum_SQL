package project1;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.KeyStroke;


@SuppressWarnings("serial")
public class SearchFrame extends JPanel implements ActionListener {

    private JFrame f;
    private JFrame results;
    private JButton exit;
    private JButton search;    
    private JLabel nameLabel;
    private JLabel epochLabel;
    private JLabel artistLabel;
    private JLabel locationLabel;
    private JLabel dateLabel;
    private JTextField name;
    private JTextField epoch;
    private JTextField artist;
    private JTextField location;
    private JTextField date;
    private JCheckBox permanentCollection;
    private JCheckBox borrowed;
    private JCheckBox ongoingExhibition;
    
    public SearchFrame(){
    }
    
    public SearchFrame(JFrame frame){
    	
    	nameLabel = new JLabel("Name: ");
    	epochLabel = new JLabel("Epoch: ");
    	artistLabel = new JLabel("Artist: ");
    	locationLabel = new JLabel("Location: ");
    	dateLabel = new JLabel("Date: ");
    	
    	name = new JTextField("");
    	epoch = new JTextField("");
    	artist = new JTextField("");
    	location = new JTextField("");
    	date = new JTextField("");
    	permanentCollection = new JCheckBox("Permanent Collection?");
    	borrowed = new JCheckBox("Borrowed?");
    	ongoingExhibition = new JCheckBox("Ongoing Exhibition?");
    	
    	name.addActionListener(this);
    	epoch.addActionListener(this);
    	artist.addActionListener(this);
    	location.addActionListener(this);
    	date.addActionListener(this);
    	permanentCollection.addActionListener(this);
    	borrowed.addActionListener(this);
    	ongoingExhibition.addActionListener(this);
    	
    	
        setBorder(BorderFactory.createLineBorder(Color.black));
        setBackground(Color.BLACK);
        f=frame;
        exit = new JButton("Back");
        exit.setToolTipText("Click to go back to main menu");
        exit.addActionListener(this);

        search = new JButton("Search");
        search.setToolTipText("Click to Search");
        search.addActionListener(this);

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
        exit.setBounds(510, 330, 80, 40);
        add(exit);
        
        search.setForeground(Color.blue);
        search.setBackground(Color.black);
        search.setBounds(430, 330, 80, 40);
        add(search);
        
        name.setBounds(10,10,150,20);
        add(name);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    	String nameText = "";
    	String epochText = "";
    	String artistText = "";
    	String locationText = "";
    	String dateText = "";
    	boolean permanentCollectionBool = false;
    	boolean borrowedBool = false;
    	boolean ongoingExhibitionBool = false;
    	
    	
    	if(e.getSource()==exit&&exit.isEnabled()){
            exit.setEnabled(false);
            exitGame();
        }
        else if(e.getSource() == search && search.isEnabled()){
        	nameText = name.getText();
        	epochText = epoch.getText();
        	artistText = artist.getText();
        	locationText = location.getText();
        	dateText = date.getText();
        	permanentCollectionBool = permanentCollection.isSelected();
        	borrowedBool = borrowed.isSelected();
        	ongoingExhibitionBool = ongoingExhibition.isSelected();
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

